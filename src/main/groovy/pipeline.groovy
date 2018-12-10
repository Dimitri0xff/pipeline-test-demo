def execute() {
    node {
        stage('Checkout') {
            sh 'git status'
            jenkins.model.Jenkins.instance.getAllItems(hudson.model.AbstractItem.class).each {
                println(it.fullName)
            };
        }
    }
}

return this
