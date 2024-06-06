
pipeline {
    agent any
    tools{
       maven "maven-3.9"
    }

    stages{


        stage("build App"){
            steps{
                script{
                    echo "building application artifact"
                    sh "mvn package"
                }
            }
        }

        stage("build Image"){
            steps{
                script{
                    echo "building docker image"
                    echo "pushing image to docker repository"
                    withCredentials([usernamePassword(credentialsID: "dockerhub-credentials", passwordVariable: "PASSWORD", usernameVariable: "USERNAME")])
                    sh "docker build -t nanaot/java-app:2.1"
                    sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
                    sh "docker push nanaot/java-app:2.1"
                }

            }

        }
    }
}