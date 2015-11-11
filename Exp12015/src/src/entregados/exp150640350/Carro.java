package entregados.exp150640350;

import java.util.*; //Utilerias como ArrayList
public class Carro {
  ArrayList<Producto> producto_list; 
  ArrayList<Integer> cantidad_list;
  //No supe como dejarlo bidimensional Producto|Cantidad, 
  //quizas creando una clase "Compra" que sea Producto y Cantidad
  public Carro() { 
    this.producto_list = new ArrayList<Producto>();
    this.cantidad_list = new ArrayList<Integer>();
  }
  void agregarProducto(Producto p, int c){
    this.producto_list.add(p);
    this.cantidad_list.add(c);
  }
  ArrayList<Producto> mostrarProductos(){
  return this.producto_list;
  }
  ArrayList<Integer> mostrarCantidad(){
  return this.cantidad_list;
  }  
}
