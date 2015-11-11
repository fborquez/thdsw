package entregados.exp14179296;

import java.util.Scanner;
import java.util.io;

public class Catalogo{
  //creo un objeto de tipo producto para modificar los precios con los descuentos
  Producto miproducto=new Producto()
  private double descuento;
  
  public int getDescuento()
  {
    return descuento;   
  }
  public void setDescuetno(int midescuento)
  {
    this.descuento=midescuento;
  }
  
  public void Hacerdecuentouno(double descuento)
  {
    double precio;
    System.out.println("Descuento del 10%);
    descuento= 0.1;
    Precio=descuento*miproducto.getPrecio();
  }
  public void Hacerdescuentodos(double descuento)
  {
    double precio;
    System.out.println("Descuento del 20%");
    descuento=0.2;
    precio=descuento*miproducto.getPrecio();
  }
  public void Hacerdescuentotres

  
  
  
  
}
