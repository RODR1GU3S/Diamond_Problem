# 🖨️📠 Exemplo de Herança Múltipla com Interfaces em Java

Este projeto demonstra como aplicar **herança múltipla** em Java utilizando **interfaces**.
 Como Java não permite herança múltipla de classes, o uso de interfaces é a forma adequada de implementar essa funcionalidade.

## 🚀 Objetivo

Simular dispositivos eletrônicos como impressoras, scanners e multifuncionais (combo), aplicando os **princípios da Programação Orientada a Objetos (POO)**
 e boas práticas de design, como os **princípios SOLID**.

---

## 📂 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java
└── devices/
    ├── ComboDevice.java
    ├── ConcretePrinter.java
    ├── ConcreteScanner.java
    ├── Device.java
    ├── Printer.java
    └── Scanner.java
```

---

## ⚙️ Tecnologias Utilizadas

- Java 17+ (ou superior)
- Paradigmas e princípios de design (POO, SOLID)

---

## 💡 Conceitos e Técnicas Aplicadas

### ✅ **Abstração**
A classe abstrata `Device` representa qualquer dispositivo eletrônico genérico.
 Define o método abstrato `processDoc` que deve ser implementado pelas subclasses.

```java
public abstract class Device {
    public abstract void processDoc(String doc);
}
```

---

### ✅ **Encapsulamento**
O atributo `serialNumber` da classe `Device` está protegido (privado), e acessado/modificado por meio de métodos getters e setters.

---

### ✅ **Interfaces**
As interfaces `Printer` e `Scanner` segregam funcionalidades específicas:
- `Printer` possui o método `print(String doc)`
- `Scanner` possui o método `scan()`

Isso promove um design modular e flexível.

---

### ✅ **Herança Múltipla com Interfaces**
A classe `ComboDevice` implementa **duas interfaces** (`Printer` e `Scanner`) e **herda** da classe abstrata `Device`.
 Essa composição resolve o problema da **herança múltipla**, respeitando as limitações da linguagem Java.

```java
public class ComboDevice extends Device implements Printer, Scanner {
    ...
}
```

---

### ✅ **Princípio da Segregação de Interface (ISP)** — SOLID
Cada interface define um conjunto específico de responsabilidades. Isso evita que classes dependam de métodos que não usam, promovendo a coesão.

---

### ✅ **Programação Orientada a Interfaces**
No `main`, o uso de polimorfismo é evidente com o `ComboDevice`, que age como impressora e scanner por meio das interfaces.

---

## 🧪 Demonstração

```java
ComboDevice c = new ComboDevice("2081");
c.processDoc("My dissertation:");
c.print("My dissertation");
System.out.println("Scan result: " + c.scan());
```

Saída esperada:

```
Combo processing: My dissertation:
Combo printing: My dissertation
Scan result: Combo scan result
```

---

## 🧼 Boas Práticas Aplicadas

- **Nomes descritivos e intuitivos** para classes e métodos.
- **Código limpo** e organizado em pacotes (`devices`, `application`).
- **Separação de responsabilidades**, cada classe com um único propósito.
- **Evita repetição** de código com uso de herança e interfaces.

---

## 📘 Conclusão

Este exemplo mostra como aplicar **herança múltipla de maneira segura** e eficaz em Java, utilizando interfaces para representar comportamentos distintos. Também reforça a importância de **design orientado a princípios**, resultando em código mais **manutenível, reutilizável e escalável**.

---
