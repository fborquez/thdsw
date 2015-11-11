/**
 * Auto Generated Java Class.
 */

import java.io.*;
import java.util.*;

public class Exp155562455 {
 
  public static void main(String[] args) throws Exception{
    
    int cantSuper = 2;
    Supermercado[] supers = new Supermercado[cantSuper];
    Screen.print(" Bienvenido a Supermercados Falaferia ");
    
while(opcion != 0){
      try {
        Exp155562455.Menu();
        opcion = Integer.parseInt(Screen.input("Ingrese opción: "));
        
        switch (opcion) {
          case 1:
              
            break;
          case 2:
            break;
          case 3:
            
            break;
          case 4:
            
            break;
          case 5:
            
            break;
          case 6:
            
            break;
          case 0:
            // Se vA ... Chao Carlos
            break;
          default:
            Screen.print("Opcion No Valida");
            break;
        }
        
      } catch (Exception e) {
        Screen.print("Error: " + e.getMessage());
      }
    }
  
     

     
     
  }
  
  /* ADD YOUR CODE HERE */
  
  public static void Menu() throws Exception {
    Screen.print("Opciones:");
    Screen.print("1.- Agregar productos al carro.");
    Screen.print("2.- Eliminar productos del carro.");
    Screen.print("3.- Mostrar productos del carro.");
    Screen.print("4.- Facturar carro.");
    Screen.print("5.- Crear Carro.");
    Screen.print("6.- Gestionar Carro.");
    Screen.print("0.- Salir.");
  }
  
}
