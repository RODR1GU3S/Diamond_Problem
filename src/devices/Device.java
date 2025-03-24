// A classe Device é uma classe abstrata que define um dispositivo genérico
// Aplica o princípio da programação orientada a objetos de Abstração
// Fornece um contrato base para todos os dispositivos
package devices;

public abstract class Device {

	private String serialNumber; // Uso do encapsulamento, protege o atributo

	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract void processDoc(String doc); // Método abstrato, reforçando o princípio de Abstração
}

/*
  Abstração com a classe Device

   A classe Device define um modelo genérico para dispositivos, mas não pode ser instanciada diretamente porque é abstrata.

    Ela define um método abstrato processDoc(String doc), ou seja, qualquer dispositivo que herdar de Device precisa implementar esse método.

*/
