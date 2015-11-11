package entregados.exp128216677;

import java.util.*;
import java.util.Scanner;
class Exp128216677{
  public static void main(String[] args) {
  // generar catalogo en forma automatica
    ArrayList<Supermercado> supermercado = new ArrayList<Supermercado>();
    int i;
    int op ;
    int op1;
    int op3;
    
    
     Supermercado superMrket = new Supermercado();
     superMrket.setNombre("1.- Santa isabel");
     Scanner sc = new Scanner(System.in);
     superMrket.setProductoCatalogo(new Producto("leche",1,"Kg.",2000,5));
     superMrket.setProductoCatalogo(new Producto("vino",1,"lt",4000,8));
     supermercado.add(superMrket);
   
     
     
     
        superMrket = new Supermercado();
        superMrket.setProductoCatalogo(new Producto("camisa",1,"unidad.",2000,5));
        superMrket.setProductoCatalogo(new Producto("pantalon",1,"unidad",4000,0));
        superMrket.setNombre("2.- jumbo");
        supermercado.add(superMrket);
        
        System.out.println("seleccione catalogo de supermencado Supermercado");
        
        for (i=0;i<supermercado.size();i++){
         System.out.println(supermercado.get(i).getNombre());
        
        }
        
        op=sc.nextInt();
      
        op--;
       
         System.out.println(supermercado.get(op).getNombre() + " Le ofrece los siguientes productos");
        for(i=0;i<supermercado.get(op).getProductos().size();i++){
            System.out.println(i + ".- " + supermercado.get(op).getProductos().get(i).obtenerProducto());
        }
        
          
          op1=0;
           while(op1<5){
              System.out.println("***************************");
              System.out.println("¿ Que desea hacer?");
               System.out.println("***************************");
           System.out.println("1.- Crear Carro");
          
           System.out.println("2.- ver Productos en carro");
           System.out.println("3.- ver Agregar producto en carro");
           System.out.println("4.- Eliminar producto en carro");
            System.out.println("5.- Eliminar producto en carro");
                     
            op1=sc.nextInt();
            switch(op1){
              case 1:
                  supermercado.get(op).crearCarrovacio();
                   System.out.println("el carro ha sido creado");
                   op1=0;
                break;
              case 2:
                if(supermercado.get(op).obtenerCantidadcarros()==0){
                 System.out.println("Usted no tiene carros disponibles");
                 op1=0;
              }
                for(i=0;i<supermercado.get(op).getProductosCarro().size();i++){
                  System.out.println(  supermercado.get(op).getProductosCarro().get(i).obtenerProducto() + " $ " +  supermercado.get(op).getProductosCarro().get(i).getprecio());
             }
                //getProductosCarro
                 
                break;
              case 3:
                 System.out.println("Seleccione un producto del catalogo");
                 for(i=0;i<supermercado.get(op).getProductos().size();i++){
                     
                     System.out.println(i + ".- " + supermercado.get(op).getProductos().get(i).obtenerProducto());
                }
                  op3=sc.nextInt();
                  // supermercado.setProductoCarro(supermercado.obtenerProductoCompleto(op3));
                   System.out.println("En construccion");
                break;
              case 4:
                 System.out.println("En construccion");
                break;
              case 5:
                   System.out.println("*************gracias por preferirnos ..!!!!!!*********");
                  break;
            }
           
           }
           
           
           
          
        
        
         
       
        
        
        
        
     
     
     
     
     
     
     
     
       
    
    
  
    
    
    
  
  
  
  
  
  }
}