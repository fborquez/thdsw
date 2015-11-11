package cl.usm.ejercicio.herencia;

public class Personaje {
	

	String nombre;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return getNombre();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
