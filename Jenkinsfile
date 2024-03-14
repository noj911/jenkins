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
        stage('Deploy Docker image') {
            steps {
                bat 'docker build -t fatima07/webservices .'
            }
        }
        stage('Push image to hub') {
            steps {
                script{
                  withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpassword')]) {
                  sh 'docker login -u fatima07 -p ${dockerhubpassword}'
}
            }
        }
    }
    }
}

