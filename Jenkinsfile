pipeline {
    agent any

    stages {

        stage('Gradle Version') {
            echo 'Executing Gradle Version'
            withGradle() {
                sh './gradlew gradle -v'
            }
        }
    }
}