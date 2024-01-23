pipeline {
    agent any
    stages {
        stage(‘Build’) {
          steps {
            bat "/opt/apache-maven/bin/mvn clean package"
          }
      }
    }
}
