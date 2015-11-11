package entregados.exp14202387_3;

import java.util.*;
public class Carrito {

  ArrayList<Producto> lProductos = new ArrayList<Producto>();
  
  
  
     public void addProducto(String descProd,int cantidad, String tipoUnidad, boolean tieneDescuento){
      
       this.lProductos.add(new Producto(descProd, cantidad, tipoUnidad, tieneDescuento));
   }
}
                          
