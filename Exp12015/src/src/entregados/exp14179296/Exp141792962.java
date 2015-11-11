import java.util.io;
import java.util.Scanner;

public class Exp141792962 {
  public static void main(String[] args) throws Exception{
    //instanciando un catalogo
    Catalogo micatalogo=new Catalogo();
    
    
    //en este apartado coloco los tipos de unidad que tienen los productos
     String[] tipodeUnidad=new String[4];
     tipodeUnidad[1]="gramos";
     tipodeUnidad[2]="pack";
     tipodeUnidad[3]="unidad";
     
     //esto es para el supermercado
     int[] supermercado=new int [3];
     supermercado[1]=1;
     Supermercado[2]=2;
     
     
     //esta es la parte del menu que vamos a utilizar
     int menuA=0;
    while(menuA!=7){
      System.out.println("Opciones:");
      System.out.println("1.- Agregar producto al carro");
      System.out.println("2.-Eliminar productos del carro");
      System.out.println("3.-Mostrar productos del carro");
      System.out.println("4.-Facturar el carro");
      System.out.println("5.-Crear carro");
      System.out.println("6.-Gestionar catalogo");
     
      
      
      
      
      //parte qu eno alcance a hacer ...
      switch(menuA){
        case 1:
          
          if (index<cartera.length){
          s.print("-
          
          
          //--
           int nLineas=Integer.parseInt(s.input("Numero de lineas(1 -5):"));
          // instancia contrato->
          cartera[index]=new Contrato(nCliente,rut,nLineas,precio,renovacion,conexion,velocidad);
          //
         
          for (int i=0; i<nLineas;i++){
           int num=Integer.parseInt(s.input("Numero linea telefonica("+ (i+1) +")"));
           int tlinea=Integer.parseInt(s.input("Tipo Linea:  \n\t1) Normal  \n\t2) Preferencial"));                         
           String tipoL=tipoLineas[tlinea];// tipoL es el que va al constructor
            cartera[index].addLinea(num,i,tipoL);                   
          }
          index++;
        }
          break;
        case 2:
          int masCaro=0;
          for (int i=0;i < index;i++){
            if (cartera[masCaro].getPrecio() < cartera[i].getPrecio()){
              masCaro=i;
            }
            
          }
          s.print("El contrato mas caro es:\nCliente:" + cartera[masCaro].nombreCliente);
          
          s.print("Internet:\t"+ cartera[masCaro].getInet() );
          
          for (int i=0;i<cartera[masCaro].getNlineas()  ;i++){
         
            s.print("Linea "+ (i+1) +":\n" + cartera[masCaro].getLinea(i));
          }
          s.print("\n-----------------------------------------");
          break;
          
        case 3:
          s.print("Monto Total vendido:");
          int total=0;
          for (int i=0;i< index;i++){
            total+=cartera[i].getPrecio();
          }
          s.print("$"+total +"\n--------------------------\n");
          break;
      
     
     
    
    
  }
}