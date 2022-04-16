pipeline {
    agent {
        label 'docker'
    }

    tools{
        jdk 'openjdk-11'
    }

    stages {
        stage('Start') {
            sh 'echo START!!!!'
        }
    }
}