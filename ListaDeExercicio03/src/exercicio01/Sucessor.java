package exercicio01;

import java.util.Scanner;

public class Sucessor {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa antecessor");
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		int sucessor = valor + 1;
		System.out.println("O valor do numero digitado é: "+ sucessor);
		sc.close();
	}
}
