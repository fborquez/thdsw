/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Producto{
  private String nombre;
  private int precio = 0;
  private int cantidad = 0;
  private Catalogo catalogo;
  
  public Producto(){
    this.nombre = "";
    this.precio = 0;
    this.cantidad = 0;
    this.catalogo = new Catalogo("");
  }
  
  public Producto(String nombre, int precio, int cantidad, Catalogo catalogo){
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
    this.catalogo = catalogo;
  }
  
  //Calcula el Precio total por producto
  public int getPrecio() {
     return this.precio * this.cantidad;
   }

  //Retorna Cantidad Producto
  public double getCantidad()
  {
  return cantidad;
  }
  
  //Retorna Nombre del Producto
  public String getProducto(){
  return nombre;
  }
  
  //Retorna el valor de todo el Objeto Producto y nombre en el Catalogo
  public String toString() {
    if (this.nombre != "")
      return this.catalogo.getNombre() + " - " + this.nombre + ": $" + this.precio + " x " + this.cantidad + " = " + (this.getPrecio()) + ".-"; 
    else
      return "(Vacío)";
  }
  
 
}