pipeline{
	agent any
	tools{
		maven 'Maven 3.3.9'
		jdk 'jdk11'
	}
	stages{
		stage('Build and Test')
			steps{
				echo 'buinding and testing'
				sh 'mvn install'
			}
	}
}