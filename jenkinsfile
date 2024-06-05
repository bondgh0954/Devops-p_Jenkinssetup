pipeline{
    agent any

    parameters{
        choice(name:"VERSION", choices:['1.0', '1.1', '1.2'], description:'')
        booleanParam(name:"executeTest", defaultValue:"true", description:'')
    }
    
    stages{

        stage("build"){
            steps{
                echo "building application"

            }
        }

        stage("test"){
            when{
                expression{
                    param.executeTest
                }
            }

            steps{
                echo "testing application"
                

            }
        }

        stage("deploy"){
            steps{
                echo "deploying application"
                echo "deploying application ${VERSION}"

            }
        }

    }
}