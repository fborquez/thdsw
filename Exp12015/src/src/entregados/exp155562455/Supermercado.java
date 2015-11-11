/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Supermercado {
  
  //Variables
  public String nombre;
  public int numCarritos = 5;
  
  //Instancio Clase Carrito
  private Carrito[] carritos = new Carrito[numCarritos];
  
  
  public Supermercado(String nombre) { 
    /* YOUR CONSTRUCTOR CODE HERE*/
    for (int i = 0; i < this.carritos.length; i++) {
      this.carritos[i] = new Carrito();
    }
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  
  /* ADD YOUR CODE HERE */
  
}


