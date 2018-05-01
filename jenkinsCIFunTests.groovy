import groovy.lang.Script

@Library("testit")
import testit.FunTest

class JenkinsCIFunTests implements Serializable {
    Script script

    @FunTest
    void buildArtifactsExist() {
        final ciScript = script.load("jenkinsCI.groovy")

        script.deleteDir()

        ciScript(branch: "master", script: script)

        final appPath = "app/bin/Debug/netcoreapp2.0/hellonetcore.app.dll"
        final appExists = script.fileExists(appPath)

        assert appExists
    }
}

return this