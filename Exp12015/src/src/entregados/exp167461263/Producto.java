package entregados.exp167461263;

import java.util.*;

public class Producto {
  //propiedades, atributos o variables miembro
  
  String descripcion;
   int codigointerno=0;
   int cantidad;
   String tipounidad;
   int preciounitario=0;
   int preciototal=0;
   int descuentostatus=0;
   static int sumar=0;
   
   Producto(){
    
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese el nombre y/o descripcion del producto");
      
      this.descripcion=teclado.nextLine();
      
      
System.out.println("Ingrese Codigo Interno de producto que esta agregando (N.XX)");
        this.codigointerno= teclado.nextInt();
      
      
      System.out.println("Ingrese el tipo de unidad del producto");
      
      this.tipounidad=teclado.nextLine();
      
      
      System.out.println("Ingrese si el producto tiene descuento implementado(1) o no(2)");
      
      this.descuentostatus=teclado.nextInt();
      
      

    
      System.out.println("Ingrese el precio unitario de este producto");
      this.preciounitario = teclado.nextInt();
      this.sumar= this.sumar+(this.preciounitario*this.cantidad);
      
      
   }
   }