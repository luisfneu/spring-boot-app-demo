# Usar a imagem oficial do openjdk como imagem de base
# FROM openjdk:25-ea-16-jdk-oraclelinux9
FROM amd64/openjdk:latest 

# Diretório de trabalho no contêiner
WORKDIR /app

# Copiar o arquivo JAR para o diretório de trabalho
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta
EXPOSE 8081

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]