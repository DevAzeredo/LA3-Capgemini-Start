/*
 * 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
total percorrida pelo automóvel e o total de combustível gasto;
 */
package Exercicio3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distância percorrida em Km");
        float distanciaPercorrida = scanner.nextFloat();

        System.out.println("Informe o total de combustível gasto em Litros");
        float combustivelGasto = scanner.nextFloat();

        System.out.println("Calculando consumo médio...");
        float consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("O consumo médio é: " + consumoMedio + "Km/L");

    }
}
