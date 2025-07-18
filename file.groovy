pipelines{
    agent{
        label 'verisoft-2'
    }
    environment
    {
        PROJECT_NAME:'pipline'
    }
    parameters{
        booleanParam (name: 'ToDoStage' defaultValue:false)
        string( name: 'myPhone',defaultValue: '0556556565')
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