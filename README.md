# Projeto desenvolvido no modulo 3 da semana 2

 
<p align="justify"> 
Neste repositório está o projeto de uma RESTfull API desenvovido no Módulo 3 da Semana 2 com a Turma DEVinClamed.
Nesta semana foram abordados os tópicos sobre Spring Security: 

1. Autenticação
2. Segurança
3. Json Web Token (JWT)

Para colocar em prática os tópicos de aula o projeto desenvolvido contempla a implentação de uma RESTfull API que simula
um módulo para gerenciamento de recursos de usuários com controle de acessos baseado em perfis de acesso.

Para rodar a aplicação crie a base de dados com PostgreSQL e realize o ajuste da configuração no arquivo application.propierties
refletindo as configurações de URL, Base de Dados, Login, Senha da sua realidade. 

Tópicos abordados em aulas anteriores foram revisados e exercitados ao longo do desenvolvimento do projeto, que são ele:

- Banco de dados:
    - elaboração do modelo lógico relacional do domínio do projeto

   <img src="https://github.com/DEVin-Clamed/modulo3-semana2/blob/main/src/main/resources/doc/er_spring_security_clamed.png"> <br> 
   Diagrama Entidade Relacionamento (ER) do projeto Spring Security

- Spring Boot:
    - criação do pojeto utilizando o repositório central do maven,
    - injeção de dependências.

- Spring Data:
    - mapeamento objeto relacional com Hibernate

- Padrões:
    - Model,
    - Repository,
    - Service,
    - Controllers,
    - DTO (Data Transfer Object).

- Operações CRUD:
    - Implementação de métodos para interceptação de requisições HTTP:
        - POST: para inserção de recurso,
        - GET: obteção de recursos,
        - PUT: atualização de recursos,
        - DELETE: deletar recursos.

</p>


