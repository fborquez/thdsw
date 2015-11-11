package entregados.exp16778231;

import java.util.Scanner;
/**
 * Clase Envoltorio que contiene datos de Supermercado
 * @autor Luis Lopez Alamos 20-10-2015
 */
public class Supermercado{
 
  public Supermercado(){
    this.carrito  = new Carro[5];
  }
  
  private Carro[] carrito;  
    
  //declaracion de getter y setter
  public Carro[] getCarrito(){
    return this.carrito;
  }
 
  public void setCarrito(Carro[] carrito){
    this.carrito = carrito;
  }  
}


