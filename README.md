# StockFlow API

## Visão Geral
StockFlow é uma API RESTful desenvolvida para gestão de inventário em ambientes corporativos. O sistema provê controle integral sobre o ciclo de vida de produtos, com foco em rastreabilidade, integridade de dados e auditoria de movimentações.

## Arquitetura e Tecnologias
O projeto foi estruturado seguindo o padrão de arquitetura em camadas (Controller, Service, Repository, DTO), utilizando:

- **Linguagem**: Java 21
- **Framework**: Spring Boot 3.x
- **Persistência**: PostgreSQL
- **Mapeamento**: Spring Data JPA / Hibernate
- **Infraestrutura**: Docker e Docker Compose
- **Utilitários**: Lombok para redução de código repetitivo

## Funcionalidades Principais
- **Gestão de Produtos**: Cadastro, atualização e consulta com validação de SKU único.
- **Movimentações de Estoque**: Registro de entradas e saídas com validação de regras de negócio para evitar estados de estoque inconsistentes.
- **Auditoria**: Registro persistente de histórico, identificando o responsável e o contexto da operação.
- **Consultas de Inventário**: Endpoints para verificação de níveis críticos de estoque.

## Instruções de Execução

1. **Clonagem do repositório**
   `git clone https://github.com/GabriellMartins/stockflow.git`

2. **Subida do ambiente de banco de dados**
   `docker compose up -d`

3. **Execução da aplicação**
   `./gradlew bootRun`

---
*Projeto desenvolvido com foco em padrões de engenharia de software, escalabilidade e manutenibilidade.*
