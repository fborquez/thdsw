package entregados.exp162196189;

import java.util.Scanner;

public class Producto
{
  private String descripcion;
  private int cantidad;
  private int tipoUnidad;
  private long precio;
  private float descuento;
  
  Producto()
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese descripción del producto: ");
    this.descripcion = sc.nextLine();
    
    System.out.println("Ingrese cantidad de productos " + this.descripcion + ": ");
    this.cantidad = sc.nextInt();
        
    do{
        System.out.println("Ingrese tipo de unidad (1.- gramos, 2.- pack, 3.- unidad): ");
        this.tipoUnidad = sc.nextInt();
        
        if (this.tipoUnidad < 1 || this.tipoUnidad >3) System.out.println("Debe ingresar un número del 1 al 3, intente nuevamente");
          
    }while(this.tipoUnidad < 1 || this.tipoUnidad >3);
    
    System.out.println("Ingrese precio del producto " + this.descripcion + ": ");
    this.precio = sc.nextLong();
    
    System.out.println("Ingrese el descuento para el producto " + this.descripcion + " (si no tiene descuento ingrese cero): ");
    this.descuento = sc.nextFloat();
  }
  
  public String getProducto()
  {
    return this.descripcion;
  }  

  public void mostrarProducto()
  {
    System.out.println(descripcion + "   " + cantidad + "   " + tipoUnidad + "   " + precio);
  }
}