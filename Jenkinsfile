
pipeline {
    agent any

    tools {
        jdk 'jdk8'
        maven 'maven3'
    }

    stages {
        stage('mvn java test') {
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
        stage('run mvn wrapper') {
            steps {
                sh './mvnw clean'
            }
        }
    }
}