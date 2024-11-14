
## Como configurar:

* Será nescessario acessar o site start.spring.io e baixar as seguintes dependências Spring Web, Spring Data JPA, PostgresSQL Driver, Lombok.
* Ápós baixa-las ultilize a IDE de sua preferencia e abra com ela a pasta api que foi baixada no site.
* Configure sua IDE.


## O programa possui 4 arquivos principais:

1. Controller (Lida com as requisições HTTP, como adicionar um aluno)
2. Model (Para modelar os atributos de aluno)
3. Repository (Para fazer a ponte entre java e o banco de dados)
4. Service (Cuida da regra de negócios, como regras para criar um aluno)


## Explicando as anotações ultilizadas:

### Anotações em `AlunoController.java`

- **`@RestController`**: Define a classe como um controlador RESTful, permitindo que responda a requisições HTTP e envie dados.
- **`@RequestMapping("/alunos")`**: Define o caminho base para todos os métodos na classe.
- **`@PostMapping`**: Mapeia o método para lidar com requisições HTTP POST.
- **`@ResponseStatus(HttpStatus.CREATED)`**: Define o código de status HTTP retornado quando o método é executado com sucesso.
- **`@RequestBody`**: Converte o corpo da requisição JSON em um objeto Java.

### Anotações em `Aluno.java`

- **`@Entity`**: Marca a classe como uma entidade JPA, representando uma tabela no banco de dados.
- **`@Id`**: Define o campo como a chave primária da entidade.
- **`@GeneratedValue(strategy = GenerationType.IDENTITY)`**: Configura a geração automática do valor da chave primária.
- **`@NoArgsConstructor`**: Gera um construtor sem argumentos.
- **`@AllArgsConstructor`**: Gera um construtor com todos os parâmetros.
- **`@Data`**: Gera métodos getters, setters, `equals`, `hashCode`, e `toString`.

### Anotações em `AlunoRepository.java`

- **`@Repository`**: Marca a interface como um repositório de dados, facilitando a integração com o banco de dados.

### Anotações em `AlunoService.java`

- **`@Service`**: Marca a classe como um serviço Spring, contendo a lógica de negócios.
- **`@Autowired`**: Permite a injeção automática de dependências pelo Spring.eção automática de dependências pelo Spring.

## Banco de dados

### Criação do Banco de Dados:

- Execute o comando CREATE DATABASE aluno_online_turma_3; para criar um novo banco de dados.

### Visualização de Dados:

- Execute o comando SELECT * FROM public.aluno; para ver todos os dados armazenados na tabela aluno.