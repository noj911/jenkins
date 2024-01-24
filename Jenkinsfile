pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'C:\\JavaJEE\\apache-maven-3.9.5-bin\\apache-maven-3.9.5\\bin\\mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'C:\\JavaJEE\\apache-maven-3.9.5-bin\\apache-maven-3.9.5\\bin\\mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat 'docker build -t fatima/webservices .'
            }
        }
    }
}

