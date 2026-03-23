# Checkpoint 1 - Java Advanced: JPA, Hibernate e Reflection

## 👨‍💻 Integrantes do Grupo
* Kaiky Pereira Rodrigues Da Silva - RM564578
* Gabriel Costa Solano - RM562325
* Leandro Guarido - RM561760

## 🎯 Sobre o Projeto
Este projeto foi desenvolvido para a disciplina de Java Advanced da FIAP. O objetivo é demonstrar o mapeamento objeto-relacional utilizando JPA e Hibernate, além de utilizar a API Reflection para gerar instruções SQL dinamicamente. A estratégia de herança escolhida foi a `JOINED`.

---

## 📸 Evidências de Teste (CRUD e Reflection)
Abaixo estão as comprovações de cada etapa executada no console do IntelliJ e refletidas no banco de dados Oracle SQL Developer.

### 1. Geração de SQL via Reflection
*(Arraste e solte aqui a imagem do console mostrando o `SELECT * FROM TAB_FUNCIONARIO` gerado pela classe GeradorSQL)*

### 2. CREATE (Inserção de Dados)
**Execução no IDE:**
*(Arraste e solte aqui a imagem do console com o `Hibernate: insert into...`)*

**Modificação no Banco de Dados:**
*(Arraste e solte aqui aquele primeiro print do Oracle mostrando a tabela com suas 160 horas)*

### 3. READ (Leitura e Sobrescrita de Método)
*(Arraste e solte aqui a imagem do console mostrando o Select e o print `[SÊNIOR] Nome: Kaiky | Salário...`)*

### 4. UPDATE (Atualização de Dados)
**Execução no IDE:**
*(Arraste e solte aqui a imagem do console com o `Hibernate: update...`)*

**Modificação no Banco de Dados:**
*(Arraste e solte aqui a imagem do Oracle mostrando a atualização das horas)*

### 5. DELETE (Remoção de Dados)
**Execução no IDE:**
*(Arraste e solte aqui a imagem do console com o `Hibernate: delete...`)*

**Modificação no Banco de Dados:**
*(Arraste e solte aqui o último print que você tirou do Oracle, mostrando a tabela vazia)*