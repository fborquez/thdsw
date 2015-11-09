package entregados.exp164776069;

import java.util.*;
public class Supermercado{
  
  private String nombre;
  private String rut; 
  
  public Supermercado ()
  {
    
  }  
  public void SetNombre(String Nombre)
  {
    this.nombre = Nombre; 
  }
  
  public void SetRut(String Rut)
  {
    this.rut = Rut; 
  }
  
  public String GetNombre()
  {
    return this.nombre;
  }
  
  public String GetRut()
  {
    return this.rut;
  }  
  public void ImprimirCliente()
  {
    System.out.println("El cliente "+this.nombre+" numero de rut "+this.rut+ ", el cual posee las siguiente lineas: ");    
  }  
}