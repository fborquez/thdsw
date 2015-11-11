package entregados.exp17469295;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exp17469295 {
  
  
  public static void main(String[] args) throws Exception  { 
    
     Market[]  supermrcado = new Market[2]; // los dos supermercados     
    // List<Catalogo> catalogo = new ArrayList<Catalogo>(); 
     Catalogo[]  catalogo = new Catalogo[20]; //por reglas de negocio solo hay 20 productos en el catalogo
    
    
   int menuA=0;
   int menuB=0;
   int largo =0; 
   int indice =0;
 BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Elija supermercado para ingresar Informacion (1 o 2)");
     int numSuper=Integer.parseInt(teclado.readLine());
     System.out.println("-----estamos en el super "+numSuper+"--------------------------");
    while(menuA!=7){
    
     
     System.out.println("Opciones\n1)Agregar Productos al carror \n2)Eliminar Productos de Carro\n3) Mostrar Productos Del Carro\n4)Facturar Carro\n5)Crear Carro\n6)Gestionar Catalogo \n7)Salir");
     String scase=(teclado.readLine());     
     menuA=Integer.parseInt(scase);
     
       switch(menuA){
           case 1:        
             
                System.out.println("Agregar Productos al carro");
                System.out.println("-------------------------------");
                System.out.println("A que carrito decea agregar productos (1, 2, 3 ,4 , 5)");
                int numCarrito=Integer.parseInt(teclado.readLine());
                
                System.out.println("Los Productos del catalogo son");
                
                 for (int i=0;i < indice;i++){
                   
                      System.out.println(i+1+".-"+ catalogo[i].getNombre()+" "+ catalogo[i].getDescripcion()+" precio: "+ catalogo[i].getPrecio()+" descuento: "+ catalogo[i].getDescuento()+" "+ catalogo[i].getTipoUnidad()); 
                      System.out.println("---------------------------------------------------------------------------------------");
            
                 }
                 
                         
                        while(menuB!=2){
                          System.out.println("Opciones\n1)Agregar Productos \n2)volver al menu principal");
                          String scaseb=(teclado.readLine());     
                          menuB=Integer.parseInt(scaseb);
                             
                           switch(menuB){
                             
                             case 1: 
                               
                                System.out.println("Ingrese Producto al Carrito");
                                     System.out.println("-------------------------------");
                                     System.out.println("Ingrese nombre del producto");
                                     String nomPro=(teclado.readLine());
                                     System.out.println("Ingrese Descripcion");
                                     String desPro=(teclado.readLine());
                                     System.out.println("Ingrese precio");
                                     int precioPro=Integer.parseInt(teclado.readLine());
                                     System.out.println("Ingrese Descuento en porcentaje, si no tiene ingrece 0");
                                     int descPro=Integer.parseInt(teclado.readLine());
                                     System.out.println("Ingrese Tipo Unidad (1.-gramos, 2.-pack, 3.-unidad)");
                                     int tipoUnidad=Integer.parseInt(teclado.readLine());
                                     System.out.println("Ingrese cantidad");
                                     int cantidad=Integer.parseInt(teclado.readLine());
                                     
                                     supermrcado[numSuper] =  new Market(nomPro,desPro,precioPro,descPro,tipoUnidad,cantidad);
                                      
             
                             break;
                           }
                        }
                     
                    
           
           
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
             
              System.out.println("Ingrese Producto a Catalogo");
               System.out.println("-------------------------------");
                    System.out.println("Ingrese nombre del producto");
                    String nomPro=(teclado.readLine());
                    System.out.println("Ingrese Descripcion");
                    String desPro=(teclado.readLine());
                    System.out.println("Ingrese precio");
                    int precioPro=Integer.parseInt(teclado.readLine());
                    System.out.println("Ingrese Descuento en porcentaje, si no tiene ingrece 0");
                    int descPro=Integer.parseInt(teclado.readLine());
                    System.out.println("Ingrese Tipo Unidad (1.-gramos, 2.-pack, 3.-unidad)");
                    int tipoUnidad=Integer.parseInt(teclado.readLine());
                    
                    catalogo[indice] = new Catalogo(nomPro,desPro,precioPro,descPro,tipoUnidad);
                    
                  indice++;
             
             
             break;
           
          
          
         
       }
     
        
        
    
    
    }
    
    
  }
  
  
  
}

