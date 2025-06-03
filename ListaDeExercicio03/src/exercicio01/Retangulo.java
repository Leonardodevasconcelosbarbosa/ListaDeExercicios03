package exercicio01;

import java.util.Scanner;

public class Retangulo {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo da area do retangulo");
		System.out.println("Digite o valor da base do retangulo: ");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da aultura do retangulo:");
		float altura = sc.nextFloat();
		float area = base*altura;
		System.out.println("O valor da area do retangulo é: "+ area + "cm²");
		sc.close();
	}

}