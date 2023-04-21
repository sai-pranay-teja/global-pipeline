def call() {

node {

    try {
        stage("first") {
            input(id: 'user', message: 'What you chose?', yes:'go',no:'stop')
            
            echo "first"
    
    }
        stage("second") {
        
                echo "second"
                sh 'exit 1'
        
        
    }

    } 

    catch (e){
        stage("fuck you bro"){
            echo "lol looser"
        }
    }

}

}