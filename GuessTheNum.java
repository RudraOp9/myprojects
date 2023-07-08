
import java.util.Random;
import java.util.Scanner;

 class getset {
  int a;
	
	
	
}

public class GuessTheNum {
	
	static int RandomNum() {
		int cran = (int)(Math.random() * 101);
		return cran;
	}
	
	/*static int userinput() {
		
		System.out.print("Enter Your Number :");
		Scanner sc = new Scanner(System.in);
		int uin = sc.nextInt();
		return uin;
	}*/
	
	public static void main(String[] args) {
		System.out.println("Welcome to Guess The Number Game. \n \tdon\'t no how to play just google it.\'");
		
		getset counts = new getset();
		counts.a=0;
		int cran = RandomNum();
		int uin= 30;
		//int uin = userinput();
		System.out.println(cran);
	do	{
		System.out.print("Enter Your Number :");
		Scanner sc = new Scanner(System.in);
		uin = sc.nextInt();
			if (uin>cran) {
			System.out.println("You have gone too far away");
			}
			if(uin<cran) {
			System.out.println("You have chosen an small number buddy.");
			}
			counts.a++;
			} while(uin>cran || uin<cran );
		System.out.println("Yeahh you have guessed the number in "+ counts.a + " Tries");
		
		if (counts.a<=3){System.out.println("nice your MEDAL : GOLD");}
		if (counts.a>3 && counts.a<9){System.out.println(" your MEDAL : Silver");}
		if (counts.a>=9){System.out.println("MEDAL : Try again");}
		
		
	}
}