import java.util.Scanner;
public class MyClass {
  public static void main (String[] args) {
    System.out.println("cbse percentage calculator");
    Scanner sc = new Scanner(System.in);
    System.out.println(" your paper was of how many marks ?");
    float a1 = sc.nextInt();
    System.out.println("marks in sub 1");
    float a = sc.nextInt();
    System.out.println("your marks in subject 1 : " + a);
    System.out.println("marks in sub 2");
    float b = sc.nextInt();
    System.out.println("sub 2 marks :" + b);
    System.out.println("enter marks of sub 3");
    float c = sc.nextInt();
    System.out.println("your marks in subject 3 :" + c);
    System.out.println("enter marks of sub 4");
    float d = sc.nextInt();
    System.out.println("your marks in subject 4 :" + d) ;
    System.out.println("enter marks of sub 5 + additionl");
    float e = sc.nextInt();
    System.out.println("your marks in subject 5 are" + e);
    
    
    float z = a+b+c+d+e ;
    System.out.println("Your total marks are :" +z);
    float per = z/(5*a1);
    float percent = per*100;
    float cgpa = percent/10;
    
    System.out.println("calculating your percentage......");
    System.out.println("your percentage is : " + percent);
    System.out.println("Your cgpa is :" + cgpa);
    
  }
}
