package exercicio01;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo do Salário Final do Vendedor");

     
        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor da comissão por carro vendido: R$ ");
        double comissaoPorCarro = sc.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = sc.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double totalVendas = sc.nextDouble();

        
        double comissaoTotal = comissaoPorCarro * carrosVendidos;
        double bonusVendas = totalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotal + bonusVendas;

        
        System.out.println("===== Resumo do Salário =====");
        System.out.println("Salário fixo: R$ " + String.format("%.2f", salarioFixo));
        System.out.println("Comissão por carros vendidos (" + carrosVendidos + " carros): R$ " + String.format("%.2f", comissaoTotal));
        System.out.println("Bônus de 5% sobre vendas: R$ " + String.format("%.2f", bonusVendas));
        System.out.println("Salário final: R$ " + String.format("%.2f", salarioFinal));

        sc.close();
    }
}
