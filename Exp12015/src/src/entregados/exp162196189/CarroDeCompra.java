package entregados.exp162196189;

import java.util.ArrayList;

public class CarroDeCompra
{  
  private ArrayList <Producto> producto = new ArrayList <Producto>();
  private int totalCarro;
 
  public void crearProducto()
  {
    producto.add(new Producto());
   
  }
  
  public void eliminarProducto(int numero)
  {
    producto.remove(numero -1);
  }
  
  public void mostrarProductos()
  {
     for (int i=0; i < producto.size(); i++) {
       producto.get(i).mostrarProducto();
    }
  }
  
  public void facturarCarro()
  {
    
  }
}