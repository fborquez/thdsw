package entregados.exp167461263;

import java.util.*;

public class Exp167461263 {
  
  public static void main(String[] args) {
    
    
    Super supermercado;
    
int n=0;
    int m=0;
      Scanner teclado = new Scanner(System.in);
   //iniciar solicitando cual supermercado vamos a editar

    
    
    System.out.println("Elija Supermercado para ingresar informacion (1 o 2)");
                 n= teclado.nextInt();

                 if (n==1) {
                 
        Super supermercado1=new Super();
System.out.println("Opciones: 1- Agregar productos al carro");
            System.out.println("2- Eliminar productos del carro");
            
            System.out.println("3- Mostrar productos del carro");
            
            System.out.println("4- Facturar carro");
            
            System.out.println("5- Crear carro");
            
            System.out.println("6- Gestionar Catalogo");
            m= teclado.nextInt();
            
            if (m==1) {
                 
              
    supermercado1.ingresarCarro();



                 
                 }
            
            else if (m==2) {
                 
supermercado1.eliminarCarro();
                 
                 }
            
             else if (m==3) {
                 
supermercado1.mostrarCarro();
                 
                 }
             
              else if (m==4) {
                 
supermercado1.mostrarFactura();
                 
                 }
              
               else if (m==5) {
                 
supermercado1.crearCarro();
                 
                 }
               
                else if (m==6) {
                 
supermercado1.catalogoeditar();
                 
                 }
            
                 
                 }
                 
    if (n==2) {
                 
        Super supermercado2=new Super();
System.out.println("Opciones: 1- Agregar productos al carro");
            System.out.println("2- Eliminar productos del carro");
            
            System.out.println("3- Mostrar productos del carro");
            
            System.out.println("4- Facturar carro");
            
            System.out.println("5- Crear carro");
            
            System.out.println("6- Gestionar Catalogo");
            m= teclado.nextInt();
            
            if (m==2) {
                 
              
    supermercado2.ingresarCarro();



                 
                 }
            
            else if (m==2) {
                 
supermercado2.eliminarCarro();
                 
                 }
            
             else if (m==3) {
                 
supermercado2.mostrarCarro();
                 
                 }
             
              else if (m==4) {
                 
supermercado2.mostrarFactura();
                 
                 }
              
               else if (m==5) {
                 
supermercado2.crearCarro();
                 
                 }
               
                else if (m==6) {
                 
supermercado2.catalogoeditar();
                 
                 }
            
                 
                 }
                 
                 }
    
    
            
  }
  
  
  
  
  
  
  

