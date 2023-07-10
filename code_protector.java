import java.util.Scanner ;
import java.io.File ;
import java.io.FileWriter;
import java.io.IOException;

public class code_protector {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the code storage with password protection.");
		System.out.println("To create an new file enter mkfil \n To view an protected file enter viefile");
		String file = sc.next();
		if ( file.equalsIgnoreCase("mkfil") ){
				try {
				System.out.print("Enter file name :");
				String fene = sc.next();
				System.out.print("Enter text or code into the file : ");
				String erfn = sc.next();
				erfn += sc.nextLine();
				
				FileWriter myWriter = new FileWriter(fene);
				myWriter.write(erfn);
				myWriter.close();
				File jihan = new File(erfn);
				String absolute = jihan.getAbsolutePath() ;
				
				System.out.print("Successfully wrote to the file. \n The file location : ");
				System.out.println(absolute);
       
				} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
				}
			//if (file.equalsIgnoreCase("viefile")) {}
			//will be continued...
		}
		
	}
}