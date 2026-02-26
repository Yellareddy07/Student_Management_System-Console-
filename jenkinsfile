pipeline {
    agent any
    
    stages {
        stage('Clone') {
            steps {
                echo 'Cloning Repository'
            }
        }
        
        stage('Build') {
            steps {
                sh 'echo "building"'
            }
        }
        
        stage('Test') {
            steps {
                sh 'echo "Testing"'
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'echo "deployed"'
            }
        }
    }
}
