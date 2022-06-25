/*
 * 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 */
package CapgemniSTARTExercicio1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        float PrimeiroNumero = leitor.nextFloat();
        System.out.println("Agora o segundo numero");
        float SegundoNumero = leitor.nextFloat();
        float soma = PrimeiroNumero + SegundoNumero;
        System.out.print("Resultado da soma: " + soma);
    }
}
