package entregados.exp16778231;

import java.util.Scanner;
/**
 * Clase Envoltorio que contiene datos de productos
 * @autor Luis Lopez Alamos 20-10-2015
 */
public class Producto{
 
  private String descripcion;
  
  private int cantidad;
  
  //falta el tipo
  
  private int precio;
    
  private boolean tieneDescuento;
  
  
  //declaracion de getter y setter
  public String getDescripcion(){
    return this.descripcion;
  }
 
  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
  }
  
  public int getCantidad(){
    return this.cantidad;
  }
 
  public void setCantidad(int precio){
    this.precio = precio;
  }
  
  public int getPrecio(){
    return this.precio;
  }
 
  public void setPrecio(int precio){
    this.precio = precio;
  }
  
   public boolean getTieneDescuento(){
    return this.tieneDescuento;
  }
 
  public void setTieneDescuento(boolean tieneDescuento){
    this.tieneDescuento = tieneDescuento;
  }
  
}