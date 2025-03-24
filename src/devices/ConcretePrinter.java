// A classe ConcretePrinter herda de Device e implementa funcionalidade de impressora
package devices;

public class ConcretePrinter extends Device {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber); // Chama o construtor da superclasse Device
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	public void print(String doc) { // Correção: o método deve se chamar print
		System.out.println("Printing: " + doc);
	}
}
/*
  Classe concreta ConcretePrinter
  
   ConcretePrinter estende Device, implementando processDoc, o que a torna instanciável e funcional.
   
    Ela adiciona um método específico print(), que é uma funcionalidade típica de uma impressora.
    
     Como ela implementa os comportamentos exigidos pela abstração (Device), podemos dizer que é uma classe concreta.

*/
