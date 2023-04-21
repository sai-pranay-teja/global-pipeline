def call() {

pipeline {
    agent any
    stages {
        stage('first') {
            steps {
                script {
                    if(software=="npm")
                      sh 'echo npm > npm.txt'
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
        }
    }
}





