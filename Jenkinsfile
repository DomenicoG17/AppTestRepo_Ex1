pipeline {
	agent any
	
	stages{
		stages('Compile Stage')
	
			steps{
			withMaven(maven : 'maven_3_5_0'){
				sh 'mvn clean compile'			
			}
		}
	}
	
	stage('Testing Stage'){
	
		steps{
			withMaven(maven:maven_3_5_0'){
				sh 'mvn test'
				}
			}
		}
	}
}