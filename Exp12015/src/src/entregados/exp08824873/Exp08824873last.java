package entregados.exp08824873;

/* Programa: Exp08824873
 * Objetivo: Gestionar carros de supermercados.
 * Autor   : Sergio A. Carrasco L.
 * Ramo    : Herramientas Desarrollo software - 2015
 * Fecha   : 20 de Octubre del 2015
 * Profesor: Francisco H. Bórquez Burgos
 */
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Collections;

public class Exp08824873last {
  private static ArrayList<Superm> aSuperm = new ArrayList<Superm>();
  private static Scanner kbd = new Scanner(System.in);
  //
  public static void main (String[] args) {
    int op = 0;
    boolean lSalir = false;
    //
    //Creo los dos supermercados:
    aSuperm.add(new Exp08824873last().new Superm() ); //super 1
    aSuperm.add(new Exp08824873last().new Superm() ); //super 2     
    do {
      mostrarMenu1();
      op = kbd.nextInt();
      //
      switch (op) {
        case 1:
          ingresar(op-1);
          break;
        case 2:
          ingresar(op-1);
          break;
        case 3:
          lSalir = true;
          limpiar(3);
          System.out.println("¡ ADIOS SISTEMA !");
          break;
        default:
          System.out.println("¡NUMERO debe estar entre 1 y 3!");
      } //Fin Switch
    } while (!lSalir);
    kbd.close();
  } //Fin main().

  //Metodos internos
  public static void mostrarMenu1() {
    System.out.printf("%20s"  ,"MENU DE SUPERMERCADOS");
    System.out.printf("\n%20s","---------------------");
    System.out.printf("\n%-30s","1) Supermercado 1");
    System.out.printf("\n%-30s","2) Supermercado 2");    
    System.out.printf("\n%-30s","3) Salir");
    //
    System.out.printf("\n\n%-30s","Ingrese número de opción: ");
  }  
  //
  public static void ingresar(int opcion) {
    aSuperm.get(opcion).menu();
  } //Fin ingresar
  //
  
  public static void limpiar(int nVeces) {
    for (int i = 0; i<nVeces; i++) System.out.println();
  } //Fin limpiar

  
  //*********  Inner  Class  *********

  public class Superm {
    ArrayList<Carro> aCarro = new ArrayList<Carro>();
    public void menu() {
      boolean lSalir = false;      
      do {
        int op = 0;
        limpiar(1);
        System.out.printf("%20s","MENU DEL CARRO");
        System.out.printf("\n%20s","--------------");
        System.out.printf("\n%-30s","1) Crear carro de compra");
        System.out.printf("\n%-30s","2) Agregar productos al carro");
        System.out.printf("\n%-30s","3) Eliminar productos del carro");    
        System.out.printf("\n%-30s","4) Mostrar Productos del carro");
        System.out.printf("\n%-30s","5) Facturar productos del carro");
        System.out.printf("\n%-30s","6) Gestionar catalogo de productos");
        System.out.printf("\n%-30s","7) Salir");
        //
        System.out.printf("\n\n%-30s","Ingrese número de opción: ");
        op = kbd.nextInt();
        //
        switch (op) {
          case 1:
            crear();
            break;
          case 2:
            agregar();
            break;
          case 3:
            //eliminar();
            break;
          case 4:
            //mostrar();
            break;
          case 5:
            //facturar();
            break;
          case 6:
            //gestionar();
            break;
          case 7:
            lSalir = true;
            limpiar(1);
            System.out.println("¡ ADIOS CARRO !");
            limpiar(5);            
            break;
          default:
            System.out.println("¡NUMERO debe estar entre 1 y 7!");
        } //Fin Switch
      } while (!lSalir);
    } //Fin menu()
    //
    public void crear() {
      int tot = aCarro.size();
      System.out.println("Actualmente dispone de " + tot + "carros");
      if (tot<5) {
        //aCarro.add(new Exp08824873().new Carro());
        System.out.println("Se ha creado EXITOSAMENTE otro carro!");
      }  
    }
    //
    public void agregar() {
      if (aCarro.size() > 0) {
        aCarro.get(aCarro.size()).addPdto(aCarro.size());
      }  
    }  
    
  } //Fin Superm *************************

  public class Carro {
    ArrayList<Producto> aProducto = new ArrayList<Producto>();
    //
    public void addPdto(int tot) {
      
      int op = 0;
      System.out.print("Ingrese N° carro para agregar producto : (1 al " + tot + " ): ");
      op = kbd.nextInt();
      aProducto.add(new Exp08824873last().new Producto());
      System.out.println("Se agrego producto N° "+ (tot+1));
    }
  } //Fin Carro  
  
  public class Producto {
    public void addPdto() {
      
    }  
  }  
  
  //********* FIN Inner Class *********
  
} //Fin CLASS