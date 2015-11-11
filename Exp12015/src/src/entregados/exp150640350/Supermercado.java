package entregados.exp150640350;

/**
 * Auto Generated Java Class.
 */
public class Supermercado {
  int codigo;
  String nombre;
  Carro carro;
  Catalogo catalogo;
  public Supermercado() { 
    //Carro[] carro = new Carro[5];
    this.carro = new Carro();
    this.catalogo = new Catalogo();
  }
  void setNombre(String nombre){
    this.nombre = nombre;
  }
  String getNombre(){
    return this.nombre;
  } 
  void setCodigo(int codigo){
    this.codigo = codigo;
  }
  int getCodigo(){
    return this.codigo;
  }
  Catalogo getCatalogo(){
    return this.catalogo;
  }
  Carro getCarro(){
    return this.carro;
  }
  
}
