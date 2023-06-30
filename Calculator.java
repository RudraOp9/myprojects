// if you are using this code for your experiment , then do not forgot to change file name. Also the comment out code is my test work you can delete it for your instence.
import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      //an simple calculator made by RudraOp9
      System.out.println("CALCULATOR FOR SIMPLE AIRTHMATICS");
      System.out.print("Enter first number : ");
      double num1 = sc.nextInt();
      System.out.print("Enter operator NOTE: USE FIRST LETTER ( eg add -->a ,and  use lower case) :  ");
      String opr = sc.next() ;
      System.out.print("Enter second number :");
      double num2 = sc.nextInt();
      System.out.println("Calculating result .....");
     // if (opr=a) {
         // double add = num1 + num2 ;
         // System.out.println(add) ;
     // }
      
      /*double d = num1 / num2 ;
      double a = num1 + num2;
      double s = num1 - num2;
      double m = num1 * num2; */
      
     /* if ( opr = a ) {
          System.out.println(a);
      }*/
      
      //System.out.print(num1 +  opr +  num2 + " = " + opr);
      if (opr.equals("a")) {
         double add = num1 + num2;
         System.out.println(add);
     }
     if (opr.equals("s")) {
         double sub = num1 - num2;
         System.out.println(sub);
     }
     if (opr.equals("m")) {
         double mlt = num1 * num2 ;
         System.out.println(mlt) ;
     }
     if (opr.equals("d")) {
         double div = num1 / num2 ;
         System.out.println(div);
     } 
     
  }
}
// failiur after many attempts
// success after too many attrmpts
