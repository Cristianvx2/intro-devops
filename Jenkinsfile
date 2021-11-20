pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                echo 'Hello World from Jenkinsfile'
                echo 'Building project...'
                script{
                    //apuntar hacia un repository images as dockerhub
                    dockerImage = docker.build "cristianvx2dockerhub/spring_boot_app" 
                }
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
                script{
                    //configurar cuenta docker registry defaul dockerhub
                    //substituir [credentials-id] con el id generado en jenkins 
                    //al agregar las credenciales de dockerhub repository.
                    docker.withRegistry('', 'b218e845-8e0d-4e46-9688-17bdea1a3876'){
                        dockerImage.push("$BUILD_ID")
                        dockerImage.push("latest")
                    }
                }
            }
        }
    }
}