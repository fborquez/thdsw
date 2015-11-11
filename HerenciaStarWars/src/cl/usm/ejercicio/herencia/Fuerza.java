package cl.usm.ejercicio.herencia;

public class Fuerza extends Personaje {
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fuerza:"+super.toString();
	}

	int midiGlorias;

	public int getMidiGlorias() {
		return midiGlorias;
	}

	public void setMidiGlorias(int midiGlorias) {
		this.midiGlorias = midiGlorias;
	}

}
