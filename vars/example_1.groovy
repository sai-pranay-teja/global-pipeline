def call() {

pipeline {
    agent any


parameters{
string(name: "NAME", defaultValue: "Go", description: "Tf you gonna do?")
}

  environment {

        NAME = input message: 'Please enter the Name',parameters: [string(defaultValue: '',description: '',name: 'NAME')]
        course    = input message: 'Please enter the Course Name',parameters: [string(defaultValue: '',description: '',name: 'CourseName')]
    }

stages {
    
    stage("first") {
        when {
            expression { params.NAME == 'Bro' }
        }
        steps{
        echo "Name is ${NAME}"

        }
    }
    stage("second") {
        when {
            expression { params.NAME == 'COOL' }
        }
        steps{
        echo "course is ${course}"
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