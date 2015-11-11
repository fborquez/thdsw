package entregados.experiencia1;

public class Producto {
  
  private int idProducto;
  private String nombreProducto;
  private int precio;
  
  public Producto() {
  }
  
  public Producto(int idProducto, String nombreProducto, int precio) {
    this.idProducto = idProducto;
    this.nombreProducto = nombreProducto;
    this.precio = precio;
  }
  
  public int getIdProducto() {
    return this.idProducto;
  }
  
  public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
  }
  
  public String getNombreProducto() {
    return this.nombreProducto;
  }
  
  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }
    
  public int getPrecio() {
    return this.precio;
  }
  
  public void setPrecio(int precio) {
    this.precio = precio;
  }
    
}