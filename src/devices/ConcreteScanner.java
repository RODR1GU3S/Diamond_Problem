// A classe ConcreteScanner herda de Device e implementa funcionalidade de scanner
package devices;

public class ConcreteScanner extends Device {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber); // Chama o construtor da superclasse Device
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	public String scan() {
		return "Scanned content";
	}
}
/*
  Classe concreta ConcreteScanner

   ConcreteScanner estende Device, implementando processDoc, o que a torna instanciável e funcional.

    Ela adiciona um método específico scan(), que é uma funcionalidade típica de um scanner.

     Como ela implementa os comportamentos exigidos pela abstração (Device), podemos dizer que é uma classe concreta.

*/
