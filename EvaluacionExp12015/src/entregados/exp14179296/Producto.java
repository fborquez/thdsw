package entregados.exp14179296;

public class Producto {
private String descripcion;
private int cantidades;
private int precio;


public Producto()
{
  
}
public Producto(String midescripcion,int micantidades,int miprecio,int midescuento)
{
  setDescripcion(midescripcion);
  setCantidades(micantidades);
  setPrecio(miprecio);
  setDescuento(midescuento); 
}
public String getDescripcion()
{
  return descripcion;
}
public void setDescripcion(String midescripcion)
{
  this.descripcion=midescripcion;
}

public int getCantidades()
{
  return cantidades;
}
public void setCantidades(int micantidades)
{
  this.cantidades=micantidades;
}
public int getPrecio(int miprecio)
{
  return precio;
}
public void setPrecio(int miprecio)
{
  this.precio=miprecio;
}
public int getDescuento()
{
  return descuento;
}
public void setDescuento(int midescuento)
{
  this.descuento=midescuento;
}


}