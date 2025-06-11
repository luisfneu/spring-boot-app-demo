pipeline { 
    agent any

//  environment {
//     // Create credentials in Jenkins with name JENKINS_GLOBAL
//         SONARQUBE_ENV     = credentials('JENKINS_GLOBAL')
//         AWS_ACCESS_KEY_ID     = credentials('JENKINS_GLOBAL')
//         AWS_SECRET_ACCESS_KEY = credentials('JENKINS_GLOBAL')
//         TF_DIR                = './terraform'
//     }
    stages {
        stage('Build') {
            steps {
                script {
                    // Build the Spring Boot application
                    sh 'mvn clean install -DskipTests'
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv("sonarQube") {
                    sh "mvn clean verify sonar:sonar -Dsonar.projectKey=springBootApp -Dsonar.projectName='springBootApp'"
                }
            }

        }        
        stage('Sonar QG') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }   
            }
        }
    }
}