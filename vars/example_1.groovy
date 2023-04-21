def call() {

pipeline {
    agent any
    stages {
        stage('first') {
            steps {
                script {
                    if(software=="nginx")
                      sh 'yum install nginx -y'
                    // code.case_1()
                }
        }
        }
        stage('second') {
            steps{
                script{
                    if(software=="git")
                      sh 'yum install git -y'
                    // code.case_2()

                }
            }
                
            
            }
        }
    }
}





