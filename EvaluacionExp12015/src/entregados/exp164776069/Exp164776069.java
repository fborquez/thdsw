package entregados.exp164776069;

import java.util.Scanner;
import java.util.*;

public class Exp164776069 {

 public static ArrayList < Carro > _carros = new ArrayList < Carro > ();
 public static ArrayList < Producto > _productos = new ArrayList < Producto > ();
 public static void main(String args[]) {


  Scanner sc = new Scanner(System. in );
  int supermercado = 0;
  int opcionMenu = 0;
  do {

   System.out.println("Elija supermercado para ingresar observación (1 o 2): ");
   supermercado = sc.nextInt();
  } while (supermercado != 1 && supermercado != 2);
  int salida = 0;
  do {
   System.out.println("Opciones:  ");
   System.out.println("1.- Agregar productos al carro ");
   System.out.println("2.- Eliminar productos del carro");
   System.out.println("3.- Mostrar productos del carro");
   System.out.println("4.- Facturar carro");
   System.out.println("5.- Crear carro");
   System.out.println("6.- Gestionar catalogo");
   System.out.println("7.- Salir del Programa");
   System.out.println("Seleccione opción");

   do {
    opcionMenu = sc.nextInt();
   } while (opcionMenu != 1 && opcionMenu != 2 && opcionMenu != 3 && opcionMenu != 4 && opcionMenu != 5 && opcionMenu != 6 && opcionMenu != 7);

   switch (opcionMenu) {
    case 1:
     AgregarProductosAlCarro();
     break;
    case 2:
     EliminarProductosAlCarro();
     break;
    case 3:
     MostrarProductosAlCarro();
     break;
    case 4:
     FacturarCarro();
     break;
    case 5:
     CrearCarro();
     break;
    case 6:
     GestionarCatalogo();
     break;
    case 7:
     salida = 2;
     break;

   }
  } while (salida != 2);
 }

 public static int AgregarProductosAlCarro() {
  Producto prod = new Producto();
  Carro carro = new Carro();
  Scanner sc = new Scanner(System. in );
  Scanner sc2 = new Scanner(System. in );
  int salida = 0;
  int numeroCarro = 0;
  do {
   System.out.println("A que carro desea agregar el producto?");

   System.out.println("Carros disponibles:");
   if (_carros.size() > 0) {
    for (Carro car: _carros) {
     car.PrintNumeroCarro();
    }

    Boolean carroEncontrado = false;
    
    
    /// Aca hay un problema que no alcanze a resolver.. perdon... 
    do {
     numeroCarro = sc.nextInt();
     
     for (Carro car: _carros) {
      if (car.GetNumeroCarro() == numeroCarro) {
       carroEncontrado = true;       
      }
     }
     if (carroEncontrado == false) {
      System.out.println("Carro no encontrado");
     }
     else{
       System.out.println("Catalogo de productos:");
       int countProductos = 1;
       int productoSeleccionado = 0;
       for (Producto produ: _productos) {
        System.out.print(countProductos + ".-  ");
        produ.ImprimirProducto();
        countProductos++;
       }
       int cantidadProductos = 0;
       System.out.println("Ingrese producto: ");
       productoSeleccionado = sc.nextInt();

       Producto seleccion = _productos.get(productoSeleccionado - 1);
       System.out.println("Ingrese cantidad: ");
       cantidadProductos = sc2.nextInt();
       Producto nuevoProducto = new Producto(seleccion.GetNombre(), cantidadProductos, seleccion.GetTipoUnidad(), seleccion.GetPrecio(), seleccion.GetDescuento());
       _carros.get(numeroCarro-1).AddProducto(nuevoProducto);
       carroEncontrado = true;
     }
    } while (carroEncontrado == false);
    salida = sc.nextInt();
   } else {
    System.out.println("No existen carros disponibles debe crear un carro primero.");
    salida = 2;
   }
  }
  while (salida == 1);

  return salida;
 }

 public static int EliminarProductosAlCarro() {

  System.out.println("De que carro desea eliminar productos?");
  PrintCarros();
  Scanner sc = new Scanner(System. in );

  int seleccion = 0;

  seleccion = sc.nextInt();

  System.out.println("Que producto desea eliminar?");
  _carros.get(seleccion - 1).ImprimirProductos();
  seleccion = sc.nextInt();
  _carros.get(seleccion - 1).eliminarProducto(seleccion);
  return 2;
 }

 public static int MostrarProductosAlCarro() {


  System.out.println("De que carro desea mostrar los productos?");
  PrintCarros();
  Scanner sc = new Scanner(System. in );

  int numeroCarro = 0;

  numeroCarro = sc.nextInt();

  _carros.get(numeroCarro - 1).ImprimirProductos();



  return 2;
 }

 public static int FacturarCarro() {
  System.out.println("De que carro desea mostrar la Factura?");
  PrintCarros();
  Scanner sc = new Scanner(System. in );

  int numeroCarro = 0;

  numeroCarro = sc.nextInt();
  
   _carros.get(numeroCarro - 1).ImprimirFactura();
  return 2;
 }

 public static int CrearCarro() {
  Carro nuevoCarro = new Carro();
  nuevoCarro.SetNumeroCarro(_carros.size() + 1);
  System.out.print("Se ha creado el ");
  nuevoCarro.PrintNumeroCarro();

  _carros.add(nuevoCarro);


  return 2;
 }

 public static int GestionarCatalogo() {

  int opcionMenu = 0;
  Scanner sc = new Scanner(System. in );
  Scanner sc2 = new Scanner(System. in );
  Scanner sc3 = new Scanner(System. in );
  Scanner sc4 = new Scanner(System. in );
  Scanner sc5 = new Scanner(System. in );
  
  do {
   do {
    System.out.println("\tOpciones:  ");
    System.out.println("\t\t1.- Agregar producto");
    System.out.println("\t\t2.- Eliminar producto");
    System.out.println("\t\t3.- Salir");



    opcionMenu = sc.nextInt();
   } while (opcionMenu != 1 && opcionMenu != 2 && opcionMenu != 3);

   switch (opcionMenu) {
    case 1:
     {
      String name,tipoUnidad;
      int Precio, Descuento;
      System.out.println("Nombre: ");
      name = sc2.nextLine();
      System.out.println("TipoUnidad: ");
      tipoUnidad = sc3.nextLine();
      System.out.println("Precio: ");
      Precio = sc4.nextInt();
      System.out.println("Descuento: ");
      Descuento = sc5.nextInt();
      _productos.add(new Producto(name, tipoUnidad, Precio, Descuento));
      System.out.println("Agregado exitosamente ");
     }
     break;
    case 2:
     {
      int seleccion = 0;
      System.out.println("Que producto desea eliminar?");
      PrintProductos();
      seleccion = sc.nextInt();
      _productos.remove(seleccion - 1);
     }
     break;
   }
  } while (opcionMenu != 3);

  return 2;

 }
 public static void PrintProductos() {
  int countProductos = 1;

  for (Producto produ: _productos) {
   System.out.print(countProductos + ".-  ");
   produ.ImprimirProducto();
   countProductos++;
  }
 }

 public static void PrintCarros() {


  for (Carro car: _carros) {

   car.PrintNumeroCarro();

  }
 }
}