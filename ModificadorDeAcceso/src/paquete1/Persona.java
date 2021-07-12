package paquete1;

public class Persona {

	String nombre="";
	private int edad=0;
	protected String domoicilio="";
	float estatura =0;
	
	
	String saludar() {
		return "Hola, mi nombre es " + this.nombre;
	}

}
