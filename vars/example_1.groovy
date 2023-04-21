def call() {

pipeline {
    agent any
    stages {
        stage('first') {
            steps {
                script {
                    code.case_1()
                }
        }
        }
        stage('second') {
            steps{
                script{
                    code.case_2()

                }
            }
                
            
            }
        }
    }
}





