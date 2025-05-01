
def call(String namespace, String credentialsId, String serverUrl) {
     withKubeConfig(clusterName: 'kubernetes', credentialsId: "${credentialsId}", namespace: "${namespace}",
                    restrictKubeConfigAccess: false, serverUrl: "${serverUrl}") {
        sh '''
            sed -i  "s|ahmedelenany703/solutionapp:.*|ahmedelenany703/solutionapp:V1.$BUILD_NUMBER|g" deployment.yaml
            kubectl apply -f deployment.yaml
            kubectl apply -f service.yaml
            '''
                    }
}
   

