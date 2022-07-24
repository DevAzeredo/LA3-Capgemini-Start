/*
 * 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package Exercicio13;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numeroInformado = scanner.nextDouble();
        if (numeroInformado > 10) {
            System.out.println("Uhul o número é maior que 10!!!!!!");
        } else {
            System.out.println("Uhul é igual ou menor que 10 :D");
        }

    }
}
