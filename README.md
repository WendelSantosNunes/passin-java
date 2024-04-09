<h1 align="center"> 
	passin-java
</h1>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
<a href="#-diagrama">Diagrama</a> •
 <a href="#-funcionalidades">Funcionalidades</a> •
 <a href="#-Configuração-do-ambiente">Configuração do ambiente</a> • 
 <a href="#-como-executar">Como executar</a> • 
 <a href="#-tecnologias">Tecnologias</a> 
</p>

---

## 🪐 Sobre o projeto

Este projeto de back-end é voltado para uma aplicação de gestão de participantes em eventos presenciais. A meta é 
dominar a criação de um CRUD utilizando Spring Boot e JPA. Este aprendizado ocorrerá durante o primeiro evento de 2024
da Rocketseat, o NLW.

---

### 👨‍💻 Diagrama

<p align="center">
  <img src="https://drive.google.com/uc?export=view&id=1lTy9kS0zf9U7_jq8aJwMAYWm_goh2k7p" alt="Diagrama"/>
</p>

---

### 💻 Funcionalidades

- [x] **Organizador:**
    - [x] Realizar o cadastro de um novo evento;
    - [x] Visualizar os dados de um evento;
    - [x] Visualizar a lista de participantes do evento.
- [x] **Participante:**
    - [x] Realizar a inscrição em um evento;
    - [x] Visualizar o crachá de inscrição;
    - [x] Realizar check-in no evento.

--- 

### 🎨 Configuração do ambiente

```bash

# Instalação do Java

## Para instalar o Java, visite o site oficial e baixe a versão que seja compatível com o seu ambiente de desenvolvimento. Siga as instruções fornecidas para instalar o Java em seu sistema.

https://www.java.com/pt-BR/download/

# Instalação da JDK 17

## Vamos usar o SDKMAN para instalar a JDK 17. Primeiro, instale o SDKMAN com o seguinte comando:

curl -s "<https://get.sdkman.io>" | bash

## Depois de instalar o SDKMAN, você pode instalar a JDK 17 com este comando:

sdk install java 17-open

## Para verificar se a JDK foi instalada corretamente, use o comando:

java --version

# Instalação do Maven 

## Para instalar o Maven, use o seguinte comando:

sdk install maven 3.1.5

## Você pode verificar a instalação do Maven com este comando:

mvn --version
 
# Instalação do Intellij Community

## Para instalar o IntelliJ IDEA Community, visite o site oficial e baixe a versão que seja compatível com o seu ambiente de desenvolvimento. Siga as instruções fornecidas para instalar o IntelliJ IDEA Community em seu sistema.

https://www.jetbrains.com/idea/download/?section=linux

```

---

### 🚀 Como executar

#### Pré-requisitos

Certifique-se de que todas as configurações do ambiente foram realizadas corretamente.

#### Execução

- Faça o download do projeto para o seu computador.

- Abra o IntelliJ IDEA Community.

- No menu principal, selecione a opção “Open”. Navegue até a pasta onde o projeto foi baixado e clique em “OK”.

- No projeto aberto, localize e clique no arquivo AuthApplication.java.

- Em seguida, selecione a opção “Run ‘PassInApplication’” para executar o projeto.

- Após a execução, o projeto estará acessível através do seguinte endereço: http://localhost:8080/

### 🛠 Tecnologias

#### **Back-End**

- **[Java](https://docs.oracle.com/en/java/)**
- **[Spring Boot](https://spring.io/projects/spring-boot)**
- **[Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.32)**
- **[Flywaydb](https://mvnrepository.com/artifact/org.flywaydb/flyway-mysql)**
- **[Devtools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)**
- **[Hsqldb](https://www.baeldung.com/spring-boot-hsqldb)**