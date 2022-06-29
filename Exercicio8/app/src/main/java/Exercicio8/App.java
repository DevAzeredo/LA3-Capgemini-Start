/*
 * 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponíveis com o usuário;
 */
package Exercicio8;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a cotação do dolar");
        BigDecimal valorCotacao = scanner.nextBigDecimal();

        System.out.println("Informe a quantidade de dolares que você possui");
        BigDecimal qtdDolarUsuario = scanner.nextBigDecimal();

        BigDecimal valorReais = valorCotacao.multiply(qtdDolarUsuario);
        System.out.println("Valor em reais: " + valorReais);

    }
}
