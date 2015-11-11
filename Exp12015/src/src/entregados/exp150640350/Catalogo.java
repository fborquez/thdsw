package entregados.exp150640350;

import java.util.*; //Utilerias como ArrayList
public class Catalogo {
  ArrayList<Producto> productos_list;
  public Catalogo() { 
    this.productos_list = new ArrayList<Producto>(); //ArrayList de Productos
    Producto producto1 = new Producto();
    producto1.setProducto(1, "Pan",1,1000, 0);
    productos_list.add(producto1);
    Producto producto2 = new Producto();
    producto2.setProducto(2, "Bebida",3,1500, 10);
    productos_list.add(producto2);
  }
  void mostrarCatalogo(){
    for(int i=0; i< productos_list.size();i++){
      System.out.println("---------------------");
      System.out.print(productos_list.get(i).getCodigo());
      System.out.print(" ");
      System.out.println(productos_list.get(i).getNombre());
    }
    System.out.println("---------------------");
  }
  Producto getProducto(int codigo){
    return this.productos_list.get(0);
  }
  
}
