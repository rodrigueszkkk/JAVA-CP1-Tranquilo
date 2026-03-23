# Checkpoint 1 - Java Advanced: JPA, Hibernate e Reflection

## 👨‍💻 Integrantes do Grupo
* Kaiky Pereira Rodrigues Da Silva - RM564578
* Gabriel Costa Solano - RM562325
* Leandro Guarido - RM561760

## 🎯 Sobre o Projeto
[_start]Este projeto foi desenvolvido para a disciplina de Java Advanced da FIAP. O objetivo é demonstrar o mapeamento objeto-relacional utilizando JPA e Hibernate, além de utilizar a API Reflection para gerar instruções SQL dinamicamente. [_start]A estratégia de herança escolhida foi a `JOINED` com a criação de uma classe para um funcionário sênior.

---

## 📸 Evidências de Teste (CRUD e Reflection)
[_start]Abaixo estão as comprovações de cada etapa executada no console do IntelliJ e refletidas no banco de dados Oracle SQL Developer.

### 1. Geração de SQL via Reflection e Execução no IDE
[_start]*(Nesta imagem, demonstramos a geração dinâmica do SELECT via anotação @Tabela, além dos logs do Hibernate realizando as operações de banco)*
<br>
<img width="628" height="826" alt="Console Print 1" src="https://github.com/user-attachments/assets/e3e8f253-f8ba-4c61-b1fb-1836c043744e" />
<br>
<img width="489" height="767" alt="Console Print 2" src="https://github.com/user-attachments/assets/69cd132b-6004-4e38-9d0a-2423de45b5ac" />

---

### 2. Modificações no Banco de Dados (Oracle SQL Developer)
*(Abaixo, as provas de que os comandos gerados pelo Hibernate refletiram corretamente nas tabelas)*

**CREATE e READ (Inserção e Busca do Registro):**
<br>
<img width="478" height="511" alt="DB Print CREATE" src="https://github.com/user-attachments/assets/3db5c1f0-706e-4b84-9be1-a50593bc7739" />

**UPDATE (Atualização de Dados - Horas trabalhadas):**
<br>
<img width="288" height="313" alt="DB Print UPDATE" src="https://github.com/user-attachments/assets/8bfe0f0c-1b34-4ab2-9a8e-f39c0ee52a55" />

**DELETE (Remoção do Registro):**
<br>
<img width="336" height="378" alt="DB Print DELETE" src="https://github.com/user-attachments/assets/80e90efc-dede-4e4f-999a-81a4d6550425" />
