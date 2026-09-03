def call(String ProjectName, String ImageTag, String DockerHubUser){
    echo "This is the building stage"
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
    echo "Image Build successfully....."
}
