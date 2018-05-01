void call(Map args) {
    args = args ?: []

    final branch = args.branch
    final script = args.script

    assert branch: "branch is required"
    assert script: "script is required"

    script.stage("Checkout") {
        script.git(
            branch: branch,
            url: "https://github.com/crichmond1989/hellonetcore"
        )
    }

    script.stage("Packages") {
        script.sh("dotnet restore")
    }

    script.stage("Build") {
        script.sh("dotnet build")
    }

    script.stage("Test") {
        script.sh('dotnet test tests --logger "trx;LogFileName=TestResults.trx"')
        script.step([$class: "MSTestPublisher", testResultsFile: "tests/TestResults/TestResults.trx"])
    }
}

return this