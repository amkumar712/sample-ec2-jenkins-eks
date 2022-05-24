pipeline {
    agent any

    stages {

        stage('Gradle Version') {
            steps {
                echo 'Executing Gradle Version'
                withGradle() {
                    sh 'echo "testing sh commands"'
                }
            }
        }
    }
}