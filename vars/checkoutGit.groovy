def call(String gitUrl, String gitBranch){
    checkout([
        $class: 'GitSCM',
        braches: [[name: gitBranch]],
        userRemoteConfigs: [[gitUrl]]
    ])
}