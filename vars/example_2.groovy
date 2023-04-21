def call() {

node {

    parameters { string(name: 'VALUE', defaultValue: 'Pranay', description: 'Enter a value') }
    stages{
        stage("first") {
            input(id: 'user', message: 'What you chose?', ok: 'go',reject: 'stop')
            
            echo "first"
    
    }
        stage("Test") {
            //   when {
            //     expression {
            //         if 
            //     }
            // }
        }
        stage("second") {
        
                echo "${params.VALUE}"
        
        
    }

    } 


        stage("fuck you bro"){
            echo "lol looser"
        }
    }

}

