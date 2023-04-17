package test;

import domain.Persona;
import domain.Ascensor;
import domain.Avion;
import domain.Deportista;
import domain.CajeroAutomatico;

public class EjerciciosCreacionObjetos {

	public static void main(String[] args) {

		//Instancio objetos
		Persona persona = new Persona();
		Ascensor ascensor = new Ascensor();
		Avion avion = new Avion();
		Deportista deportista = new Deportista();
		CajeroAutomatico cajeroAutomatico = new CajeroAutomatico();
		
		
		//Llamo meotodos de los objetos	
		persona.caminar();
		persona.saltar();
		persona.hablar();
		
		ascensor.subir();
		ascensor.bajar();
		
		avion.aterrizar();
		avion.volar();
		
		deportista.correr();
		deportista.saltar();
		deportista.descansar();
		
		cajeroAutomatico.retirarDinero();
		cajeroAutomatico.ingresarDinero();
		cajeroAutomatico.transferirDinero();
		
		

	}

}
