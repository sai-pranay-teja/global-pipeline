def call() {

pipeline {
    agent any


parameters{
string(name: "NAME", defaultValue: "Go", description: "Tf you gonna do?")
}


stages {
    
    stage("first") {
        NAME = input(message: 'Please enter the Name',parameters: [string(defaultValue: '',description: '',name: 'NAME')])

        when {
            expression { params.NAME == 'Bro' }
        }
        steps{
        echo "Name is ${NAME}"

        }
    }
    stage("second") {
        course    = input(message: 'Please enter the Course Name',parameters: [string(defaultValue: '',description: '',name: 'CourseName')])

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