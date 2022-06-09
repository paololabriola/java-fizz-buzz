package jana60;

import java.util.Scanner;

public class FizzBuzzBONUS {
	
	public static void main(String[] args) {
		
		int numeroMassimo=0, r3, r5;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci un numero tra 1 e 200, che andrà a definire il numero massimo da raggiungere: ");
		numeroMassimo = scan.nextInt();
		
		while((numeroMassimo<1) || (numeroMassimo>200)){
			
			System.out.print("Il numero deve essere compreso tra 1 e 200! Riprova: ");
			numeroMassimo = scan.nextInt();
		
		}
		
		for(int i=1; i<=numeroMassimo; i++) {
			
			String risultato="";
			
			r3 = i % 3;
			r5 = i % 5;
			
			if(r3 == 0) 
				risultato += "Fizz";
			
			if(r5 == 0)
				risultato += "Buzz";
				
			if((r3 != 0) && (r5 != 0))
				risultato += i;
				
			System.out.println(risultato);
		
		}

		scan.close();
		
	}
	
}
