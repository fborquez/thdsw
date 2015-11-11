package entregados.exp150640350;


public class Producto {
  int codigo;
  String nombre;
  int tipoUnidad; //1. gramos, 2.- pack, 3.- unidad
  int precio;
  int descEspecial;
  public Producto() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  void setProducto(int c, String n, int t, int p, int d){
    this.codigo = c;
    this.nombre = n;
    this.tipoUnidad = t;
    this.precio = p;
    this.descEspecial = d;
  }
  int getCodigo(){
    return this.codigo;
  }
  String getNombre(){
  return this.nombre;
  } 
  int getPrecio(){
    return this.precio;
  }  
  
}
