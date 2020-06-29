pipelineJob("gh_app_demo") {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/Nouman72884/gh_app_demo.git")
            credentials("github-credentials")
          }
          branch('master')
        }
      }
      scriptPath("jenkinsfile")
    }
  }
}
