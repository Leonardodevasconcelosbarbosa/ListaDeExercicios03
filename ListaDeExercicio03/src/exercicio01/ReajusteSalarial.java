package exercicio01;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Reajuste Salarial");

        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = sc.nextDouble();

        System.out.print("Digite o percentual de reajuste (%): ");
        double percentual = sc.nextDouble();

      
        double reajuste = salarioAtual * (percentual / 100);

        
        double novoSalario = salarioAtual + reajuste;

        System.out.println("Valor do reajuste: R$ " + String.format("%.2f", reajuste));
        System.out.println("Novo salário: R$ " + String.format("%.2f", novoSalario));

        sc.close();
    }
}