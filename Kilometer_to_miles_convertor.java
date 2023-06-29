//must change the file name to ```MyClass``` before preceding
import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
    //Kilometer to miles convertor
    // 1 km = 0.621 miles
    float km = 0.621f;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter kilometer");
    float a = sc.nextInt();
    float miles = km*a;
    System.out.println(a + " kilometers is equals to " + miles + " miles");
    
    
  }
}
