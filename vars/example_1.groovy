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
            steps {
                input {
                message "Proceed?"
                ok "Yes, we should."
                }
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



