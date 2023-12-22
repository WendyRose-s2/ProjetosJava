package Atividades;

import java.util.Scanner;

public class WhileExercicio {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int idade,maior = 0,menor = 0;
		
			
			
			while(true) {	
				System.out.println("coloque a idade da pessoa:");
				idade = read.nextInt();
				System.out.println("para terminar, digite 0.");
				if (idade <= 0) {
					break;	
					}
				
				if (idade <21) {
				menor++ ;
				}
				
				else if (idade > 50){
				maior++ ;
				}
				
			
	}
			System.out.println("Pessoas menores de 21:"+menor);
			System.out.println("Pessoas maiores de 50:"+maior);
    }
}
