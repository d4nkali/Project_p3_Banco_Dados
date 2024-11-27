# Configuração do arquivo `application.properties` no Git

O arquivo esta sendo ignorado pelo *Git* após a primeira vez que for adicionado para que ele seja mantido no repositório inicialmente, mas futuras alterações locais não serão rastreadas nem enviadas ao repositório para evitar conflitos com outros contribuidores. Foi esse o comando que foi usado para ignorar as mudanças futuras no arquivo:

```
git update-index --assume-unchanged api/src/main/resources/application.properties
```

Caso deseje que esse arquivo fique desse jeito, ambos os contribuidores do repositório devem executar o comando.

---

Para desfazer essa configuração e começar a rastrear as mudanças novamente, é so digitar esse comando abaixo:

```
git update-index --no-assume-unchanged api/src/main/resources/application.properties
```
