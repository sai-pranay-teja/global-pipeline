def call() {
def gitTag = null
pipeline {
    agent any
    stages {
        stage('first') {
            steps {
                script {
                    if(software=="npm")
                      sh 'pwd'
                      sh 'echo npm >> ${HOME}/npm.txt'
                      gitTag=sh(returnStdout: true, script: "git tag --contains | head -1").trim()
                    // code.case_1()
                }
        }
        }
        stage('second') {
            when {
                expression {
                    return gitTag;
                }
            }
            steps {
                // sadrftg
                sh 'welcome'
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





