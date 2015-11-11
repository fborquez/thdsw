package entregados.exp164776069;

import java.util.*;

public class Carro{
 
  ArrayList<Producto> _productos = new ArrayList<Producto>();
  private int numeroCarro= 0;
  
  public Carro ()
  {
    _productos = new ArrayList<Producto>();
  }  
  
  
  public void AddProducto (Producto prod)
  {
    _productos.add(prod);
  }
  
  public void SetNumeroCarro(int numero)
  {
    this.numeroCarro = numero;
  }
  
  public int GetNumeroCarro()
  {
    return this.numeroCarro;
  }
  
  public void PrintNumeroCarro()
  {
    System.out.println("Carros N°: " + this.numeroCarro);
  }
  
  public void eliminarProducto(int index)
  {
    this._productos.remove(index-1);
  }
   
   
  public void ImprimirFactura()
  {
    int auxTotalFactura = 0;
    System.out.println("Factura detalle del carro es el siguiente: ");   
    
    for(Producto prod :this._productos)
    {
      auxTotalFactura= prod.GetTotalProducto() +auxTotalFactura;
      prod.ImprimirFacturaProducto();
    }
    System.out.println("\t\t\t\t\tTotal a Facturar= $"+ auxTotalFactura);  
  }  
  
   public void ImprimirProductos()
  {
   
    System.out.println("El carro contiene los siguiente productos: ");   
    
    for(Producto prod :this._productos)
    {
      
      prod.ImprimirProducto();
    }
   
  } 
}