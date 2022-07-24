/*
 * 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
package Exercicio11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de custo");
        float precoCusto = scanner.nextFloat();
        System.out.println("Qual será o acrescimo em percentual?");
        float valorAcrescimo = scanner.nextFloat();
        precoCusto = precoCusto + (precoCusto * (valorAcrescimo / 100));
        System.out.println("O preço de venda será: " + precoCusto);

    }
}
