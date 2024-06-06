def gv
pipeline {
    agent any

    stages{
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }

            }
        }

        stage("build"){
            steps{
                script{
                    gv.buildApp
                }
            }
        }

        stage("build image"){
            steps{
                script{
                   gv.buildImage
                }
            }
        }
    }
}