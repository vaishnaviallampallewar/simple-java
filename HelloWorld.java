import java.io.*;
public class HelloWorld{
  public static void main(String[] args){
    int[] arr = {Integer.parseInt(args[0]), Integer.parseInt(args[1])};
    for(int i = 0; i< 2 ; i++){ 
     System.out.println("Hello Vaishnavi for "+arr[i]+" time"); 
  }
 }
}
