package entregados.exp141744771;

/**
 * Auto Generated Java Class.
 */
public class Producto extends Carro{
  
 String descripcion;
int cantidad;
int unidad;
int precio;
  /* ADD YOUR CODE HERE */

public Producto(String descripcion, int cantidad, int unidad, int precio)
{
this.descripcion=descripcion;
this.cantidad=cantidad;
this.unidad=unidad;
this.precio=precio;
}

public String getDescripcion() {
  return descripcion;
 }
 
 public void setDescripcion(String descripcion) {
  this.descripcion = descripcion;
 }
  
 public int getCantidad() {
  return cantidad;
 }
 
 public void setCantidad(int cantidad) {
  this.cantidad = cantidad;
 }
 public int getUnidad() {
  return unidad;
 }
 
 public void setUnidad(int unidad) {
  this.unidad = unidad;
 }
 
  public int getPrecio() {
  return precio;
 }
 
 public void setPrecio(int precio) {
  this.precio = precio;
 }
 
 void mostrarProducto()
 {
 System.out.println("Descripcion"+ descripcion);
 System.out.println("Cantidad"+ cantidad); 
 System.out.println("Unidad"+ unidad);
 System.out.println("Precio"+ precio);
   
 }
 void mostrarFacturaProductos()
 {
   System.out.println("Descripcion"+ descripcion+ "total="+cantidad*precio+);
 }
 
 int suma;
 
 public void setTotalFacturado(int cantidad, int precio) 
 {  
   suma=cantidad*precio;   
 }
}
