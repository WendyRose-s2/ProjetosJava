package Atividades;

import java.util.Scanner;

public class SimulaçãoSimplesContaBanc {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		float valortotal,quantidade;
		int op;
		valortotal = (float) 200;
		System.out.println("Bem vinda ao banco Hello Kitty, Miau!");
		System.out.println("Precione o 1 para depositar!");
		System.out.println("Precione o 2 para retirar!");
		System.out.println("Precione 3 para ver o saldo! ");
		op = leia.nextInt();
		
		
		switch(op) {
		
		case 1:
		System.out.println("Qual é o valor que você deseja depositar?");
		quantidade = leia.nextFloat();
			
		System.out.println (valortotal + quantidade);
		System.out.println ("Obrigada pelo saque! Agora você tem em sua conta:"+(valortotal+quantidade));
		break;
		case 2:
		System.out.println("Qual é o valor que você deseja?");
		quantidade = leia.nextFloat();
			
		if (valortotal - quantidade <= 0)
		System.out.println("Saldo Insuficiente");
		else if (valortotal - quantidade >= 0);
		System.out.println("Saque efetuado. Valor disponivel na conta:" +(valortotal-quantidade));
		break;
		case 3:
		System.out.println("Seu saldo atual é de:"+valortotal);
		break;
		
		}
	}

}
