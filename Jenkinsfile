pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Executing Gradle Build'
                withGradle() {
                    sh 'chmod +x ./gradlew'
                    sh './gradlew clean build'
                }
            }
        }
    }
}