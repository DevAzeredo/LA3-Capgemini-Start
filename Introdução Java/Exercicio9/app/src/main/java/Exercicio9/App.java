/*
 * 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
package Exercicio9;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor depositado.");

        BigDecimal valorDepositado = scanner.nextBigDecimal();
        BigDecimal valorJuros = new BigDecimal(0.07);
        BigDecimal valorDepositadoComJuros = valorDepositado.add(valorJuros.multiply(valorDepositado));

        System.out.println("Valor depositado após 1 mes: " + valorDepositadoComJuros);

    }
}
