pipeline{
    agent{
        label 'verisoft-2'
    }
    environment
    {
        PROJECT_NAME:'pipline'
    }
    parameters{
        string(name: 'REPO_URL', defaultValue: 'https://github.com/RuthFineman/Pipline', description: 'Repository URL')
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
        triggers {
     cron('30 5 * * 1\n0 14 * * *')
 }
}
