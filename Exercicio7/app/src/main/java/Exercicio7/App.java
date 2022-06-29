/*
 * 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
 */
package Exercicio7;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a temperatura em Celsius");
        float celsius = scanner.nextFloat();
        float fahrenheit = ((9 * celsius + 160) / 5);
        System.out.println(celsius + "C é o equivalente a " + fahrenheit + "F");
    }
}
