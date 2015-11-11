package cl.usm.ejercicio.guerra;

import cl.usm.ejercicio.herencia.Jedi;
import cl.usm.ejercicio.herencia.Personaje;
import cl.usm.ejercicio.herencia.Robot;

public class GalaxiaEndor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje princesa=new Personaje();
		princesa.setNombre("Leya");
		
		Robot r2d2=new Robot();
		r2d2.setNombre("Arturito");
		
		Personaje padawan=new Jedi();
		padawan.setNombre("AnakinSkyWalker");	
		
				
		System.out.println("Personaje CAST padawan:"+((Personaje)padawan));
		
		Jedi jedi= (Jedi) padawan;		
		jedi.setHabilidad(1);
		jedi.setMidiGlorias(1);
		jedi.setNivelAtaque(2);
		
		System.out.println("Personaje:"+princesa.getNombre());
		
		System.out.println("Personaje princesa:"+princesa);
		System.out.println("Personaje r2d2:"+r2d2);
		System.out.println("Personaje padawan:"+padawan);
		System.out.println("Personaje jedi:"+jedi);
		System.out.println("Nombre jedi:"+jedi.getNombre());
		jedi.setNombre("DarkVader");
		System.out.println("Nombre jedi:"+jedi.getNombre());
		padawan.setNombre("JarJarBenks");
		System.out.println("Nombre jedi:"+jedi.getNombre());
		

	}

}
