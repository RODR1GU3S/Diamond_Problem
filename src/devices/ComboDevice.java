// A classe ComboDevice implementa tanto Scanner quanto Printer
// Demonstrando o uso de interfaces para resolver o problema da herança múltipla
// Aplica o princípio da Segregação de Interface (ISP) do SOLID
package devices;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}
	
}
