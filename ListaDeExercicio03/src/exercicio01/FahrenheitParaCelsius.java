package exercicio01;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Fahrenheit para Celsius");

        // Entrada de dados
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Cálculo da conversão
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Saída dos resultados
        System.out.println("A temperatura em Celsius é: " + String.format("%.2f", celsius) + " ºC");

        sc.close();
    }
}