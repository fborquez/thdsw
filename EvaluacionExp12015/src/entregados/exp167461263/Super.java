package entregados.exp167461263;

import java.util.*;

public class Super {
  //propiedades, atributos o variables miembro
  String nombresuper;
  
  Producto producto;
  Carro carro;


  static public void ingresarCarro() {
    
      Scanner teclado = new Scanner(System.in);
System.out.println("Agregando productos al carro");

System.out.println("A cual carro desdea agregar el producto?");
    
        Carro c=new Carro();
        c.numerodecarro=teclado.nextInt();

    
    
System.out.println("Mostrando catalogo de productos");

//System.out.println(all productos.nombre);
c.ingresarProducto();




  }
  
  
  
  
  
   public void eliminarCarro() {
  
    carro.producto=null;
    
  }
  
  
   public void mostrarCarro() {
  
  
    System.out.println("Lo que hay actualmente en el carro es");
      
    System.out.println(carro.producto.descripcion);
    
}
  
  
  
   public void mostrarFactura() {
  
         
    
    System.out.println("La cantidad a pagar es"+carro.totalfactura);
    
    
    
  }
  
  static public void crearCarro(){
    
System.out.println("Creando nuevo carro");
        Carro c=new Carro();
    
        c.numerodecarro=c.numerodecarro+1;
        
        
  }
  
   public void catalogoeditar(){
    
System.out.println("Gestionando Catalogo");
    
      Scanner teclado = new Scanner(System.in);

  

        Producto p=new Producto();
        
        
        
        
      System.out.println("Ingrese la cantidad ingresada de este producto");
      this.producto.cantidad = teclado.nextInt();
        
      
      System.out.println("Ingrese la cantidad ingresada de este producto");
      this.producto.preciototal = this.producto.cantidad * this.producto.preciounitario;
    
      
  }
  
  
  }
  
  
  