pipeline {
    agent any
    stages {
        stage('Inicio'){
            steps{
                echo "Iniciando"
            } 
        }

        stage("SonarQube analysis") {
            //agent any
            steps {
                dir("/var/lib/jenkins/workspace/prueba1/backend"){
                    withSonarQubeEnv('sonarqube') {
                        sh 'chmod +x ./gradlew'
                        sh './gradlew sonarqube'
                    }
                }
            }
        }

        stage("JUnit"){
            steps{
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    dir("/var/lib/jenkins/workspace/prueba1/backend") {
                    sh './gradlew test'
				    }
                }
                dir("/var/lib/jenkins/workspace/prueba1/backend/build/test-results/test"){
                   junit 'TEST-*.xml'
                }
            }
        }

        stage('Crear imagen docker del backend privado'){
                steps{
                	dir("/var/lib/jenkins/workspace/private/Private-Services"){
                       	 sh 'docker build -t backend Private-Services'
                }             
        }
        stage('Subir imagen a docker hub'){
                steps{
                	dir("/var/lib/jenkins/workspace/private/Private-Services"){
                       	 sh 'docker push backend'
                }             
        }
        stage('Fin'){
                steps{
                    echo "Terminado"
                } 
            }
        

        }
}
