pipeline {
    agent any

    tools {
        jdk 'jdk8'
        maven 'maven3'
    }

    stages {
        stage('mvn java test') {
            node {
                echo 'Hello, Maven'
                sh 'ls' 
            }
        }
        stage('run mvn wrapper') {
            node {
                sh 'pwd'
            }
        }
    }
}