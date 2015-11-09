package entregados.exp17469295;

/**
 * Auto Generated Java Class.
 */
public class Producto {
  
  String nombre;
  String descripcion;
  int precio;
  int descuento;
  int tipoUnidad;
  
  public Producto(){};
    
   public Producto(String nombre,String descripcion,int precio,int descuento,int tipoUnidad){
     this.nombre = nombre;
     this.descripcion = descripcion;
     this.precio = precio;
     this.descuento = descuento;
     this.tipoUnidad = tipoUnidad;
    
  }
    
   public String getNombre() {
       return nombre;
   }
  
  public String getDescripcion() {
        return descripcion;
    }
  
  public int getPrecio() {
        return precio;
    }
  
  public int getDescuento() {
        return descuento;
    }
  
  public int getTipoUnidad() {
        return tipoUnidad;
    }
  
}
