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
     
     if ( uin.equals(a) && cin == 0) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : PAPER \n AI Move : Rock \n Congratulation, You won the Match !!");
         
     }
		 else if (uin.equals(a) && cin == 1) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : PAPER \n AI Move : PAPER  \n MATCH RESULTED IN TIE !!");
			}
		 else if (uin == a && cin == 2) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : PAPER  \n AI Move : SCISSOR \n AI Won \nAI message : its difficult to beat me child !!");
			}
		 else if (uin.equals(b) && cin == 0) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : ROCK \n AI Move : Rock \n MATCH RESULTED IN TIE !!");
			}
			else if (uin.equals(b) && cin == 1) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : ROCK \n AI Move : PAPER \n AI Won \n AI message : its difficult to beat me child !!");
			}
			else if (uin.equals(b) && cin == 2) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : ROCK \n AI Move : SCISSOR \n Congratulation, You won the Match !!");
			}
		  else if (uin.equals(c) && cin == 0) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : SCISSOR \n AI Move : Rock \n AI Won \n AI message : its difficult to beat me child !!");
			}
		  else if (uin.equals(c) && cin == 1) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : SCISSOR \n AI Move : PAPER \n Congratulation, You won the Match !!");
			}
		  else if (uin.equals(c) && cin == 2) {
         System.out.println("      You vs Computer");
         System.out.println("      Your Move : SCISSOR \n AI Move : SCISSOR \n MATCH RESULTED IN TIE !!");
			}
		
		 
  }
}
// this is end of this code