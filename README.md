# Lista de Produtos em Java

## Sobre o Projeto

Aplicação desenvolvida em Java para cadastro e listagem de produtos, utilizando o padrão arquitetural MVC (Model-View-Controller).

O projeto foi desenvolvido como exercício prático de Arquitetura de Software, com o objetivo de aplicar a separação de responsabilidades e melhorar a organização do código.

## Funcionalidades

- Cadastro de produtos com nome, preço e quantidade em estoque.
- Listagem dos produtos cadastrados.
- Validação dos dados informados.
- Menu interativo via terminal.

## Tecnologias Utilizadas

- Java 17
- Visual Studio Code

## Arquitetura do Projeto

O projeto utiliza o padrão MVC, separando a aplicação em três camadas:

- **Model:** representa os produtos, armazena os dados e realiza validações.
- **View:** apresenta o menu, recebe as informações do usuário e exibe os resultados no terminal.
- **Controller:** coordena as ações do usuário e conecta o Model à View.

## Estrutura de Pastas

```text
lista/
├── src/
│   ├── model/
│   │   ├── Produto.java
│   │   └── ProdutoModel.java
│   ├── view/
│   │   └── ProdutoView.java
│   ├── controller/
│   │   └── ProdutoController.java
│   └── App.java
├── .gitignore
└── README.md
```

## Como Executar

Certifique-se de ter o Java Development Kit (JDK) 17 ou superior instalado.

Na raiz do projeto, execute os comandos abaixo no terminal PowerShell:

```powershell
javac --release 17 -encoding UTF-8 -d bin src\App.java src\model\Produto.java src\model\ProdutoModel.java src\view\ProdutoView.java src\controller\ProdutoController.java
```

Em seguida, inicie a aplicação:

```powershell
java -Dfile.encoding=UTF-8 -cp bin App
```

## Observações

Os produtos são armazenados em memória durante a execução. Os dados não são persistidos em arquivos ou banco de dados e são perdidos quando o programa é encerrado.

## Objetivo Acadêmico

Praticar os conceitos de orientação a objetos, organização de código e arquitetura MVC por meio de uma aplicação de cadastro de produtos em Java.
