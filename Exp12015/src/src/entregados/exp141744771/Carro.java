package entregados.exp141744771;

/**
 * Auto Generated Java Class.
 */
public class Carro {
  
  /* ADD YOUR CODE HERE */
  int numero;
  String estado;
  
   public Carro (int numero, String estado)    
  {
     this.numero=numero;
     this.estado=estado;
 }
  
  public int getNumero() 
  {
  return numero;
 }
 
 public void setNumero(int numero) 
 {
  this.numero = numero;
 }
   public String getEstado() 
  {
  return estado;
 }
 
 public void setEstado(String estado) 
 {
  this.estado = estado;
 }
 
 void mostrarEstadoCarro()
 {
   System.out.println("carro N° "+numero+" Estado: "+ estado);

   
 }
 
 }
 
}
