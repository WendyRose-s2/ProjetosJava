package Atividades;

import java.util.Scanner;
//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.

public class JogodaAdição {

	public static void main(String[] args) {

	Scanner read=new Scanner(System.in);
	
	int n1,n2,resultado,n3;
	
	System.out.println("\n Olá, Qual é o primeiro número?");
	n1= read.nextInt();
	System.out.println("Ótimo, agora, vai somar o primeiro número com qual valor?");
	n2= read.nextInt();
	System.out.println("E de quanto vai ser o resultado?");
	n3= read.nextInt();
	
	resultado = n1+n2;
	
	if(n3<resultado) {
	System.out.println("Sinto muito, você errou, o resultado é "+resultado+". O valor de "+n3+" é menor!! :( ");
	}else if(n3>resultado) {
	System.out.println("Sinto muito, você errou, o resultado é "+resultado+". O valor de "+n3+" é maior!! :( ");
	}else if (resultado == n3) {
	System.out.println("Pisou demais!!! Você acertou!! O resultado é "+resultado);	
	}
	}
	
	
	}




	


