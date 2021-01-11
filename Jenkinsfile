pipeline {
    agent any

    tools {
        jdk 'jdk8'
        maven 'maven3'
    }

    stages {
        stage('mvn java test') {
            steps {
              node{
                echo 'Hello, Maven'
                sh 'ls' 
              }
            }
        }
        stage('run mvn wrapper') {
            steps {
              node {
                sh 'pwd'
              }
            }
        }
    }
}