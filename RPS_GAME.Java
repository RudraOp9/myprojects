// rock paper scissor
// do not forgot the file name before using this code
// in if else conditionals rename "€€€" with "/n".
import java.util.Random;
import java.util.Scanner;


public class MyClass {
  public static void main(String args[]) {
      
      // ROCK PAPER SCISSOR
      // ASSIGNED VALUES ROCK-0 PAPER-1 SCISSOR-2
      
      Random ran = new Random();
      Scanner sc = new Scanner(System.in);
      
      int limit = 3 ;
      int cin = ran.nextInt(limit);
      
     // System.out.println(cin);
     // SINCE WE ARE DOING RESULT IN TERMINAL
     
     System.out.print("ENTER YOUR MOVE - ROCK , PAPER , SCISSOR \n NOTE : input is case sensitive..... ENTER :");
     String uin = sc.nextLine();
     
     String a = "PAPER" ;
     String b = "ROCK" ;
     String c = "SCISSOR" ;
     
     //System.out.println(uin);
     
     if ( uin.equalsIgnoreCase(a) && cin == 0) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : PAPER €€€ AI Move : Rock  €€€ Congratulation, You won the Match !!");
         
     }
		 else if (uin.equalsIgnoreCase(a) && cin == 1) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : PAPER €€€ AI Move : PAPER  €€€ MATCH RESULTED IN TIE !!");
			}
		 else if  (uin.equalsIgnoreCase(a) && cin == 2) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : PAPER  €€€ AI Move : SCISSOR €€€ AI Won €€€ AI message : its difficult to beat me child !!");
			}
		 else if (uin.equalsIgnoreCase(b) && cin == 0) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : ROCK €€€ AI Move : Rock €€€ MATCH RESULTED IN TIE !!");
			}
			else if (uin.equalsIgnoreCase(b) && cin == 1) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : ROCK €€€ AI Move : PAPER €€€ AI Won €€€ AI message : its difficult to beat me child !!");
			}
			else if (uin.equalsIgnoreCase(b) && cin == 2) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : ROCK €€€ AI Move : SCISSOR €€€ Congratulation, You won the Match !!");
			}
		  else if (uin.equalsIgnoreCase(c) && cin == 0) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : SCISSOR €€€ AI Move : Rock €€€ AI Won €€€ AI message : its difficult to beat me child !!");
			}
		  else if (uin.equalsIgnoreCase(c) && cin == 1) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : SCISSOR €€€ AI Move : PAPER €€€ Congratulation, You won the Match !!");
			}
		  else if (uin.equalsIgnoreCase(c) && cin == 2) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : SCISSOR €€€ AI Move : SCISSOR €€€ MATCH RESULTED IN TIE !!");
			}
		
		 
  }
}
// this is end of this code
