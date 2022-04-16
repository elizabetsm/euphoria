pipeline {
    tools{
        jdk 'openjdk-11'
    }

    stages {
        stage('Start') {
            sh 'echo START!!!!'
        }
    }
}