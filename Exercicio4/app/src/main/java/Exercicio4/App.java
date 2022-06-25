/*
 * 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
package Exercicio4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor");
        String nome = scanner.nextLine();

        System.out.println("Informe o salário do vendedor");
        float salario = scanner.nextFloat();

        System.out.println("Informe o total de vendas efetuadas no mês do vendedor");
        float vendas = scanner.nextFloat();
        
        System.out.println("Nome: " + nome);
        System.out.println("Salário fixo: " + salario);
        System.out.println("Salário final: " + (salario + (vendas * 0.15)));

    }
}
