
pipeline {
    agent any

    tools {
        jdk 'jdk8'
        maven 'maven3'
    }

    stages {
        stage('install and sonar parallel') {
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }
}