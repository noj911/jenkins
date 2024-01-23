pipeline {
    agent any
    stages {
        stage(‘Build’) {
          steps {
            bat "/opt/apache-maven/bin/mvn clean package"
          }
      }
    }
    stages {
        stage(‘Test’) {
          steps {
            sh "/opt/apache-maven/bin/mvn test"
          }
      }
    }
}
