
pipeline {
    agent any

    tools {
        jdk 'jdk8'
        maven 'maven3'
    }

    stages {
        stage('install and sonar parallel') {
            steps {
                parallel(install: {
                    sh "mvn clean test"
                }, sonar: {
                    sh "mvn sonar:sonar -Dsonar.host.url=${env.SONARQUBE_HOST}"
                })
            }
        }
    }
}