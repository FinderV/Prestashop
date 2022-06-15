pipeline {
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "3.6.3"
      jdk "java"
   }
    triggers {
        cron('0 8 * * *')  //запуск по расписанию
    }
    parameters {
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH' //ветка
        booleanParam(defaultValue: true, description: 'Headless mode', name: 'HEADLESS')
        string(name: 'DEPLOY_ENV', defaultValue: 'staging', description: '')
    }

   stages {
      stage('Testing') {
         steps {
            // Get some code from a GitHub repository
            git branch: "${params.BRANCH}", url: 'https://github.com/FinderV/Prestashop.git'  //репозит

            // Run Maven on a Unix agent.
            //sh "mvn clean test"

            // To run Maven on a Windows agent, use
            bat "mvn -Dmaven.test.failure.ignore=true -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src/test/resources/testng-smoke.xml clean test" //запуск
         }

         post {          //генер репортов
            // If Maven was able to run the tests, even if some of the test
            // failed, record the test results and archive the jar file.
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
            }
         }
      }
      stage('Reporting') {      //алюр
         steps {
             script {
                     allure([
                             includeProperties: false,
                             jdk: '',
                             properties: [],
                             reportBuildPolicy: 'ALWAYS',
                             results: [[path: 'target/allure-results']]
                     ])
             }
         }
        }
   }
}
