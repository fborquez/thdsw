package entregados.exp118484347;


import java.util.Scanner;

public class Carro {
  int c;
  
  String [][] carrocompra = new String [5][5];
 
  public Carro() { 
    /*CONSTRUCTOR*/
    carrocompra = new String [5][5];
  }
  
  public void CrearCarro()
  {
     int opc;
     opc=0;
    while (opc != 7)
    {
    System.out.println("Opciones de Menu Carro");
    System.out.println("---------------------------------");
    System.out.println("Agregar productos al carro [1]:");
    System.out.println("Eliminar  productos al carro [2]:");
    System.out.println("Mostrar  productos del carro [3]:");
    System.out.println("Facturar carro [4]:");
    System.out.println("Crear carro [5]:");
    System.out.println("Gestionar carro [6]:");
    System.out.println("Salir del carro [7]:");
    System.out.println("ingrese opción...");
    Scanner teclado = new Scanner(System.in);
    opc = teclado.nextInt();
    
    
     if (opc == 1)
      {
        
        this.LlenaCarro();
        
        
      }
      
      if (opc == 2)
      {
        System.out.println("Ingreso a Supermercado 2");
        /*Programa programa = new Programa();
         programa.creaPrograma();*/
        
      }
    }
  }
  
  public void LlenaCarro()
  {
    
    System.out.println("Ingreso a llenar su carro");
    int op;
    op=0;
    c=1;
   
    System.out.println("No existe catalogo de productos, deben ser creados");
    Productos productos = new Productos();
    productos.CreaProductos();
    productos.Catalogoproductos();
    
    
    for (int fila=0; fila < 5; fila++)
         for (int colu=0; colu < 5; colu++)
         {
           
         c = fila + 1;
          if (colu == 0)
          {
            System.out.println("Codigo producto " + c);  
           
          }
           
           
          if (colu == 1)
          {
            System.out.println("Descripción producto " + c);         
          }
          
          
          if (colu == 2)
          {
            System.out.println("cantidad producto " + c);         
          }
          
          if (colu == 3)
          {
            System.out.println("Tipo Unidad producto " + c);         
          }
          
          if (colu == 4)
          {
            System.out.println("Precio producto " + c);         
          }
           Scanner teclado = new Scanner(System.in);
           carrocompra[fila][colu] = teclado.nextLine();
        
       }
    
       }
    }
      
    
 
  
  

