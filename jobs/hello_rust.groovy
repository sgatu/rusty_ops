
pipelineJob('hello-rust') {
  description = 'Deploy hello-rust on eks cluster.'
  definition {
    cpsScm {
        git {
          remote {
            url('git@github.com:sgatu/hello_rust.git')
            credentials("${git_key_id}")
          }
          branch('*/main')
        }
        scriptPath('Jenkinsfile')
        lightweight()
      }
  }
}