package entregados.exp120562401;

import java.util.*;

public class Exp120562401 {
 private String tipoUnidades[]={"gramos", "pack", "unidad"};
 public String verTipoUnidades (int id){
        return this.tipoUnidades[id];
  } 
 public static void main(String[] args) {
 
   Scanner sc = new Scanner(System.in);     
    int cantSup=2;
    int opcion = -1;
    int superSel =0;
    int precioProd,canProd,tipoProd;
    int continuar=1;
    
    
    SuperMercado[] supers = new SuperMercado[cantSup];
    
     System.out.println("-----------------------Gestion de carro de compra------------------------");    
     System.out.println("Ingreso de Supermercado");  
    
       for (int i = 0; i < cantSup; i++) {
          System.out.println("Ingrese el nombre del supermercado " + (i + 1));
          String nombre = sc.nextLine();
          supers[i] = new SuperMercado(nombre);
       }
System.out.println(opcion);
    while(opcion != 0){
      try {
         System.out.println("Opciones:");
         System.out.println("1.- Agregar productos al carro.");
         System.out.println("2.- Mostrar carro.");
         System.out.println("3.- Facturar carro.");
         System.out.println("0.- Salir.");
    
        System.out.println("Ingrese su opción: ");
        opcion = sc.nextInt();
        
        if (opcion != 0) {
          System.out.println("¿En qué supermercado está el carro? (1 - "+cantSup+"): ");
          superSel = sc.nextInt();
          SuperMercado unSupermercado = supers[superSel - 1];
         
          System.out.println("Seleccione un carro (1 - "+unSupermercado.cantCarritos+"): ");
          int carritoSel = sc.nextInt();
          Carrito carro = unSupermercado.getCarrito(carritoSel);
          
          switch (opcion) {
            case 0:
              // no se hace nada y luego se sale
              break;
            case 1:
              // agregar productos al carrito
              while (continuar == 1) {
              System.out.println("Ingrese nombre del producto: ");
              String nomProd = sc.nextLine(); 
              System.out.println("Ingrese precio del producto: ");
              precioProd = sc.nextInt();
              System.out.println("Ingrese cantidad del producto: ");
              canProd = sc.nextInt();
              
              System.out.println("Ingrese el tipo de unidad, según el siguiente listado:");
              imprimirTipoUnidades(tipoUnidades);
              
              tipoProd = sc.nextInt();
              
              Producto unProducto = new Producto(nomProd, precioProd, canProd, tipoProd);
              carro.agregarProducto(unProducto);
              
              System.out.println("Se agregó el producto " + nomProd + " al carro " + carritoSel + " del SuperMercado " + superSel + " (" + unSupermercado.getNombre() + ").");
              System.out.println("¿Desea continuar agregando productos al carro "+carritoSel+"? (1: Sí, Otro: No)");
              continuar = sc.nextInt();
              }
              break;  
            default:
              System.out.println("Error:Opción ingresada no es válida!");
              break;
          }
        }
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
  
    System.out.println("----------------------Fin Sistema:Gestion de carro de compra------------------------");
    
    if(sc != null) {
        sc.close();
      }
  }
  public static void imprimirTipoUnidades (String lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
  }      
  
       
      
}