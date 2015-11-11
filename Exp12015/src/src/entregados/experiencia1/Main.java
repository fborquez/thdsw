package entregados.experiencia1;

import java.util.*;

public class Main {
  
  private static Scanner kbd = new Scanner(System.in);
  private static Carrito[] carritos;
    
  public static void main(String[] args) {
      
      imprimirMenu();
  }
  
  public static void imprimirMenu() {
    try {    
      System.out.println("Opciones: \r\n 1.-Agregar productos al carrito. \r\n 2.-Eliminar productos del carrito." +
                           "\r\n 3.-Mostrar productos del carrito. \r\n 4.-Facturar carrito. \r\n 5.-Crear carrito. \r\n" +
                           " 6.-Gestionar catalogo.");
      int option = kbd.nextInt();
      switch(option) {
        case 1:
          addProducts2Car();
          break;
        case 2:
          break;
        case 3:
          seeProdsCarrito();
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
      }
    } catch(InputMismatchException num) {
      System.out.println("Error al ingresar los datos. Favor intente nuevamente.");
    } catch(Exception e) {
      e.printStackTrace();
      System.out.println("Error temporal en el sistema.");
    }
  }
  
  public static void addProducts2Car() throws Exception {
    if(null == carritos) {
      carritos = new Carrito[5];
      System.out.println("No existen carritos creados disponibles. Deseas crear un carrito? (1=SI; 2=NO)");
      int option = kbd.nextInt();
      if(option == 1) {
        carritos[0] = new Carrito(1, new Producto[10]);
        System.out.println("Carrito creado exitosamente. ID_CARRITO = 1");
      }
    } else {
      System.out.println("¿En que carrito desea agregar su producto?(Máximo 10 productos por carro) \r\n Carritos disponibles:");
      for(int i=0; i < carritos.length; i++) {
        if(carritos[i] != null) {
          System.out.println("ID_CARRITO: " + carritos[i].getIdCarrito());
        }
      }
      int idCar = kbd.nextInt();
      
      System.out.println("Desplegando catalogo... \r\n Productos disponibles: \r\n");
      System.out.println("ID_PRODUCTO --> 1; NOMBRE_PRODUCTO--> 'Polera verde Ayiwas'; PRECIO --> $10.000");
      System.out.println("ID_PRODUCTO --> 2; NOMBRE_PRODUCTO--> 'Vodka lamansacaña'; PRECIO --> $1.000");
      System.out.println("ID_PRODUCTO --> 3; NOMBRE_PRODUCTO--> 'Pelota futbol penalty'; PRECIO --> $30.000");
      System.out.println("Ingrese el código de producto para agregar al carro.");
      
      int productOption = kbd.nextInt();
      Producto[] productosDes = new Producto[10];
        
      switch(productOption) {
        case 1:
          Producto newProducto1 = new Producto(1, "Polera verde Ayiwas", 10000);
          carritos[0].addProduct(newProducto1);
          break;
        case 2:
          Producto newProducto2 = new Producto(2, "Vodka lamansacaña", 1000);
          productosDes[0] = newProducto2;
          break;
        case 3:
          Producto newProducto3 = new Producto(3, "Pelota futbol penalty", 30000);
          productosDes[0] = newProducto3;
          break;
      }
    }
    imprimirMenu();
  }
  
  public static void seeProdsCarrito() {
    if(null == carritos) {
      System.out.println("No existen carritos creados disponibles.");
    } else {
      System.out.println("¿Ver productos de cual carrito? \r\n Carritos disponibles:");
      for(int i=0; i < carritos.length; i++) {
        if(carritos[i] != null) {
          System.out.println("ID_CARRITO: " + carritos[i].getIdCarrito());
        }
      }
      int idCar = kbd.nextInt();
      
      carritos[idCar-1].mostrarProductos();
      
    }
  }
  
  public static Carrito createCarrito() {
    return null;
  }
  
}