def call() {

pipeline {
    agent any
    stages {
        stage('first') {
            steps {
                script {
                    if(software=="npm")
                      sh 'pwd'
                      sh 'echo npm >> npm.txt'
                      sh 'echo This tag is ${TAG_NAME} >> npm.txt'
                      
                    // code.case_1()
                }
        }
        }
        stage('second') {
            when {
                branch 'B-1' && TAG_NAME 'v1.2'
            }
            steps{
                script{
                    sh 'pwd'
                    sh 'echo this is ${branch} and ${TAG_NAME}'
                   

                }
            }
                
            
            }

        //    stage('Email') {
        //     steps{
        //         mail bcc: '', body: 'Hai Pranay, This is your first email', cc: '', from: 'algonox1.1@gmail.com', replyTo: '', subject: 'Demo Purpose', to: 'algonox1.1@gmail.com'
        //     }
                
            
        //     }




        
        }


    }
}





