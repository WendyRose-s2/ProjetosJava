package Atividades;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
	int decimals [] = {3,6,5,1,8,9,0,2,7,4};
	System.out.println("Qual a posição que você gostaria?");
	
	int number = read.nextInt();
	
	
	int end = -1;
	
	
	for (int opcao = 0; opcao < decimals.length; opcao ++ ) {
		if ( decimals[opcao] == number ) { 
			end = opcao;
		
		}
		}
		
		if (end != -1) {
		System.out.println("O número "+number+" está na posição " +end );
		}else
	System.out.println("Número não encontrado");
	}

}