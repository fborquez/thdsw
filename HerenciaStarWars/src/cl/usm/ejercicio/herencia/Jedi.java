package cl.usm.ejercicio.herencia;

public class Jedi extends Fuerza {
	
		
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Soy un JEDI!"+super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	int nivelAtaque;
	int habilidad;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Jedi Nivel Ataque:"+this.nivelAtaque+super.toString();
	}
	
	public int getNivelAtaque() {
		return nivelAtaque;
	}
	public void setNivelAtaque(int nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}
	public int getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(int habilidad) {
		this.habilidad = habilidad;
	}
	

}
