/*
 * 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
(inclusive);
 */
package Exercicio17;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayNumeros[] = new int[80];
        int numeroIntervalo = 0;

        for (int i = 0; i < 80; i++) {
            System.out.println("Insira o " + (i + 1) + "º numero ");
            arrayNumeros[i] = scanner.nextInt();

            if (arrayNumeros[i] >= 10 && arrayNumeros[i] <= 150) {
                numeroIntervalo = numeroIntervalo + 1;
            }
        }

        System.out.println("Você informou " + numeroIntervalo
                + " numeros no intervalo entre 10(inclusive) e 150(inclusive)");
    }
}
