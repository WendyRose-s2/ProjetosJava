package Atividades;

import java.util.Scanner;

public class ContadorPareImpar {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
	int number,par=0,impar=0,contador;
	System.out.println("Bem vindo!");
	
	for (contador = 1; contador<=10; contador ++) {
	System.out.println("Coloque um número:");
	number=read.nextInt();
	if  (number %2 == 0 ) {
		par++;
	}
	
	else {
		impar++;
	}
	
	}
	System.out.println("Números pares"+par);
	System.out.println("Números impares"+impar);
	
	}
	

}
