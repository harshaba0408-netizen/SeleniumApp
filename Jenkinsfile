pipeline{
agent any
tools{
maven 'Maven'
jdk 'JDK'
}
stages{
stage('Checkout'){
steps{
git branch: 'main',
url: "https://github.com/harshaba0408-netizen/SeleniumApp.git"
}
}
stage('Build'){
steps{
sh 'mvn clean compile'
}
}
stage('Test'){
steps{
sh 'mvn test'
}
}
stage('Run selenium'){
steps{
sh 'mvn exec:java -Dexec.mainClass="com.example.App"
}
}
}
post{
success{
echo 'Selenium successful'
}
failure{
echo 'Build failure'
}
}
}
