package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		// Instanciando um scanner concreto
		ConcreteScanner s = new ConcreteScanner("1080");
		s.processDoc("My Email"); // Método da superclasse Device
		System.out.println("Scan result: " + s.scan()); // Método específico de Scanner

		System.out.println();
		// Instanciando uma impressora concreta
		ConcretePrinter p = new ConcretePrinter("2003");
		p.processDoc("My Letter"); // Método da superclasse Device
		p.print("My Letter"); // Método específico de ConcretePrinter

		System.out.println();
		// Instanciando um dispositivo multifuncional (combo)
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation: "); // Método da superclasse Device
		c.print("My dissertation"); // Método da interface Printer
		System.out.println("Scan result: " + c.scan()); // Método da interface Scanner
	}
}
/* O que significa “concreto” na POO?

  Classes abstratas (como Device) servem apenas como modelos, não podem ser instanciadas diretamente.

   Classes concretas (como ConcreteScanner, ConcretePrinter, ComboDevice) possuem implementação completa e podem ser
    usadas diretamente no código.


 Isso segue os princípios da Programação Orientada a Objetos (POO), especialmente:

  Abstração: Device define um modelo genérico de dispositivos.

  Herança: ConcreteScanner e ConcretePrinter herdam comportamentos de Device.

  Encapsulamento: O número de série (serialNumber) é protegido e acessado via métodos.

  Polimorfismo: ConcreteScanner e ConcretePrinter podem ser tratados como um Device, permitindo flexibilidade no código.
   
*/
