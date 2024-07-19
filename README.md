# Projeto Spring Boot com MySQL

Este é um projeto de exemplo utilizando Spring Boot para criar uma API RESTful conectada a um banco de dados MySQL.

## Configuração do Banco de Dados

### Instalação do MySQL

1. Instale o MySQL:
    ```sh
    sudo apt-get update
    sudo apt-get install mysql-server
    ```

2. Inicie o serviço MySQL:
    ```sh
    sudo systemctl start mysql
    ```

3. Acesse o MySQL como root:
    ```sh
    sudo mysql -u root
    ```

4. Redefina a senha do usuário root (substitua `nova_senha` pela senha desejada):
    ```sql
    ALTER USER 'root'@'localhost' IDENTIFIED BY 'nova_senha';
    ```

5. Crie o banco de dados para o projeto:
    ```sql
    CREATE DATABASE tutordb;
    ```

## Configuração do Projeto

### Configuração do `application.properties`

Edite o arquivo `src/main/resources/application.properties` com as informações do banco de dados:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tutordb
spring.datasource.username=root
spring.datasource.password=nova_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
