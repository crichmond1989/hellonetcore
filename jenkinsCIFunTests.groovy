import groovy.lang.Script

import testit.SuiteSetup
import testit.Test

class JenkinsCIFunTests implements Serializable {
    Script script

    @SuiteSetup
    void suiteSetup() {
        script.deleteDir()
        script.unstash("source")

        final ciScript = script.load("jenkinsCI.groovy")

        ciScript(branch: "master", script: script)
    }

    @Test
    void buildArtifactsExist() {
        final appPath = "app/bin/Debug/netcoreapp2.0/hellonetcore.app.dll"

        assert script.fileExists(appPath)
    }

    @Test
    void testResultsExist() {
        final resultsPath = "tests/TestResults/TestResults.trx"
        
        assert script.fileExists(resultsPath)
    }
}

return new JenkinsCIFunTests()