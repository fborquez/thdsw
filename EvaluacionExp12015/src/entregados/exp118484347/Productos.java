package entregados.exp118484347;

import java.util.Scanner;
public class Productos {
  int fil;
  
  String [][] producto = new String [2][2];
  
  
  public Productos() { 
    /*CONSTRUCTOR*/
    producto = new String [2][2];
  }
  
  
  public void CreaProductos()
  {
    int c;
    c=1;
    System.out.println("Ingreso a Crear productos");
    
   
    
    for (int fila=0; fila < 2; fila++)
         for (int colu=0; colu < 2; colu++)
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
          
          
           Scanner teclado = new Scanner(System.in);
           producto[fila][colu] = teclado.nextLine();
        
       }
    
     } 
    
    
    
    public void Catalogoproductos()
    {
     
      int c;
      c=1;
      System.out.println("Ingreso a Crear productos");
    
   
    
      for (int fila=0; fila < 2; fila++)
         for (int colu=0; colu < 2; colu++)
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
          
          
           System.out.println(producto[fila][colu]);
        
       }
      
      
      
    }
    
       
      
    }
     
      
    
    
 
  
