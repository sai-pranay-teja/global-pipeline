def call() {

pipeline {
    agent any
    stages {
        stage('first') {
            steps {
                script {
                    if(software=="npm")
                      sh 'echo npm > /home/centos/npm.txt'
                    // code.case_1()
                }
        }
        }
        stage('second') {
            steps{
                script{
                    if(software=="mvn")
                      sh 'mvn package'
                    // code.case_2()

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





