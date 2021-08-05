pipeline {
    agent any
    stages {
        stage('Inicio'){
            steps{
                echo "Iniciando"
            } 
        }
	stage('stop imagen docker if exist'){
		
                steps{
		
			dir("/var/lib/jenkins/workspace/BackendPrivate"){
				sh 'docker stop backend || true && docker rm backend || true'	
			}
			
        		
                }             
        }
        stage('Contruir imagen docker'){
		
                steps{
        		dir("/var/lib/jenkins/workspace/BackendPrivate"){
                 		sh 'docker build -t backend .'	
	         	}
                }             
        }
	stage('Subir imagen docker a hub'){
                steps{
        		dir("/var/lib/jenkins/workspace/BackendPrivate"){
	         	}
                }             
        }
	stage('Correr imagen'){
                steps{
        		dir("/var/lib/jenkins/workspace/BackendPrivate"){
				sh 'sudo docker run --rm --name backend -d -p 3000:3000  --network host backend:latest'
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
