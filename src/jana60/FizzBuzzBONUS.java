package jana60;

import java.util.Scanner;

public class FizzBuzzBONUS {
	
	public static void main(String[] args) {
		//Dichiarazioni variabili di resto delle divisioni, del numero massimo da raggiungere, e dello scanner con cui prendere le informazioni in input
		int numeroMassimo=0, r3, r5;
		Scanner scan = new Scanner(System.in);
		//Richiesta e inizializzazione del numero massimo da raggiungere
		System.out.print("Inserisci un numero tra 1 e 200, che andrà a definire il numero massimo da raggiungere: ");
		numeroMassimo = scan.nextInt();
		//Ciclo di controllo del numero appena inserito
		while((numeroMassimo<1) || (numeroMassimo>200)){
			
			System.out.print("Il numero deve essere compreso tra 1 e 200! Riprova: ");
			numeroMassimo = scan.nextInt();
		
		}
		//Ciclo for per il gioco FizzBuzz
		for(int i=1; i<=numeroMassimo; i++) {
			//Dichiarazione e inizialzzazione a stringa vuota del risultato da stampare
			String risultato="";
			//Calcolo resto per 3 e per 5
			r3 = i % 3;
			r5 = i % 5;
			//Assegnazione del valore al risultato
			if(r3 == 0) 
				risultato += "Fizz";
			
			if(r5 == 0)
				risultato += "Buzz";
				
			if((r3 != 0) && (r5 != 0))
				risultato += i;
			//Stampa risultato
			System.out.println(risultato);
		
		}
		//Chiusura dello scanner
		scan.close();
		
	}
	
}
