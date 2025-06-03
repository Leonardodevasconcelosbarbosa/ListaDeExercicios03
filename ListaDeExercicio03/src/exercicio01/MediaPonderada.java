package exercicio01;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo da Média Ponderada");

        // Entrada das notas
        System.out.print("Digite a primeira nota (peso 2): ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota (peso 3): ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota (peso 5): ");
        double n3 = sc.nextDouble();

        // Cálculo da média ponderada
        double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        // Saída do resultado
        System.out.println("\nA média final do aluno é: " + String.format("%.2f", mediaFinal));

        sc.close();
    }
}