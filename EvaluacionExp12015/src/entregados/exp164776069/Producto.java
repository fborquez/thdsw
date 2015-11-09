package entregados.exp164776069;

import java.util.*;
public class Producto{
  
  private String nombre;
  private int cantidad; 
  private String tipoUnidad; 
  private int precio; 
  private int descuento; 
  private int totalProducto; 
  
  public Producto ()
  {
    
  }  
  
  public Producto (String Nombre,  String TipoUnidad, int Precio, int Descuento)
  {
    this.nombre = Nombre;
    this.tipoUnidad= TipoUnidad; 
    this.precio= Precio; 
    this.descuento= Descuento; 
  }  
  
  public Producto (String Nombre, int Cantidad, String TipoUnidad, int Precio, int Descuento)
  {
    this.nombre = Nombre;
    this.cantidad = Cantidad; 
    this.tipoUnidad= TipoUnidad; 
    this.precio= Precio; 
    this.descuento= Descuento;     
  }  
  public void SetNombre(String Nombre)
  {
    this.nombre = Nombre; 
  }
  public String GetNombre()
  {
    return this.nombre;
  }
  public void SetCantidad(int Cantidad)
  {
    this.cantidad = Cantidad; 
  }
  public int GetCantidad()
  {
    return this.cantidad;
  }  
  
  public void SetTipoUnidad(String TipoUnidad)
  {
    this.tipoUnidad = TipoUnidad; 
  }
  public String GetTipoUnidad()
  {
    return this.tipoUnidad;
  }
  
  public void SetPrecio(int Precio)
  {
    this.precio = Precio; 
  }
  public int GetPrecio()
  {
    return this.precio;
  }
  
  public void SetDescuento(int Descuento)
  {
    this.descuento = Descuento; 
  }
  public int GetDescuento()
  {
    return this.descuento;
  }
  
  public int GetTotalProducto()
  {
    return this.cantidad*((this.precio*(100-this.descuento))/100);
  }
  
  
  public void ImprimirFacturaProducto()
  {
    System.out.println(this.nombre+" "+this.cantidad+ " "+this.tipoUnidad+"             $"+this.precio+".-            $"+ this.GetTotalProducto());    
  }  
  
  public void ImprimirProducto()
  {
    System.out.println(this.nombre+" "+this.cantidad+ " "+this.tipoUnidad+"             $"+this.precio);    
  } 
}