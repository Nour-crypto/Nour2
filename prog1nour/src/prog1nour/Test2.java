package prog1nour;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.print("skriv namn ");
		String namn=input.nextLine();
		

		
		System.out.print("skriv �lder ");
		int �lder=input.nextInt();
		
		
		System.out.print("skrive l�ngd ");
		double l�ngd=input.nextDouble();
		
		
		System.out.println( namn+" �r "+�lder+" �r gammal och "+l�ngd+" m l�ng." );
		System.out.println( "St�mmer det?" );
		
		
	}
	
	
}
        