package prog1nour;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.print("skriv namn ");
		String namn=input.nextLine();
		

		
		System.out.print("skriv ålder ");
		int ålder=input.nextInt();
		
		
		System.out.print("skrive längd ");
		double längd=input.nextDouble();
		
		
		System.out.println( namn+" är "+ålder+" år gammal och "+längd+" m lång." );
		System.out.println( "Stämmer det?" );
		
		
	}
	
	
}
        