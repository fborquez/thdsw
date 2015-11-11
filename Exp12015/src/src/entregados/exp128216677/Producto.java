package entregados.exp128216677;

public class Producto{
private String _descripcion;
private int _cantidad;
private String _tipoUnidad ;
private int _precio;
private double _descuento;

  public Producto(String descripcion,int cantidad,String tipo,int precio, double desc){
  this._descripcion=descripcion;
  this._cantidad=cantidad;
  this._tipoUnidad=tipo;
  this._precio=precio;
  this._descuento=desc;

}
  public Producto(){}
 
  public  String obtenerProducto(){return  _descripcion + " " + " " + _cantidad + " " +  _tipoUnidad ;  }
 
  public String getDescripcion(){return _descripcion;}
    public int getCantidad(){return _cantidad;}
      public String getTipoUnidad(){return _tipoUnidad;}
        public int getprecio(){return _precio;}
          public double getDescuento(){return _descuento;}
  


}