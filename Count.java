import java.io.*;
import java.util.*;
public class Count{
      public static void main(String args[]){
     System.out.println("Enter Your String...");
      String Input=laptop is good;
      int c=0;
      for(int i=0;i<Input.length();i++)
      {
        if(Input.charAt(i)!=' ')
        {
        c++;
        }
      }
      System.out.println("The Count is "+c);
     }
}
