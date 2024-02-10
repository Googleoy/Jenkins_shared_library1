def call() {
    sh 'trivy image gitya/youtube:latest > trivyimage.txt'
}