package cl.usm.ejercicio;

import java.util.ArrayList;
import java.util.Iterator;

import cl.usm.myobjects.CustomerClass;


public class FirstEclipseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerClass cc = new CustomerClass();
		cc.setName("Alexis Sanchez");		
		System.out.println("Cliente>:"+cc.getName());
		
		ArrayList<CustomerClass> lista = new ArrayList<CustomerClass>();
		lista.add(cc);
		lista.add(cc);
		lista.add(cc);
		lista.add(cc);
		lista.add(cc);
		
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			CustomerClass customerClass = (CustomerClass) iterator.next();			
			System.out.println("->"+customerClass.getName());
		}

	}

}
