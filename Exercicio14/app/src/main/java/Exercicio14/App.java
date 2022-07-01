/*
 * 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

 */
package Exercicio14;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Informe mais um numero inteiro");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro numero que você informou é maior que "
                    + "o segundo");
        } else if (primeiroNumero == segundoNumero) {
            System.out.println("Os numeros são iguais!!");
        } else {
            System.out.println("O segundo numero que você informou é maior que o"
                    + " primeiro");
        }

    }
}
