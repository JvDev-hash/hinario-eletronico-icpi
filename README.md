# Hinário Eletrônico ICPI

Projeto de criação de um hinário online, com todos as canções utilizadas pela ICPI, como hinos de louvor nos Cultos.

## Requisitos
- Spring versão 2.5.2;
- AngularCLI 12.1.0 ou Node 15.11.0
- Java 11
- Maven 3.6.3

## Instalação

Para a instalação funcionar, seguir os passos abaixo:

### Banco de Dados
- Primeiro criar um banco de dados `MYSQL 8` de nome `db_hinario`;
- Colocar as credenciais de usuário no `application.propeties` da pasta `hinarioEletronico`;

### Aplicação
- Após configurado o Banco de dados, acesse a pasta `hinarioEletronico` e execute o comando `./mvnw spring-boot:run` para rodar a aplicação Spring;
- Depois da aplicação spring começar a ser executada, acesse a pasta `hinarioEletronico-frontend` e execute o comando `npm install` para instalar as dependências;
- Por fim, execute o comando `ng serve` para executar a aplicação. Caso não use o Angular CLI, execute o comando `npm start`;
