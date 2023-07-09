pipeline {
    agent any 
    stages {
        stage('load-jobs') {
            steps {
                jobDsl(targets: 'jobs/*.groovy')
            }
        }
    }
}
