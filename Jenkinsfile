pipeline { 
    agent any
    // TO_DO
        // install JDK in jenkins with name java-23
        // install maven in jenkins with name mvn-3.9
        // Create credentials in Jenkins with name JENKINS_GLOBAL
        // SSH_KEY.pem is the key to access the instance NEED TO CONFIGURE IN JENKINS
     

//  environment {
//     // Create credentials in Jenkins with name JENKINS_GLOBAL
//         SONARQUBE_ENV     = credentials('JENKINS_GLOBAL')
//         AWS_ACCESS_KEY_ID     = credentials('JENKINS_GLOBAL')
//         AWS_SECRET_ACCESS_KEY = credentials('JENKINS_GLOBAL')
//         TF_DIR                = './terraform'
//     }
    stages {
        stage('Checkout') {
            steps {
                script {
                    // Build the Spring Boot application
                    sh 'echo "Checking out the code from the repository"'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    // Run unit tests
                    sh 'echo "Finishing build"'
                }
            }
        }
        // stage('Build') {
        //     steps {
        //         script {
        //             // Build the Spring Boot application
        //             sh 'mvn clean install -DskipTests'
        //         }
        //     }
        // }
        // stage('SonarQube Analysis') {
        //     steps {
        //         withSonarQubeEnv("${SONARQUBE_ENV}") {
        //             sh 'mvn sonar:sonar'
        //         }
        //     }
        // }
        // stage('Sonar QG') { // Quality Gate
        //     steps {
        //         waitForQualityGate abortPipeline: true
        //     }
        // }
        // stage('TF init') {
        //     steps {
        //         script {
        //             // Run terraform ini
        //             sh 'terraform init'
        //         }
        //     }
        // }
        // stage('TF plan') {
        //     steps {
        //         script {
        //             // Run terraform plan
        //             sh 'terraform plan -out=tfplan'
        //         }
        //     }
        // }
        // stage('TF Apply') {
        //     steps {
        //         script {
        //             // Deploy the application to a server wit terraform
        //             sh 'terraform apply -auto-approve tfplan'
        //         }
        //     }
        // }
        // stage('Deploy') {
        //     steps {
        //         dir("${TF_DIR}") {
        //             script {
        //                 // Deploy the application to a server
        //                 def instance_ip = sh(script: "terraform output -raw instance_ip",returnStdout: true).trim() // get the instance ip
        //                 // SSH_KEY.pem is the key to access the instance NEED TO CONFIGURE IN JENKINS
        //                 sh """
        //                 scp -o StrictHostKeyChecking=no -i ~/SSH_KEY.pem ../target/*.jar ubuntu@${instance_ip}:/home/ubuntu/app.jar
        //                 ssh -o StrictHostKeyChecking=no -i ~/SSH_KEY.pem ubuntu@${instance_ip} 'nohup java -jar app.jar > app.log 2>&1 &' 
        //                 """
        //             }
        //         }
        //     }
        // }        
    }

}