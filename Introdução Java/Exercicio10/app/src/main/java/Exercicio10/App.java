/*
 * 10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
package Exercicio10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da compra");
        float valorCompra = scanner.nextFloat();
        float valorParcelas = valorCompra / 5;
        System.out.println("Valor total da compra:  " + valorCompra
                + " valor das prestações: " + valorParcelas);

    }
}
