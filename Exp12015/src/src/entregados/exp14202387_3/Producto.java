package entregados.exp14202387_3;

import java.util.*;

public class Producto{
  
  private String descProd;
  private int cantidad;
  private String tipoUnidad;
  private boolean tieneDescuento;
  
  
  public Producto(String descProd, int cantidad, String tipoUnidad, boolean tieneDescuento){
    this.descProd = descProd;
    this.cantidad = cantidad;
    this.tipoUnidad = tipoUnidad;
    this.tieneDescuento = tieneDescuento;
    
  }
  
  public String getDescProd() {
    return descProd;
  }
  public void setDescProd(String descProd) {
    this.descProd = descProd;
  }
  public int getCantidad() {
    return cantidad;
  }
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  public String getTipoUnidad() {
    return tipoUnidad;
  }
  public void setTipoUnidad(String tipoUnidad) {
    this.tipoUnidad = tipoUnidad;
  }
  public boolean isTieneDescuento() {
    return tieneDescuento;
  }
  public void setTieneDescuento(boolean tieneDescuento) {
    this.tieneDescuento = tieneDescuento;
  }
  
}

