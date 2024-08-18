## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Tipos primitivos de dados

Os oito tipos primitivos de Java são:
int, byte, short, long, float, double, boolean e char - Esses tipos não são considerados objetos e portanto representam valores brutos.
Eles são armazenados diretamente na pilha de memória. (Memory satck)

## Operadores

= Operador de atribuição - Responsável por atribuir ou substituir/sobrescrever um valor de uma variável
(+ adição, - subtração, * multiplicação, /divisão, % módulo) Operadors aritiméticos- Utilizados para realizar operações matemáticas entre valores numéricos (Obs: O operador de adição quando utilizado com variáveis do tipo texto ele realizará a concatenação de textos)

Operadores unários

(+) Operador de valor negativo - Números são positivos sem esse operador explicitamente
(-) Operador unário de valor negativo - nega um número ou expressão aritmética
(++)Operador unário de incremento de valor - Incrementa o valor em 1 unidade
(--)Operador unário de decremento de valor - Decrementa o valor em 1 unidade 
(!) OPerador unário lógico de negação - Nega o valor de uma expressão booleana

Operador Ternário

É uma forma resumida para definir uma condição e escolher por um dntre dois valores. Você deve pensar em uma consição ternário como um IF normal porém todas estrutura escrita em uma única linha.
"<expressão condicional> ? <caso a condição seja true : <caso a condição seja falsa>"

Operadores relacionais

Os operadores realcionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, defienm se o operando à esquerda é igual, diferente, enor, menor ou igual, maior, maior ou igual ao da direita, reotrnando um valor booleano como resultado.

(==) Quando desejamos verificar se uma variável é IGUAL A outra
(!=) Quando desejamos verificar se uma variável é DIFERENET da outra
(>) Quando desejamos verificar se uma variável é MAIOR QUE da outra
(>=) Quando desejamos verificar se uma variável é MAIOR OU IGUAL QUE da outra
(<) Quando desejamos verificar se uma variável é MENOR QUE da outra
(<=) Quando desejamos verificar se uma variável é MENOR OU IGUAL QUE da outra

Observação: Ao comparar objetos é melhor e mais usuál utilizar a função .equals()

Operadores Lógicos

Representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões

(&&) Operador lógico "E"
(||) Operador lógico "OU"

## Métodos

Correspondem a funçoes ou sub-rotinas disponíveis dentro das nossas classes.
Convenções de escrita de métodos:

- Deve ser nomeado como verbo
- Seguir o padrão camelCase (TOdas as letras minúsculas com exceção da primeira letra da segunda palavra)

Exemplos:

somar(int n1, int n2){}
abrirConexao() {}
findById(int id){}

2 aspectos que necessitam ser analizados antes da escrita do método:

1 - Qual a proposta do método?
2 - Qual o tipo de retorno esperado após executar o método?

