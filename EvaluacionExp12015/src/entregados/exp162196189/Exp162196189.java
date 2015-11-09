package entregados.exp162196189;

import java.util.ArrayList;
import java.util.Scanner;

public class Exp162196189
{
  public static ArrayList<Supermercado> superm = new ArrayList<Supermercado>();
  public static int numSuper;
  public static int opcion;
  public static int carro;
  public static int numeroProducto;
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args)
  {
       
    superm.add(new Supermercado("Falaferia Ahumada"));
    superm.add(new Supermercado("Falaferia Las Condes"));
    System.out.println("Elija Supermercado para ingresar información: ");
    numSuper = sc.nextInt();
    
    menu();
  }
  
  public static void menu()
  {
    
    do
    {
    System.out.println("Bienvenido a " + superm.get(numSuper -1).getNombre() ); 
    System.out.println("Opciones: ");
    System.out.println("1.- Agregar productos al carro");
    System.out.println("2.- Eliminar productos del carro");
    System.out.println("3.- Mostrar productos del carro ");
    System.out.println("4.- Facturar carro");
    System.out.println("5.- Crear carro ");
    System.out.println("6.- Elegir otro Supermercado ");
    sc.nextLine();
    opcion = sc.nextInt();
    
    switch(opcion)
    {
      case 1:
        if(superm.get(numSuper-1).getCarros() > 0){
          System.out.println("A que carro desea agregar el producto?: ");
          carro = sc.nextInt();
          superm.get(numSuper-1).addProducto(carro);
        }
        else{
          System.out.println("Aún no ha creado carros!");
        }
      
        break;
      case 2:
        if(superm.get(numSuper-1).getCarros() > 0){
          System.out.println("De que carro desea eliminar el producto?: ");
          carro = sc.nextInt();
          System.out.println("Ingrese el número del producto que desea eliminar: ");
          numeroProducto = sc.nextInt();
          superm.get(numSuper-1).removeProduct(carro, numeroProducto);
        }
        else{
          System.out.println("Aún no ha creado carros!");
        }
        break;
      case 3:
        if(superm.get(numSuper-1).getCarros() > 0){
          System.out.println("De que carro desea mostrar los productos?: ");
          carro = sc.nextInt();
          superm.get(numSuper-1).mostrarProductos(carro);
        }
        else{
          System.out.println("Aún no ha creado carros!");
        }
        break;
      case 4:
        if(superm.get(numSuper-1).getCarros() > 0){
          System.out.println("De que carro desea facturar los productos?: ");
          carro = sc.nextInt();
          //superm.get(numSuper-1).facturarCarro(carro);
        }
        else{
          System.out.println("Aún no ha creado carros!");
        }
        break;
      case 5:
        superm.get(numSuper-1).crearCarro();
        break;
      default:
        System.out.println("La opción digitada es incorrecta");
    }
    
  }while(opcion != 6);
  }
}