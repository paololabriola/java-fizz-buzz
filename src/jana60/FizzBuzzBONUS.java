package jana60;

import java.util.Scanner;

public class FizzBuzzBONUS {
	
	public static void main(String[] args) {
		
		int numeroMassimo=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci un numero tra 1 e 200, che andrà a definire il numero massimo da raggiungere: ");
		numeroMassimo = scan.nextInt();
		
		while((numeroMassimo<1) || (numeroMassimo>200)){
			
			System.out.print("Il numero deve essere compreso tra 1 e 200! Riprova: ");
			numeroMassimo = scan.nextInt();
		
		}
		
		for(int i=1; i<=numeroMassimo; i++) {
		
			if((i%15) == 0) {
			
				System.out.println("FizzBuzz");
			
			}else if((i%3) == 0) {
			
				System.out.println("Fizz");
			
			}else if((i%5) == 0){
			
				System.out.println("Buzz");
			
			}else {
			
				System.out.println(i);
			
			}
		
		}

		scan.close();
		
	}
	
}
