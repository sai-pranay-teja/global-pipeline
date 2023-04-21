def call() {

pipeline {
    agent any
    parameters { string(name: 'NAME', defaultValue: 'GO', description: 'Enter the name') }
    stages {
        stage('first') {
            steps {
                script {
                    if (params.NAME== 'GO') {
                        echo "proceed"
                    }
                    }
            }
        }
        stage('second') {
            input {
                message "Proceed?"
                ok "Yes, we should."
            }
            steps{
                echo "Good"
            }
                
            
            }
        }
    }
}



post {
    failure {
        echo "stupid dumbfuck"
    }
}



