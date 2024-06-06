def buildApp(){
    echo "building application artifact"
    sh "mvn package"

}



def buildImage(){
    echo "building docker image"
    echo "pushing image to docker repository"
    withCredentials([usernamePassword(credentialsID: "dockerhub-credentials", passwordVariable: "PASSWORD", usernameVariable: "USERNAME")])
    sh "docker build -t nanaot/maven-app:2.1"
    sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
    sh "docker push nanaot/maven-app:2.1"


}
