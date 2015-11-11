package entregados.exp118484347;

import java.util.Scanner;

public class Exp118484347 {
  
  public Exp118484347() { 
    /*CONSTRUCTOR*/
  }
  
    
  public static void main(String[] args) { 
    
      int opcion;
      opcion = 0;
      
      System.out.println("Menú Supermercado");
      System.out.println("Supermercado [1]:");
      System.out.println("Supermercado [2]:");
      System.out.println("Salir del Supermercado [3]:");
      System.out.println("ingrese opción...");
      Scanner teclado = new Scanner(System.in);
      opcion = teclado.nextInt();
      
      if (opcion == 1)
      {
        System.out.println("Ingreso a Supermercado 1");
        
        Supermercado supermercado = new Supermercado();
        supermercado.IngresaSupermercado();
       
        
      }
      
      if (opcion == 2)
      {
        Supermercado supermercado = new Supermercado();
        supermercado.IngresaSupermercado();
        
      }
      
       if (opcion == 3)
      {
        System.out.println("Gracias por comprar con nosotros vuelva pronto!!!");
        /*Programa programa = new Programa();
         programa.creaPrograma();*/
        
      }
    }
    
    
  }
  
