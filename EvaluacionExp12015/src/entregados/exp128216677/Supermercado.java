package entregados.exp128216677;

import java.util.*;
public class Supermercado{
private String _nombre;
 private ArrayList<Producto> catalogo = new ArrayList<Producto>(); 
 private ArrayList<Producto> carro = new ArrayList<Producto>();
 
 public String getNombre(){return this._nombre;}
 public void setNombre(String valor){this._nombre=valor;}

 public ArrayList<Producto> getProductos(){return catalogo; }
  public ArrayList<Producto> getProductosCarro(){return carro; }
 public void setProductoCatalogo(Producto valor){this.catalogo.add(valor);}
 public void setProductoCarro(Producto valor){this.carro.add(valor);}
 
 public int obtenerCantidadcarros(){return carro.size(); }
 public void crearCarrovacio(){
    carro.add(new Producto());
 }
  public Producto obtenerProductoCompleto(int indice){return catalogo.get(indice); }

 
 
 
}

