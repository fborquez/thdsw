package entregados.exp150640350;

import java.util.*; 
public class Exp150640350 {
  
  
  public static void main(String[] args) { 
    //Utilitarios
    Scanner kbd = new Scanner(System.in);
    //Constantes
    final int MAX_SUPERMERCADO = 2;
    //Variables primitivas
    int i, codigo; 
    int opcion =0;
    String nombre, nombreCosa;
    //Objetos
    //Supermercado[] supermercado = new Supermercado[MAX_SUPERMERCADO];
    Supermercado supermercado = new Supermercado();
    ArrayList<Producto> producto_list = new ArrayList<Producto>(); //ArrayList de Producto
    
    //Iniciar Supermercados
    //for(i=0; i < MAX_SUPERMERCADO; i++){
    //  supermercado[0] = new Supermercado();
    //}
     System.out.println("Elija Supermercado para ingresar información (1 o 2)");
     codigo = kbd.nextInt();
     do {
     System.out.println("Opciones");
     System.out.println("1.- Agregar productos al carro");
     System.out.println("2.- Eliminar productos del carro");
     System.out.println("3.- Mostrar productos del carro");
     System.out.println("4.- Facturar carro");
     System.out.println("5.- Crear carro");
     System.out.println("6.- Gestionar catalogo");
     System.out.println("0.- Salir");
     opcion = kbd.nextInt();
     switch(opcion){
       case 0: System.out.println("Salir"); break;
       case 1: agregarProductosCarro(supermercado); break;  
       case 2: eliminarProductosCarro(supermercado); break;
       case 3: mostrarProductosCarro(supermercado); break;
       case 4: facturarCarro(supermercado); break;
       case 5: break;
       case 6: gestionarCatalogo(supermercado); break;   
       default: System.out.println("No existe opcion");
     }     
     }while(opcion !=0);
  }
  
  public static void agregarProductosCarro(Supermercado s){
    int carro, cantidad;
    Producto p = new Producto();
    Scanner kbd = new Scanner(System.in);
    System.out.println("1.- Agregar productos al carro");
    System.out.println("Elija carro de destino");
    carro = kbd.nextInt();
    System.out.println("Elija cantidad de producto");
    cantidad = kbd.nextInt();
    s.getCarro().agregarProducto(s.getCatalogo().getProducto(0),cantidad);
  }
  //2
  public static void eliminarProductosCarro(Supermercado s){
    ArrayList<Producto> p_list;
    ArrayList<Integer> c_list;
    p_list = s.getCarro().mostrarProductos();
    c_list = s.getCarro().mostrarCantidad();
    
    p_list.remove(0);
    p_list.remove(0);
  }
  //3
  public static void mostrarProductosCarro(Supermercado s){
    ArrayList<Producto> p_list;
    ArrayList<Integer> c_list;
    p_list = s.getCarro().mostrarProductos();
    c_list = s.getCarro().mostrarCantidad();
    for(int i=0; i < p_list.size(); i++){
      System.out.println(p_list.get(i).getNombre() + ":" +c_list.get(i));
    }
  }
  //4
  public static void facturarCarro(Supermercado s){
    ArrayList<Producto> p_list;
    ArrayList<Integer> c_list;
    p_list = s.getCarro().mostrarProductos();
    c_list = s.getCarro().mostrarCantidad();
    int acum = 0;
    for(int i=0; i < p_list.size(); i++){
      System.out.println(p_list.get(i).getNombre() + ":" +c_list.get(i) +"x" + p_list.get(i).getPrecio());
      acum = acum + (c_list.get(i) * p_list.get(i).getPrecio());
    } 
    System.out.println("Total a facturar: " + acum);
  }
  //5
  public static void crearCarro(Supermercado s){
  
  }
  
  //6
  public static void gestionarCatalogo(Supermercado s){
    Producto producto = new Producto();
    System.out.println("6.- Gestionar catalogo");
    s.getCatalogo().mostrarCatalogo();
  }
  
}
