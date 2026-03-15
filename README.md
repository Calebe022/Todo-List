# ✅ Todo-List

> Lista de tarefas interativa desenvolvida em Java como parte do processo de aprendizado de coleções, estruturas de controle e orientação a objetos.

---

## 📋 Sobre o Projeto

O **Todo-List** é uma aplicação de console feita em Java que permite ao usuário gerenciar suas tarefas do dia a dia diretamente pelo terminal. O projeto foi desenvolvido com foco em praticar o uso de **coleções Java** (`ArrayList`), **Programação Orientada a Objetos** e a organização de um sistema CRUD simples (Create, Read, Update, Delete) sem o uso de banco de dados.

Toda a interação acontece por meio de um menu no terminal, tornando o projeto ideal para consolidar fundamentos antes de partir para aplicações com interface gráfica ou web.

---

## ✨ Funcionalidades

- ✅ Adicionar uma nova tarefa
- ✅ Listar todas as tarefas cadastradas
- ✅ Marcar uma tarefa como concluída
- ✅ Remover uma tarefa da lista
- ✅ Visualização do status de cada tarefa (pendente / concluída)
- ✅ Menu interativo em loop contínuo no terminal

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|--------|
| Java | 8+ |
| IntelliJ IDEA | IDE utilizada no desenvolvimento |

Sem dependências externas — o projeto utiliza apenas a biblioteca padrão do Java (`java.util.ArrayList`, `java.util.Scanner`).

---

## 📁 Estrutura do Projeto

```
Todo-List/
├── .idea/                  # Configurações do IntelliJ IDEA
├── src/                    # Código-fonte principal
│   ├── Main.java           # Ponto de entrada — menu e fluxo principal
│   └── Tarefa.java         # Classe que representa uma tarefa (modelo)
├── .gitignore              # Arquivos ignorados pelo Git
└── lista-de-tarefas.iml    # Arquivo de módulo do IntelliJ IDEA
```

### Descrição dos arquivos

- **`Main.java`** — Contém o método `main`, o menu interativo e toda a lógica de fluxo do programa. É o ponto de entrada da aplicação.
- **`Tarefa.java`** — Modelo que representa uma tarefa individual, com atributos como nome/descrição e status (pendente ou concluída).
- **`.idea/`** — Pasta gerada automaticamente pelo IntelliJ IDEA com configurações do projeto. Não faz parte da lógica da aplicação.
- **`lista-de-tarefas.iml`** — Arquivo de configuração de módulo do IntelliJ IDEA, que define o SDK e os caminhos de build.

> ⚠️ Os nomes dos arquivos dentro de `src/` são uma estimativa com base na estrutura típica do projeto. Caso os nomes reais sejam diferentes, basta atualizar esta seção.

---

## 🖥️ Como o Programa Funciona

Ao iniciar, o programa exibe um menu no terminal com as opções disponíveis:

```
===== TODO LIST =====

1 - Adicionar tarefa
2 - Listar tarefas
3 - Concluir tarefa
4 - Remover tarefa
5 - Sair

Escolha uma opção:
```

O fluxo de execução segue estas etapas:

1. O usuário escolhe uma opção digitando o número correspondente.
2. Para **adicionar**, o programa solicita o nome/descrição da tarefa e a insere na lista.
3. Para **listar**, todas as tarefas são exibidas com seu status atual (pendente ou concluída).
4. Para **concluir**, o usuário informa o número da tarefa e ela é marcada como feita.
5. Para **remover**, o usuário informa o número da tarefa e ela é deletada da lista.
6. O menu retorna automaticamente após cada ação, permitindo novas operações.
7. Ao selecionar **Sair**, o programa encerra corretamente.

---

## 🚀 Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html) instalado

Para verificar a instalação:

```bash
java -version
javac -version
```

### Passos

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Calebe022/Todo-List.git
   ```

2. **Acesse a pasta do projeto:**

   ```bash
   cd Todo-List/src
   ```

3. **Compile os arquivos:**

   ```bash
   javac *.java
   ```

4. **Execute o programa:**

   ```bash
   java Main
   ```

> Alternativamente, abra o projeto no **IntelliJ IDEA** e execute a classe `Main` diretamente pela IDE.

---

## 🧠 Conceitos Praticados

Este projeto foi desenvolvido para consolidar os seguintes fundamentos de Java:

- **Classes e Objetos** — modelagem da entidade `Tarefa` com atributos e comportamentos próprios
- **`ArrayList`** — coleção dinâmica para armazenar e manipular as tarefas em memória
- **`Scanner`** — leitura de dados digitados pelo usuário no console
- **Encapsulamento** — uso de atributos privados com getters e setters na classe `Tarefa`
- **Estrutura `while`** — loop para manter o menu ativo entre as operações
- **Estruturas condicionais `if / else if`** — seleção da ação correta com base na entrada do usuário
- **Iteração sobre coleções** — percorrer a lista de tarefas para exibição e manipulação
- **CRUD básico** — criar, listar, atualizar e deletar registros em memória

---

## 📌 Status do Projeto

🟡 **Concluído para fins de aprendizado** — Projeto funcional desenvolvido para praticar coleções e POO em Java. Possíveis evoluções incluem persistência de dados em arquivo e interface gráfica.

---

## 👨‍💻 Autor

Desenvolvido por **Calebe** como parte da sua jornada de aprendizado em Java.

- GitHub: [@Calebe022](https://github.com/Calebe022)

---

## 📄 Licença

Este projeto está disponível livremente para fins educacionais.
