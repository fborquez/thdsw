public class Producto{
  int codigoProducto;
  String nombre;
  String familia;
  int precio;
    
  public Producto(int codigoProducto, String nombre, double precio) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.familia = familia;
        this.precio = precio;
}
  public int getcodigoProducto() {
    return this.codigoProducto;
    }
  
  public String getnombre() {
    return this.nombre;
    }
  
  public int getfamilia() {
    return this.familia;
   }
  
  public int getprecio() {
    return this.precio;
   }
   
}