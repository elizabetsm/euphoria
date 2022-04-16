pipeline {
    agent {
        label 'Liza'
    }

    stages {
        stage('Start') {
            steps {
                sh 'echo START!!!!'
            }
        }
    }
}