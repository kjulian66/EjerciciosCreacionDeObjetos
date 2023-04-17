package domain;

public class CajeroAutomatico {
	
	//Atributos
	private String nombreCliente;
	private String apellidoCliente;
	private Integer saldoCliente;
	
	//Metodos
	public void retirarDinero () {
		System.out.println("Dinero extraido");
	}
	
	public void ingresarDinero () {
		System.out.println("Dinero ingresado");
	}
	
	public void transferirDinero () {
		System.out.println("Dinero transferido");
	}

}
