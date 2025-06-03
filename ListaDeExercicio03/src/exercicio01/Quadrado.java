package exercicio01;

import java.util.Scanner;

public class Quadrado {

public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo da area do Quadrado");
		System.out.println("Digite o valor da base do triangulo: ");
		float lado = sc.nextFloat();
		
		float area = (float) Math.pow(lado, 2);
		System.out.println("A Area do quadrado é: "+area);
		sc.close();
	}

}