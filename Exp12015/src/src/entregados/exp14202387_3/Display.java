package entregados.exp14202387_3;

import java.io.*;
public class Display{

  public Display(){
   
  }
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