# 04. JPA, consultas SQL e JPQL

# Sobre o Projeto:
Vamos aprofundar sobre o acesso a banco de dados com JPA, e vamos aprender a construir consultas com SQL e JPQL.

Relembrando: estudos prévios necessários

- Revisão Álgebra Relacional e SQL
 Pra quê? Para relembrar as operações básicas com SQL.
- https://www.youtube.com/watch?v=GHpE5xOxXXI
- Super revisão de OO e SQL com Java e JDBC
Pra quê? Para que você compreenda na prática como é consultar os dados de um banco de dados
 somente com Java e JDBC, sem utilizar uma ferramenta ORM (Mapeamento Objeto-Relacional).
- https://www.youtube.com/watch?v=xC_yKw3MYX4
- Nivelamento ORM - JPA e Hibernate
Pra quê? Para que você tenha uma introdução teórica e prática sobre ORM com JPA, antes de ir direto
  para o Spring com o Spring Data JPA.
- https://www.youtube.com/watch?v=CAP1IPgeJkw



# Salvar entidades associadas para-um


![Web 0](https://github.com/williamsartijose/04-JPA-Consultas-SQL-JPQL/blob/main/.idea/paraum.png)
# Salvar entidades associadas para-muitos
![Web 0](https://github.com/williamsartijose/04-JPA-Consultas-SQL-JPQL/blob/main/.idea/paramuito.png)



## Evitando degradação de performance - Carregamento lazy, tratativas, Transactional 

Grande vilão da JPA 
- Grande vilão da JPA: idas e vindas desnecessárias ao banco de dados.
- Causa comum: entidades associadas lazy carregando sob demanda.
- Projeto: 
- Collection do Postman: https://www.getpostman.com/collections/d5efb333d1d308d52b7c
![Web 0](https://github.com/williamsartijose/04-JPA-Consultas-SQL-JPQL/blob/main/.idea/jpa.png)

![Web 0](https://github.com/williamsartijose/04-JPA-Consultas-SQL-JPQL/blob/main/.idea/jpa2.png)
![Web 0](https://github.com/williamsartijose/04-JPA-Consultas-SQL-JPQL/blob/main/.idea/jpa3.png)
![Web 0](https://github.com/williamsartijose/04-JPA-Consultas-SQL-JPQL/blob/main/.idea/jpa4.png)
![Web 0](https://github.com/williamsartijose/04-JPA-Consultas-SQL-JPQL/blob/main/.idea/jpa5.png)

1) Importação do projeto
O professor deverá ser capaz de fazer um simples clone do projeto Github, e importar e executar o mesmo na
IDE sem necessidade de qualquer configuração especial diferente daquelas das aulas.

2) Testes manuais no Postman
O professor já terá preparado em seu computador as requisições Postman abaixo. Todas elas deverão
funcionar corretamente:


```bash
# Busca de cliente por id

GET /clients/1

# Busca paginada de clientes

GET /clients?page=0&size=6&sort=name

# Inserção de novo cliente

POST /clients
{
 "name": "William Sarti",
 "cpf": "12345678901",
 "income": 6500.0,
 "birthDate": "1994-07-20",
 "children": 2
}

# Atualização de cliente

PUT /clients/1
{
 "name": "William Sartiiiii",
 "cpf": "12345678901",
 "income": 6500.0,
 "birthDate": "1994-07-20",
 "children": 2
}

# Deleção de cliente
DELETE /clients/1

```


## CHECKLIST: 

1. Busca por id retorna cliente existente
2. Busca por id retorna 404 para cliente inexistente
3. Busca paginada retorna listagem paginada corretamente
4. Inserção de cliente insere cliente com dados válidos
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
6. Atualização de cliente atualiza cliente com dados válidos
7. Atualização de cliente retorna 404 para cliente inexistente
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
9. Deleção de cliente deleta cliente existente
10. Deleção de cliente retorna 404 para cliente inexistente 


# Autor

William Sarti José

https://www.linkedin.com/in/william-analistadesistema/
