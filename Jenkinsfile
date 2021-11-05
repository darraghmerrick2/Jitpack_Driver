pipeline{
    agent any

    stages{
        stage('Build'){
           steps{
            checkout([$class: 'GitSCM', branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/darraghmerrick2/Jitpack_Driver']]])
            bat 'echo \'Hello World\''
            bat 'dir'
            bat 'gradlew clean'
            bat 'gradlew build'
            bat 'gradlew test'
            
            bat 'gradlew war'
           }
            }
          }
          }

