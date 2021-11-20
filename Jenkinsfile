pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                //apuntar hacia un repository images as dockerhub
                dockerImage = docker.build "cristianvx2dockerhub/spring_boot_app" 
                echo 'Hello World from Jenkinsfile'
                echo 'Building project...'
            }
        }
        stage('Test'){
            steps {
                echo 'Running Testing....'
            }
        }
        stage('Deploy'){
            steps {
                echo 'Deploying to production...'
                //configurar cuenta docker registry defaul dockerhub
                docker.withRegistry('', 'credentials-id'){
                    dockerImage.push("v_$BUILD_NUMBER")
                    dockerImage.push("latest")
                } 

            }
        }
    }
}