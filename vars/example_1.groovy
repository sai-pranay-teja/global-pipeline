def call() {

pipeline {
    agent any
    stages {
        stage('first') {
            steps {
                script {
                    if(software=="nginx")
                      sh 'sudo yum install nginx -y'
                    // code.case_1()
                }
        }
        }
        stage('second') {
            steps{
                script{
                    if(software=="git")
                      sh 'sudo yum install git -y'
                    // code.case_2()

                }
            }
                
            
            }
        }
    }
}





