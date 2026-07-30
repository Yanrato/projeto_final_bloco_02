# 💊 Farmácia API

Projeto desenvolvido em **Spring Boot** para gerenciamento de uma farmácia.

A aplicação permite o gerenciamento de **Produtos** e **Categorias**, com relacionamento entre as entidades e autenticação utilizando Spring Security.

## 🚀 Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Spring Security
- JWT
- Swagger/OpenAPI
- JUnit

## 📌 Funcionalidades

### Categoria
- Criar categoria
- Listar categorias
- Buscar por ID
- Buscar por nome
- Atualizar categoria
- Deletar categoria

### Produto
- Criar produto
- Listar produtos
- Buscar por ID
- Buscar por nome
- Atualizar produto
- Deletar produto

## 🔗 Relacionamento

Categoria possui relacionamento **1:N** com Produto:

- Uma categoria pode ter vários produtos.
- Um produto pertence a uma categoria.

## 🔐 Segurança

A aplicação possui autenticação e autorização utilizando **Spring Security com JWT**.

## 🧪 Testes

Foram implementados testes automatizados utilizando **JUnit**.

## 📖 Documentação da API

A API possui documentação utilizando **Swagger/OpenAPI**.

## ☁️ Deploy

Aplicação publicada na nuvem utilizando Render:

https://projeto-final-bloco-02-eae4.onrender.com

## 👨‍💻 Desenvolvedor

Yan Ferreira
