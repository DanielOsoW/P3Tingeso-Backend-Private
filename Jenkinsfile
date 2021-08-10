pipeline {
    agent any
    stages {
        stage('Inicio'){
            steps{
                echo "Iniciando"
            } 
        }
	    
	
	    
	stage('Parar imagen anterior'){
		
                steps{
		
			dir("/var/lib/jenkins/workspace/BackendPrivate/Private-Services"){
				sh 'docker stop backend || true && docker rm backend || true'	
			}
			
        		
                }             
        }
        stage('Contruir imagen docker'){
		
                steps{
        		dir("/var/lib/jenkins/workspace/BackendPrivate/Private-Services"){
                 		sh 'docker build -t backend .'	
	         	}
                }             
        }
	stage('Correr imagen'){
                steps{
        		dir("/var/lib/jenkins/workspace/BackendPrivate/Private-Services"){
				sh 'docker run --rm --name backend -d -p 3000:3000  --network host backend:latest'
	         	}
                }             
        }
	stage('Subir imagen docker a hub'){
                steps{
			sh 'docker tag backend ducktales10969/backend:latest'	
			sh 'docker push ducktales10969/backend:latest'
                }             
        }

        stage("JUnit"){
            steps{
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    dir("/var/lib/jenkins/workspace/BackendPrivate/Private-Services") {
                    sh './gradlew test'
				    }
                }
                dir("/var/lib/jenkins/workspace/BackendPrivate/Private-Services/build/test-results/test"){
                   junit 'TEST-*.xml'
                }
            }
        }
		    
    	stage("SonarQube analysis") {
            //agent any
            steps {
                dir("/var/lib/jenkins/workspace/BackendPrivate/Private-Services"){
                    withSonarQubeEnv('sonarqube') {
                        sh 'chmod +x ./gradlew'
                        sh './gradlew sonarqube'
                    }
                }
            }
        }
	    
        stage('Fin'){
                steps{
                    echo "Terminado"
                } 
            }
        

        }
}
