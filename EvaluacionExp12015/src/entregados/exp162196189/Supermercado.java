package entregados.exp162196189;

import java.util.ArrayList;

public class Supermercado
{
  private String nombre;
  private ArrayList <CarroDeCompra> carrito = new ArrayList <CarroDeCompra>();;
  
  Supermercado(String nombre)
  {
    this.nombre = nombre;
  }
  
  public String getNombre()
  {
    return this.nombre;
  }
  
  public int getCarros()
  {
    return carrito.size();
  }
  
  public int crearCarro()
  {
            
    if (carrito.size() <=5) 
    {
      carrito.add(new CarroDeCompra());
      System.out.println("Carro creado!");
      return carrito.size();
    }
    else
    {
      System.out.println("Usted ya ha creado el máximo de 5 carritos posibles!");
      return -1;
    }
  }
  
  public void addProducto(int numeroCarro)
  {
    carrito.get(numeroCarro -1).crearProducto();
  }
  
  public void removeProduct(int numeroCarro, int numeroProducto)
  {
    carrito.get(numeroCarro -1).eliminarProducto(numeroProducto);
  }
  
  public void mostrarProductos(int numeroCarro){
    carrito.get(numeroCarro -1).mostrarProductos();
  }
  
  public void facturarCarro(int numeroCarro)
  {
    carrito.get(numeroCarro -1).facturarCarro();
  }
}