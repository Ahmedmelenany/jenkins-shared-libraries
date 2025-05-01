def vulnerability(String imageName, String tag){

    sh '''
        trivy image ${imageName}:${tag} \
            --severity LOW,MEDIUM,HIGH \
            --cache-dir /tmp/trivy/ \
            --quiet \
            --format json -o trivy-image-LOW-MEDIUM-HIGH-results.json

        trivy image ${imageName}:${tag} \
            --severity CRITICAL \
            --cache-dir /tmp/trivy/ \
            --quiet \
            --format json -o trivy-image-CRITICAL-results.json
       '''
}

def converter(){

    sh '''
        trivy convert \
            --format template --template "@/usr/local/share/trivy/html.tpl" \
            --output trivy-image-LOW-MEDIUM-HIGH-results.html trivy-image-LOW-MEDIUM-HIGH-results.json 

        trivy convert \
            --format template --template "@/usr/local/share/trivy/html.tpl" \
            --output trivy-image-CRITICAL-results.html trivy-image-CRITICAL-results.json

        trivy convert \
                --format template --template "@/usr/local/share/trivy/html.tpl" --output trivy-fs-scan.html nodejs-trivy-fs-scan.json     
        '''

}