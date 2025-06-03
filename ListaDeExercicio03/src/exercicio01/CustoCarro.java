package exercicio01;

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo do custo final de um carro");

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = sc.nextDouble();

        
        double percentualDistribuidor = 28;
        double percentualImpostos = 45;

        
        double valorDistribuidor = custoFabrica * (percentualDistribuidor / 100);
        double valorImpostos = custoFabrica * (percentualImpostos / 100);

        
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

       
        System.out.println("Resumo do custo:");
        System.out.println("Custo de fábrica: R$ " + String.format("%.2f", custoFabrica));
        System.out.println("Valor do distribuidor (28%): R$ " + String.format("%.2f", valorDistribuidor));
        System.out.println("Valor dos impostos (45%): R$ " + String.format("%.2f", valorImpostos));
        System.out.println("Custo final ao consumidor: R$ " + String.format("%.2f", custoFinal));

        sc.close();
    }
}
