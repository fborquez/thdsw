package entregados.exp141744771;

public class Main {
  
  
public static void main(String[] args) {
 
    boolean error;
   
   //Con este do-wile controlamos que si hay error empiece denuevo
   do{
    error=false;
    
   

   try {
    BufferedReader teclado = new BufferedReader(new InputStreamReader(
      System.in));
    Producto[] productos;
    Carro[] carro;
    String seleccion;
    System.out.println("Bienvenido Falaferia");
    
    System.out.println("Ingrese n° 1=Ekono o 2=Hiper");
     if (seleccion.equalsIgnoreCase("1")) 
   {
    System.out.println("Opciones");
    System.out.println("1- Agregar producto al Carro");
    System.out.println("2- Emilinar producto del Carro");
    System.out.println("3- Mostrar Carro");
    System.out.println("4- Facturar Carro");
    System.out.println("5- Crear Carro");
    System.out.println("6- Gestionar Carro Carro");
    
    seleccion = teclado.readLine();
    
    if (seleccion.equalsIgnoreCase("1")) 
    {
     System.out.println("A que carro desea Ingresar Producto (1-5)");
     int numero = new Carro[Integer.parseInt(teclado.readLine())];
     String estado="Activo";
     //Ingresa Carro
     carro[i] = new Carro(numero, estado);
     
     String continua ="S";
     while(continua=="S")
     {
       
     System.out.println("Descripción del Producto");
     String descripcion = new Producto[teclado.readLine()];
     System.out.println("Cantidad del Producto");
     int cantidad = new Producto[Integer.parseInt(teclado.readLine())];
      System.out.println("Tipo del Producto");
     int tipo = new Producto[Integer.parseInt(teclado.readLine())];
     System.out.println("Precio del Producto");
     int precio = new Producto[Integer.parseInt(teclado.readLine())];
     
     //se ingresa Producto
     productos[i] = new Producto(descripcion, cantidad, tipo, precio);
          
   }
    //Mostramos la info ingresada del producto    
    System.out.println("Producto " + i + ":s");
    productos[i].mostrarProducto();
    carro[i].mostrarEstadoCarro();
    
    
     System.out.println("Desea continuar? (S/N)");
     continua = teclado.readLine();
     i++;
    }
    
     if (seleccion.equalsIgnoreCase("2")) 
    {
       
       
    }
     //Mostramos los productos del Carro
     if (seleccion.equalsIgnoreCase("3")) 
    {
       for (int i = 0; i < productos.length; i++) 
       {
         System.out.println("Producto " + i + ":s");
         productos[i].mostrarProducto();
    
       }
       
    }
    if (seleccion.equalsIgnoreCase("4")) 
       {
      for (int i = 0; i < productos.length; i++) 
       {
        productos[i].mostrarFacturaProductos();
        
      }
    }
   }
 } catch (IOException e) {
   // TODO Auto-generated catch block
   error=true;
   System.out.println("IOException-> empiece denuevo");
   //e.printStackTrace();
  }

  }while(error);
    
}
}
