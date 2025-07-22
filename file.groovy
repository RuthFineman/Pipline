pipelines{
    agent{
        label 'verisoft-2'
    }
    environment
    {
        PROJECT_NAME:'pipline'
    }
    parameters{
        string(name: 'REPO_URL', defaultValue: 'https://github.com/tamar240/pipelineProject', description: 'Repository URL')
        string(name: 'BRANCH_NAME', defaultValue: 'main', description: 'Branch name to build')
        // booleanParam (name: 'ToDoStage' defaultValue:false)
        // string( name: 'myPhone',defaultValue: '0556556565')
    }
    options{
        skipStagesAfterUnstable()
        disableConcurrentBuild()
    }
    stages{
        stage('First Stage'){
when{
    expression{params.ToDoStage }
}
steps{
    echo 'cc'
}
        }
        stage('second stage')
        {
            steps {
            echo "${params.myPhone}"
            }
        }
    }
}
