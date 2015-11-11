package entregados.exp16778231;

import java.util.Scanner;
/**
 * Clase Envoltorio que contiene datos de Carrito de compras
 * @autor Luis Lopez Alamos 20-10-2015
 */
public class Carro{
 
  private Producto[] prod;  
  
  //declaracion de getter y setter
  public Producto[] getProd(){
    return this.prod;
  }
 
  public void setProd(Producto[] prod){
    this.prod = prod;
  }  
  
  
  
}