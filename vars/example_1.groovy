def call() {

pipeline {
    agent any


parameters{
string(name: "NAME", defaultValue: "Go", description: "Tf you gonna do?")
}


stages {

    
    
    stage("first") {

        script{
            if (params.NAME == 'GO') {
                echo "alright go"
        }


        steps {
                input(
                    message: "Ready to continue?",
                    ok: "Yes"
                )
        }

        }
    
    stage("second") {
        // input(id: 'input-1', message: 'Please enter the Course Name',parameters: [string(defaultValue: '',description: '',name: 'CourseName')])



        when {
            expression { params.NAME == 'COOL' }
        }
        steps{
        
        sh 'env'
        }
        
        
    }
}


post {
    failure {
        echo "stupid dumbfuck"
    }
}

}

}

}