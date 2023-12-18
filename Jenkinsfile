pipeline {
    agent any

    stages {

        stage('Build and Test') {
            steps {
                git branch: 'main', url: 'https://github.com/yahuhen/jenkins_junit4_demo.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean test"
            }
        }

        stage('Test Results') {

            steps {
                echo 'Run completed after script block'
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}