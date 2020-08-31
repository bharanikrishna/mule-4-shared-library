import com.mulesoft.Constants

def call(String template) {
    deleteDir()
    def url = url
    
    git url: "https://github.com/M1053737/rest-template.git" // credentialsId: Constants.GITLAB_CREDENTIALS_ID,
    sh 'rm -r .git'
}
