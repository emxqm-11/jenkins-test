pipeline {
    agent any

    tools {
        jdk 'jdk8'
        maven 'maven3'
    }

    stages {
        stage('checkout') {
            when { branch 'main' }
            steps {
                checkout scm
            }
        }
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