package entregados.experiencia1;

import java.util.*;
  
public class Carrito {
  
  private int idCarrito;
  private Producto[] productosDes;
  private Scanner kbd = new Scanner(System.in);
  
  public Carrito() {
  }
  
  public Carrito(int idCarrito, Producto[] productosDes) {
    this.idCarrito = idCarrito;
    this.productosDes = productosDes;
  }
  
  public int getIdCarrito() {
    return this.idCarrito; 
  }
  
  public void setIdCarrito(int idCarrito, Producto[] productosDes) {
    this.idCarrito = idCarrito;
    this.productosDes = productosDes;
  }
  
  public Producto[] getProductosDes() {
    return this.productosDes;
  }
  
  public void setProductosDes(Producto[] productosDes) {
    this.productosDes = productosDes;
  }
  
  public void addProduct(Producto prodAdd)  throws NumberFormatException, Exception {
      if(productosDes.length != 0) {
        for(int i = 0; i < productosDes.length; i++) {
          if(productosDes[i].equals(prodAdd)) {
            System.out.println("11111");
            System.out.println("Este producto ya existe en el carrito. Desea agregar uno más a su compra? Ingrese el número 1 para confirmar, o ingrese número 2 para cancelar.");
            int option = kbd.nextInt();
            if(option == 1) {
              productosDes[i] = prodAdd;
            }
            break;
          } else {
            productosDes[0] = prodAdd;
          }
        }
      } else {
        productosDes[0] = prodAdd;
      }
  }
  
  public String mostrarProductos() {
    System.out.println("sdadas");
    if(productosDes.length > 0) {
      String exit = " ";
      for(int i = 0; i < productosDes.length; i++) {
        if(productosDes[i] != null) {
          exit += "Producto [" + (i+1) + "]: ID_PRODUCTO --> " + productosDes[i].getIdProducto() +
          "; NOMBRE_PRODUCTO --> " + productosDes[i].getNombreProducto() + "; PRECIO --> " + productosDes[i].getPrecio() + "\r\n";
        } else {
          System.out.println("sdadas22");
        }
      }
      return exit;
    } else {
      return "El carrito está vacio! :(";
    }    
  }
  
}