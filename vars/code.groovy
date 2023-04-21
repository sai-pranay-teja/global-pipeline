def case_1() {
    if(software=="nginx")
      sh 'yum install nginx -y'

}

def case_2() {
    if(software=="git")
      sh 'yum install git -y'
    
}