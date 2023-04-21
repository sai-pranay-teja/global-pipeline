def case_1() {
    if(software=="nginx")
      sh 'sudo install nginx -y'

}

def case_2() {
    if(software=="git")
      sh 'sudo install git -y'
    
}