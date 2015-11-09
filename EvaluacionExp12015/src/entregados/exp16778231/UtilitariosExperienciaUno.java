package entregados.exp16778231;

import java.util.Scanner;
/**
 * Clase utilizada para manejar valores de input y operadores genéricos para experiencia1
 * @autor Luis Lopez Alamos 20-10-2015
 */
public class UtilitariosExperienciaUno{
  
  public Scanner teclado;
  
  public UtilitariosExperienciaUno(){
    Scanner teclado = new Scanner(System.in);
  }
  
  public String leeString(){
    return this.teclado.next(); 
  }
  
  public int leeInt(){
    return this.teclado.nextInt();
  }
  
  public void pinta(String mensaje){
   System.out.println(mensaje); 
  }
}