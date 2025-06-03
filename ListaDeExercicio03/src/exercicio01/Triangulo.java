package exercicio01;

import java.util.Scanner;

public class Triangulo {
	
public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo da area do triangulo");
		System.out.println("Digite o valor da base do triangulo: ");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da aultura do triangulo:");
		float altura = sc.nextFloat();
		float area = base*altura/2;
		System.out.println("O valor da area do triangulo é: "+ area + "cm²");
		sc.close();
	}

}