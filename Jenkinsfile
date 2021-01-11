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
                ls 
            }
        }
        stage('run mvn wrapper') {
            steps {
                ./mvnw clean
            }
        }
    }
}