package entregados.exp16778231;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase Principal
 * @autor Luis Lopez Alamos 20-10-2015
 */
public class Exp16778231{
  
  
  public static void main (String args[]){  
    Scanner teclado = new Scanner(System.in);
    Supermercado supermercadoUno = new Supermercado();
    Supermercado supermercadoDos = new Supermercado();
    Supermercado eleccion = null;
    Carro[] carrito = new Carro[5];
    System.out.println("Elija Supermercado para ingresar información (1 o 2):");
    int superElegido = teclado.nextInt(); 
    if (superElegido == 1){
      eleccion = supermercadoUno;
    }
    else {
      eleccion = supermercadoDos;
    }
    menuUno();
    int opcionUno = teclado.nextInt();
    switch(opcionUno) {
      case 1: 
        agregarProd(eleccion);
        break;
      case 2: 
        eliminarProd(eleccion);
        break;
      case 3: 
        mostrarProd(eleccion);
        break;
        
    }
 //default: 
    
    //ArrayList<Supermercado> compra = new ArrayList<Supermercado>();
    
  }
  
   static Supermercado agregarProd(Supermercado superM){
    Scanner teclado = new Scanner(System.in);
    System.out.println("A que carrito desea agregar Productos [1,2,3,4,5]");
    int carroElegido = teclado.nextInt(); 
    System.out.println("carroElegido " + carroElegido);
    superM.setCarrito(new Carro[carroElegido-1]);
    Producto prod = new Producto();
    System.out.println("Ingrese Producto. descripcion :");
    prod.setDescripcion(teclado.next());
    System.out.println("Ingrese Producto. cantidad :");
    prod.setCantidad(teclado.nextInt());
    System.out.println("Ingrese Producto. precio :");
    prod.setPrecio(teclado.nextInt());
    System.out.println("Ingrese Producto. tiene Descuento: 'S' , 'N'");
    boolean dcto = false;
    if (teclado.next().equals("s"))
       dcto = true;
    prod.setTieneDescuento(dcto);
    System.out.println("Producto Ingresado :: [desc] :" + prod.getDescripcion() +  " [cant] :" + prod.getCantidad() + " [precio] :" + prod.getPrecio() + "[tiene descuento] :" + prod.getTieneDescuento());
    return superM;    
  }
  
  static void menuUno(){
    System.out.println("Opciones::");
    System.out.println("1.- Agregar Productos al Carro");
    System.out.println("2.- Eliminar Productos al Carro");
    System.out.println("3.- Mostrar Productos del Carro");
    System.out.println("*Por favor, Ingrese Opcion: *");
  }
  

  
  static void eliminarProd(Supermercado superM){
    System.out.println("Opciones::2");
  }
  
  static void mostrarProd(Supermercado superM){
    System.out.println("Opciones::3");
  }
  
  
  
}