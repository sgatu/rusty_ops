pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                jobDsl(targets: 'jobs/*.groovy')
            }
        }
    }
}
