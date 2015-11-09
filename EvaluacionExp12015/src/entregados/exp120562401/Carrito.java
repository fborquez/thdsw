package entregados.exp120562401;


public class Carrito{
  public int capacidad = 5;
  private Producto[] productos = new Producto[capacidad];
  private int indice = 0;
  
  public Carrito(){
    for (int i = 0; i < this.productos.length; i++) {
      this.productos[i] = new Producto();
    }
  }
  
  public void agregarProducto(Producto p) {
    this.productos[indice] = p;
    this.indice++;
  }
  
  public boolean estaLleno() {
    return this.indice >= this.capacidad;
  }
  
  public String getContenido() {
    String s = "";
    for (int i = 0; i < this.productos.length; i++) {
      String salto = (i == this.productos.length - 1 ? "" : "\n");
      if (this.productos[i] != null)
        s += (i+1) + ". " + this.productos[i].toString() + salto;
    }
    return s;
  }
  
  public int getPrecioTotal() {
    int total = 0;
    for (int i = 0; i < this.productos.length; i++) {
      total += this.productos[i].getCosto();
    }
    return total;
  }
}