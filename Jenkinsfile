pipeline {
    agent any

    stages {
        stage('Build') {
            agent {
                dockerfile {
                    filename 'Dockerfile.build'
                    dir '.'
                }
            }
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            agent {
                dockerfile {
                    filename 'Dockerfile.test'
                    dir '.'
                }
            }
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build e testes concluídos com sucesso.'
        }
        unstable {
            echo 'Build OK, mas testes falharam.'
        }
        failure {
            echo 'Erro na build ou testes.'
        }
    }
}
