package exercicio01;

import java.util.Scanner;

public class Circulo {
	
public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo da area do circulo");
		System.out.println("Digite o valor do raio do circulo: ");
		float raio = sc.nextFloat();
		double area = Math.pow(raio, 2)*Math.PI;
		System.out.printf("O valor da area do triangulo é: %.2f cm²",area);
		sc.close();
	}

}