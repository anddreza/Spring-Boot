Iniciar com: 

### Aula 1-3 Instalação:
1. Spring Initializr: Create a Maven Project

2. Versão 2.7.63 (era a mais versão mais antiga que tinha disponível resolvi utilizar somente para não ter problema de conflito com o entendimento das aulas)

3. Linguagem: Java

4. Input Group id for your project:
br.com.project
(br por causa do nosso país)

5. API (nome do projeto)

6. Tipo de empacotamento que ele vai trabalhar:
Jar

7. Versão Java: 17 

8. Dependências 
8.1 Spring Boot DevTools (não precisa fazer restart no servidor cada vez que é modificado)

8.2 Spring Web


### Aula 4:
Tem que rodar a primeira vez para poder verificar se ele vai entrar na porta correta, geralmente ele roda dentro da porta `8080`.

#Aula 6:
Leitura para mim necessária
https://medium.com/@gcbrandao/diferen%C3%A7a-entre-restcontroller-e-controller-annotation-no-spring-mvc-e-rest-8533998a93eb

### Aula 9:
Não é possível assim utilizar o navegador, então baixa a extensão ThunderClient, ele tem suporte para trabalhar com o RequestBody só assim consigo enviar dados do navegador para minha API
### Aula 11:
Maven é responsável por gerenciar os pacotes do Spring
Adicionado as dependências:
JPA: Java Persistence API, responsável por criar a estrtura de tabelas no banco de dados, além de interagir com os objetos recebidos e enviados
MySQL: Dependência responsável pela conexão entre uma aplicação Spring e o banco MySQL
