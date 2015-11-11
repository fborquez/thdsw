package entregados.exp17469295;

/**
 * Auto Generated Java Class.
 */
public class Market {
  
   Carrito[]  carrito = new Carrito[5];  // se repiten casi las mismas variables que con el catalogo, se prodria haber dejado una referencia a catalogo, pero asi tenemos un respaldo :D
   
   
   
  String nombre;
  String descripcion;
  int precio;
  int descuento;
  int tipoUnidad;
  int cantidad;
  
  public Market(){};
    
   public Market(String nombre,String descripcion,int precio,int descuento,int tipoUnidad,int cantidad){
     this.nombre = nombre;
     this.descripcion = descripcion;
     this.precio = precio;
     this.descuento = descuento;
     this.tipoUnidad = tipoUnidad;
     this.cantidad = cantidad;
     
    
    
  }
   
   
  
}
