package entregados.exp155562455;

/**
 * Auto Generated Java Class.
 */

public class Carrito{
  public int capacidad = 3; // Solo tres productos por carrito
  private Producto[] productos = new Producto[capacidad];
  private int posicion = 0;
  
  public Carrito(){
        /* YOUR CONSTRUCTOR CODE HERE*/
    for (int i = 0; i < this.productos.length; i++) {
      this.productos[i] = new Producto();
    }
  }
  
  public void agregarProducto(Producto p) {
    this.productos[posicion] = p;
    this.posicion++;
  }

  public String getContenido() {
    String str = "";
    for (int i = 0; i < this.productos.length; i++) {
      String salto = (i == this.productos.length - 1 ? "" : "\n");
      if (this.productos[i] != null)
        str += (i+1) + ". " + this.productos[i].toString() + salto;
    }
    return str;
  }
  //Calcula el Precio Total
  public int getPrecioTotal() {
    int total = 0;
    for (int i = 0; i < this.productos.length; i++) {
      total += this.productos[i].getPrecio();
    }
    return total;
  }
  
    
    /* ADD YOUR CODE HERE */
}