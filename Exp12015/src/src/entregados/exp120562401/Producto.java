package entregados.exp120562401;

public class Producto {
  private String descripcion;
  private int tipoUnidad;
  private int precio = 0;
  private int cantidad = 0;
  
  public Producto() {
  }
                  
  public Producto(String descripcion, int tipoUnidad, int precio, int cantidad) { 
   this.descripcion = descripcion;   
   this.tipoUnidad = tipoUnidad;
   this.precio = precio;
   this.cantidad = cantidad;
  }
  
  public String getDescripcion() {
    return this.descripcion;
  }
  
  public String getPrecio() {
    return this.precio;
  }
  
  
  public String getTipoUnidad() {
    return this.tipoUnidad;
  }
  
  public String getCantidad() {
    return this.cantidad;
  }
  
  public int getCosto() {
     return this.precio * this.cantidad;
  }
  
  public static void verProducto() {
    if (this.nombre != "")
      return this.tipoUnidad + " de " + this.nombre + ": $" + this.precio + " x " + this.cantidad + " = " + (this.getCosto()) + ".-"; 
    else
      return "(Vacío)";
  }
}