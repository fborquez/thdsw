package entregados.exp120562401;

public class SuperMercado{
  public int cantCarritos = 5;
  private Carrito[] carritos = new Carrito[cantCarritos];
  public String nombre;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public SuperMercado(String nombre) {
    for (int i = 0; i < this.carritos.length; i++) {
      this.carritos[i] = new Carrito();
    }
    this.nombre = nombre;
  }
  
  public Carrito getCarrito(int indice) throws Exception{
    if (indice > this.cantCarritos || indice <= 0)
      throw new Exception("No existe el carrito " + indice + "!!!");
    else {
      indice = indice - 1;
      return this.carritos[indice];
    }
  }
}