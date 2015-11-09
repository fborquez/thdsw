package entregados.exp14202387_3;

public class Super {
  String nombreSuper;
  
  public Super(String nombreSuper){
    this.nombreSuper = nombreSuper;
    
  }
  
  public Carrito[] carritos = new Carrito[5];
  
  
  public String getNombreSuper (){
    return this.nombreSuper; 
  }
  public void setNombreSuper (String nombreSuper){
    this.nombreSuper = nombreSuper;
  }
  
}

