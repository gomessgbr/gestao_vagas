# Gestão Vagas API

## Descrição
A Gestão Vagas é uma API desenvolvida em Java com Spring Boot destinada à gestão de vagas para empresas. Ela permite o controle e a alocação de vagas de emprego, facilitando o processo de recrutamento.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada no desenvolvimento.
- **Spring Boot**: Framework para facilitar a configuração e o desenvolvimento de aplicações em Java.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados para armazenamento das informações.
- **Docker**: Utilizado para containerizar e gerenciar a imagem do banco de dados PostgreSQL.
- **Lombok**: Biblioteca Java que automatiza a escrita de código boilerplate.
- **Spring Security**: Framework para autenticação e autorização, garantindo a segurança da aplicação.
- **JWT (JSON Web Tokens)**: Tecnologia usada para a autenticação e autorização via tokens, com suporte a roles.

## Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven para gerenciamento de dependências
- Docker instalado para execução do banco de dados

### Passos

1. Clone o repositório

```bash
$ git clone https://github.com/gomessgbr/gestao_vagas.git
```
2. Navegue até o diretório do projeto
   
```bash
$ cd gestao_vagas
```

3. Utilize o Docker para subir a instância do PostgreSQL

```bash
$ docker-compose up -d
```

4. Execute a aplicação

```bash 
$ mvn spring-boot:run
```

## Endpoints da API

### Autenticação
- `POST /company/auth`: Faz a authenticação da empresa criada.
- `POST /candidate/auth`: Faz a authenticação da empresa criada.

### Gestão de Vagas
- `POST /candidate/`: Cria Candidatos para a vaga
- `POST /company`: Cria empresas que disponibilizam vagas
- `POST /job/`: Retorna os detalhes de uma vaga específica.
- `GET /candidate/`: Lista as vagas do candidato

## Segurança
A autenticação é realizada via JWT. Após o login bem-sucedido, o usuário recebe um token que deve ser utilizado nas requisições subsequentes para acesso aos endpoints protegidos.

