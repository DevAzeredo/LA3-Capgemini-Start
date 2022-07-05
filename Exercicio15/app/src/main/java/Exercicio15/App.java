/*
 * 15. Façaa um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */
package Exercicio15;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero");
        double numero = scanner.nextDouble();
        if (numero > 99 && numero < 201) {
            System.out.println("O numero está entre 100 e 200");
        } else {
            System.out.println("O numero não está entre 100 e 200");
        }
    }
}
