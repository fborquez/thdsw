package entregados.exp14202387_3;

import java.util.*;

public class Exp14202387_3{
  
  static final int NUMERO_CARRITOS = 2;// son 5 
  Scanner c= new Scanner(System.in);
  
  public static void main (String [] args) throws Exception{
    Super[] supermercados = new Super[2];
    String[] superMerc =new String[3];
    superMerc[1] = "MasCaro";
    superMerc[2] = "MasBarato";
    boolean tieneDesc = false;
    
    String[] carritos =new String[6];
    carritos[1] = "1";
    carritos[2] = "2";
    carritos[3] = "3";
    carritos[4] = "4";
    carritos[5] = "5";
    
    
    int nroCarro;
    int nroSuper;
    
    
    Display dsp=new Display(); 
    int menuA=0;
    while(menuA!=6){
      menuA=Integer.parseInt(dsp.input("OPCIONES\n1)Agregar productos al carro \n2)Eliminar productos del carro\n3)Mostrar productos del carro”\n4)Facturar Carro\n5)Crear carro\n6)Gestionar catalogo\n7)Salir"));
      switch(menuA){
        case 1:
          
          int opcSuper=Integer.parseInt(dsp.input("Seleccione supermercado:  \n1) Super más caro  \n2) Super más barato"));                         
          String nombreSuper=superMerc[opcSuper];
          int opcCarro=Integer.parseInt(dsp.input("Del super " + nombreSuper + " qué carro desea utilizar: (5)"));
          
          System.out.println("Ingrese los productos al carro");
          String descrip=dsp.input("Descripcion del producto");
          int cantidad=Integer.parseInt(dsp.input("Cantidad"));
          String tipoUnidad=dsp.input("Tipo unidad");
          int tieneDescuento=Integer.parseInt(dsp.input("Tiene descuento:  \n1) SI  \n2) NO"));
          if (tieneDescuento==1){
            tieneDesc = true;
          }else{
            tieneDesc = false;
          }
                                                     
          supermercados[opcSuper].carritos[opcCarro].addProducto(descrip,cantidad,tipoUnidad,tieneDesc);                                                 
                                        
                           
                                        
                                        
           break;
          }
    }
    
    
  } 
  

  
  
  
  
  
  
  
  
  
}


