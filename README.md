# Projeto CriaturasPedia

Projeto CriaturasPedia para Avaliação da cadeira de Banco de Dados 2 - p3.

Todos os Scripts em `SQL` usados para criação do banco, criação das views e consultas estão em [aqui](./utils/sql/).

Alunos:
- Danilo Pereira- @d4nkali
- João Vitor Pereira - @JANzxz

## Api CriaturasPedia

Projeto de uma API RESTful feito no ecossistema Spring com o objetivo de gerenciar o cadastro de criaturas, gerenciamento das habilidades, e gerenciamento dos habitates usando a arquitetura MVC (Model-View-Controller) oferecendo a separação clara entre interface, lógica de negócios e acesso a dados.

## Módulos Usados

- Spring Boot - Framework principal para desenvolvimento da API.

- Spring Web - Modulo que ajuda na implementação de *endpoints* e suporte as *request* HTTP.

- Spring Data JPA - Modulo que facilita a interação com o banco de dados, simplificando o *crud*.

- Lombok - Modulo que facilita no código gerando os métodos como `get`, `set`, `toString` e entre outros, reduzindo a repetição de código.

- Driver PostgreSQL - Modulo necessário para o *Spring* se comunicar com o Banco de Dados **PostgreSQL**.

## Ferramentas e Tecnologias Usadas

- Linguagem **Java** 17 com Framework *Spring*.
- Gerenciador de dependências com **Maven**.
- Banco de Dados **PostgreSQL**.
- Ferramenta de Teste de *Endpoint* **Insomnia**.
- IDE **Intellij IDEA** e Editor de Código **Visual Studio Code**.
- Software Gerenciamento de Bancos **Dbeaver**.
- Padronizador de Código **EditorConfig**.

## Estrutura do Projeto

### 1. *Model*

O *model* ajuda a construir os atributos das classes de entidade do sistema.

A **API** possui 4 *models*: `Habilidade`, `Habitat`, e `Criatura`.

### 2. *Controller*

O *controller* lida com as chamadas das **request** HTML e retorna os dados, implementando os *EndPoints* do *service*. Cada *model* possui um *controller*.

### 3. *Repository*

O *repository* define a interface para interagir com os dados que o *service* for pedir, fazendo papel de ponte entre a **API** e o Banco de Dados. Cada *model* possui um *repository*.

### 4. *Service*

O *service* contem as regras de negócios do repositório atuando de intermediário entre o *controller* e o *repository*. Cada *model* possui um *service*.

### 6. *Enums* 

Contém as enumerações utilizadas no sistema.

### 7. *application.proprieties*

O arquivo [application.properties](api/src/main/resources/application.properties) configura a conexão do PostgreSQL com o Spring.

## Informações sobre o Banco:

- Banco de Dados: **PostgreSQL**.
- Porta: 5432.
- URL: [jdbc:postgresql://localhost:5432/criaturaspedia](jdbc:postgresql://localhost:5432/criaturaspedia).
- Database: `criaturaspedia`.
- Tabelas: 
  - Habilidade.
  - Habitat.
  - Criatura.
- Views:
  - Criatura-Habilidades.
  - Criatura-Habitat.
  - Total Criaturas por Classe.
