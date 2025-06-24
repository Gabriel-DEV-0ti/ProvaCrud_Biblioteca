Prova Prática – Técnico em Desenvolvimento de Sistemas
Tema: Catálogo de Livros de Biblioteca

Contextualização
Uma biblioteca pública está em processo de modernização e precisa de um
sistema que auxilie no cadastro dos livros e dos bibliotecários responsáveis por
cada registro.

Atualmente, os dados são organizados em planilhas, o que dificulta a consulta e o
controle de empréstimos. O novo sistema deve permitir:

• O cadastro de bibliotecários com seus dados básicos.

• O cadastro de livros, vinculados a um bibliotecário.

• A edição, exclusão e alteração do status dos livros (Disponível,
Emprestado, Reservado).


Desafio

Utilizando os conhecimentos adquiridos ao longo do curso, desenvolva uma
aplicação de catálogo de livros com os seguintes requisitos:
Dados do bibliotecário:

• ID (gerado automaticamente)

• Nome

• E-mail


Dados do livro:

• ID (gerado automaticamente)

• ID do bibliotecário responsável (chave estrangeira)

• Título

• Autor

• Gênero (Romance, Técnico, Fantasia, etc.)

• Status (Disponível, Emprestado, Reservado) – padrão: Disponível

• Data de cadastro

Regras de negócio:

• Um bibliotecário pode cadastrar vários livros, mas cada livro deve estar
vinculado a apenas um bibliotecário.

• Todos os campos são obrigatórios.

• O sistema deve permitir cadastrar, editar e excluir registros de livros.

• O status do livro pode ser alterado após o cadastro.

Entregas
No Entrega Descrição

1
Diagrama Entidade-
Relacionamento (DER)

Modelo lógico do banco contendo as tabelas
bibliotecarios e livros, com seus campos,
relacionamentos e tipos.

2
Criação do Banco de
Dados

Criação das tabelas no SGBD com todos os campos
obrigatórios e exportação do script .sql.

3
Diagrama de Caso de
Uso

Diagrama ilustrando o fluxo de uso do sistema de
cadastro.

4 API Spring Boot

Backend com os endpoints de cadastro, listagem,
edição e exclusão de bibliotecários e livros.

5
Tela de Cadastro de
Bibliotecário

Formulário com validação e persistência dos
dados.

6 Tela de Cadastro de Livro

Formulário que permite associar o livro a um
bibliotecário já existente, com os campos
necessários e controle de status.
