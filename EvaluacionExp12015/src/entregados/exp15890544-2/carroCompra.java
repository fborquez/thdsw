public class carroCompra{
  int codigoVenta;
  int cantidadProductos;
  int precio;
  int descuento;
    
  public carroCompra(int codigoProducto, int cantidadProductos, int precio, int descuento) {
        this.codigoProducto = codigoProducto;
        this.cantidadProductos = cantidadProductos;
        this.precio = precio;
        this.descuento = descuento;
}
  public int getcodigoProducto() {
        return this.codigoProducto;
  }
  public String getnombre() {
        return this.nombre;
    
  }
  public int getprecio() {
        return this.precio;
    
  }
  public int getdescuento() {
        return this.descuento;
}