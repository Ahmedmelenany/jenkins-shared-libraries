def call(String dockerHubCredentialsID, String repoName, String imageName, String imageTag) {
    withCredentials([usernamePassword(credentialsId: "${dockerHubCredentialsID}", usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh "docker login -u ${USERNAME} -p ${PASSWORD}"
        sh "docker build -t ${imageName}:${imageTag} ."  
        sh "docker push ${imageName}:${imageTag}"        
        sh "docker rmi ${imageName}:${imageTag}"         
    }
}