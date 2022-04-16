pipeline {
    agent {
        label 'docker'
    }

    tools{
        jdk 'openjdk-11'
    }

    stages {
        stage('Start') {
            steps {
                sh 'echo START!!!!'
            }
        }
    }
}