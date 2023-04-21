def call() {

pipeline {
    agent any


parameters{
string(name: "NAME", defaultValue: "Go", description: "Tf you gonna do?")
}


stages {
    
    stage("first") {
        input(id: 'input', message: 'Please enter the Name',parameters: [string(defaultValue: '',description: '',name: 'NAME')])

        when {
            expression { params.NAME == 'Bro' }
        }
        steps{
       

        }
    }
    stage("second") {
        input(id: 'input-1', message: 'Please enter the Course Name',parameters: [string(defaultValue: '',description: '',name: 'CourseName')])

        when {
            expression { params.NAME == 'COOL' }
        }
        steps{
        
        sh 'env'
        }
        
        
    }
}


post {
    always {
        echo "stupid dumbfuck"
    }
}

}

}