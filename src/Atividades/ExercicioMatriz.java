package Atividades;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		

		Scanner read = new Scanner (System.in);
		
		int [][] tabela = new int [3] [3];
		int somaprimaria = 0, somasegundaria = 0, x, y;
		
		for(x=0;x < 3;x++) {
			for (y=0;y < 3; y++) {
				System.out.println("Coloque um número:");
				tabela [x][y] = read.nextInt();
				if ( x == y ) {
					System.out.println("Esse número está na linha primaria:" +tabela[x][y]);
				    somaprimaria += tabela[x][y];
				}
				    if ( x + y == 2) {    
				    	System.out.println("Esse número está na linha segundaria:" +tabela[x][y]);
					    somasegundaria += tabela[x][y];
				}
			}
		}
		
		System.out.println("Soma da tabela primaria: "+somaprimaria);
		System.out.println("Soma da tabela segundária: "+somasegundaria);
	}
}
