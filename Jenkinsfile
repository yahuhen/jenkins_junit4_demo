pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/yahuhen/jenkins_junit4_demo.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean test"
            }
        }

        stage('Test Results') {

            steps {

            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}