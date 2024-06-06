def gv
pipeline {
    agent any
    tools{
       maven "maven-3.9"
    }

    stages{
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }

            }
        }

        stage("build App"){
            steps{
                script{
                    gv.buildApp
                }
            }
        }

        stage("build Image"){
            steps{
                script{
                    gv.buildImage
                }

            }

        }
    }
}