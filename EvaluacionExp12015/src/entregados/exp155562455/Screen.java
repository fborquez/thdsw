/**
 * Auto Generated Java Class.
 * La verdad es que lo tome tal cual del ejemplo del ejercicio del DVD
 */
import java.io.*;
import java.util.*; 

public class Screen {
  
  public Screen() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  /* ADD YOUR CODE HERE */
  
  public String input(String Message) throws Exception{
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    System.out.println(Message);
    String input = in.readLine();
    return input;
  }
  public void print(String Message) throws Exception{
    System.out.println(Message);
  }
  
}
