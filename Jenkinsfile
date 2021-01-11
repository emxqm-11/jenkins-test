pipeline {
    agent any

    tools {
        jdk 'jdk11'
        maven 'maven3'
    }
    options { disableConcurrentBuilds() }
    stages {
        stage('mvn clean') {
            steps {
                echo 'Hello, Maven'
                sh 'ls'
                sh 'mvn clean compile' 
            }
        }
        stage('run mvn wrapper') {
            steps {
                sh './mvnw clean compile'
            }
        }
    }
}