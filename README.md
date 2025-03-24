# Dispositivos Concretos de Impressão e Digitalização em Java

Este projeto demonstra o uso de herança, interfaces e classes abstratas em Java para modelar dispositivos eletrônicos como impressoras, scanners e dispositivos multifuncionais. Utiliza implementações concretas dessas funcionalidades.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes e classes:

### Pacote `application`
- **`Program`**: Classe principal que instancia e executa os dispositivos concretos.

### Pacote `devices`
- **`Device`**: Classe abstrata que representa um dispositivo com um número de série e um método abstrato `processDoc()`.
- **`ConcreteScanner`**: Implementa um scanner concreto, herda de `Device` e possui o método `scan()`.
- **`ConcretePrinter`**: Implementa uma impressora concreta, herda de `Device` e possui o método `print()`.
- **`ComboDevice`**: Dispositivo multifuncional concreto que combina `Scanner` e `Printer`, implementando ambas as interfaces.
- **`Scanner`**: Interface que define o método `scan()`.
- **`Printer`**: Interface que define o método `print()`.

## Funcionamento

A classe `Program` testa as funcionalidades dos dispositivos concretos:
1. Cria e utiliza um `ConcreteScanner`.
2. Cria e utiliza um `ConcretePrinter`.
3. Cria e utiliza um `ComboDevice`, que pode imprimir e escanear.

### Exemplo de Saída
```plaintext
Scanner processing: My Email
Scan result: Scanned content

Printer processing: My Letter
Printing: My Letter

Combo processing: My dissertation: 
Combo printing: My dissertation
Scan result: Combo scan result
```

## Tecnologias Utilizadas
- **Java 8+**
- **Paradigmas:** Programação Orientada a Objetos (POO)
- **Princípios:** Herança, polimorfismo, encapsulamento, abstração

## Como Executar o Programa
1. Clone o repositório ou copie os arquivos.
2. Compile as classes:
   ```sh
   javac application/Program.java devices/*.java
   ```
3. Execute o programa:
   ```sh
   java application.Program
   ```

## Autores e Reconhecimentos
Alan Kay: Pioneiro da Programação Orientada a Objetos (POO).

Erich Gamma e outros: Autores de Design Patterns, influenciaram o uso de interfaces e classes abstratas.

Robert C. Martin ("Uncle Bob"): Popularizou os conceitos de Clean Code, que foram seguidos ao longo do desenvolvimento deste projeto.

Professor Nélio Alves: Professor responsável pelo curso que forneceu o conhecimento e as bases para a implementação dos conceitos de POO e Design Patterns utilizados neste projeto.

Ronaldo Rodrigues: Estudante que está se especializando em programação, aplicando os conhecimentos adquiridos no curso.

