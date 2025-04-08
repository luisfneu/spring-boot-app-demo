# POC simple hello world Spring Boot

##### install java
    brew install --cask oracle-jdk
    brew install maven
    install docker desktop from docker.com

##### navigate to Java home directory
    cd /Library/Java/JavaVirtualMachines/<jdk-23.jdk>/Contents/Home

* project was based woth the springboot generator with maven and java 17
** https://start.spring.io/

##### with maven do clean package
    mvn clen package

ℹ️ maven clean package minds any previous builds are removed with a clean project, and then you create a new build artifact for your project.

##### create a docker build with your app
    docker build -t demo-app . # --platform linux/x86_64 

##### send to registry
    docker image tag demo-app:latest luisneu/demo-app:latest
    docker push luisneu/demo-app:latest

##### run you app
     docker run -p 8081:8080 demo-app
##### run you app
    http://localhost:8080/hello

##### run you app
    http://localhost:8080/hello
    

##### result:
    hello Mundo!

⚠️ you can use /hello /oi /ola or /hi then you can put another level wih /name and /name/surname for instance: 
##### 
    http://localhost:8080/hello/Luis/Neu

##### result:
    hello Luis Neu!

access in kubernetes
-- kubectl port-forward <POD> 8080:8080 -n app