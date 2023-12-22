package Atividades;

import java.util.Scanner;

public class WhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner read = new Scanner (System.in);
		
		int total = 0, numero =0 ;
		
		
		
		do {
			
			System.out.println("Calculadora só para números positivos.");
			System.out.println("Coloque um número ou digite 0 para terminar:");
			numero= read.nextInt();
			if  (numero >= 1 ){
			total += numero;
			}	
				
			
			
			
				
		}while (numero != 0 );
			System.out.println("A soma total dos números é:" + total);
	}

}
