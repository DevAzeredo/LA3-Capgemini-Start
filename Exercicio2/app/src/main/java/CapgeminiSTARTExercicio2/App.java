/*
 * 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
dos dois números lidos;

 */
package CapgeminiSTARTExercicio2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primerio número");
        float primeiroNumero = scanner.nextFloat();
        System.out.println("Informe o segundo número");
        float segundoNumero = scanner.nextFloat();

        System.out.println("Calculando...");
        float soma = primeiroNumero + segundoNumero;
        float divisao = primeiroNumero / segundoNumero;
        float subtracao = primeiroNumero - segundoNumero;
        float multiplicacao = primeiroNumero * segundoNumero;

        System.out.println("Feito! Vamos aos resultados.");

        System.out.println("o Resultado da soma: " + soma);
        System.out.println("o Resultado da divisao: " + divisao);
        System.out.println("o Resultado da subtracao: " + subtracao);
        System.out.println("o Resultado da multiplicacao: " + multiplicacao);

    }
}
