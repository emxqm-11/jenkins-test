pipeline {
    agent any

    tools {
        jdk 'jdk8'
        maven 'maven3'
    }
    options { disableConcurrentBuilds() }
    stages {
        stage('mvn clean') {
            steps {
              node(null){
                echo 'Hello, Maven'
                sh 'ls'
                sh 'mvn clean compile' 
              }
            }
        }
        stage('run mvn wrapper') {
            steps {
              node(null) {
                sh './mvnw clean compile'
              }
            }
        }
    }
}