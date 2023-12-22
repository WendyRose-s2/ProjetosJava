package Atividades;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Set<Integer> valoresSet = new HashSet<>();
		        valoresSet.add(1);
		        valoresSet.add(2);
		        valoresSet.add(3);
		        valoresSet.add(4);
		        valoresSet.add(5);
		        valoresSet.add(6);
		        valoresSet.add(7);
		        valoresSet.add(8);
		        valoresSet.add(9);
		        valoresSet.add(10);

		        Scanner scanner = new Scanner(System.in);


		        for (int i = 0; i > -1; i++) {
		            System.out.print("Digite um número inteiro: ");
		            int numero = scanner.nextInt();

		         
		            if (valoresSet.contains(numero)) {
		                System.out.println("Número " + numero + " Encontrado!");
		            } else {
		                System.out.println("O número " + numero + " não foi encontrado!");
		            }
		        }
	     }
	    }
	


