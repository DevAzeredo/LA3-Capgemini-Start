/*
 * 20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;

 */
package Exercicio20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano = 0;
        double valor = 0;
        char resposta = 's';
        double media = 0;
        int totalCarrosAteDoisMil = 0;
        int totalCarros = 0;
        while (resposta != 'N') {
            System.out.println("Informe o ano do veiculo");
            ano = scanner.nextInt();
            System.out.println("Informe o valor veiculo");
            valor = scanner.nextFloat();

            if (ano <= 2000) {
                media = valor - (valor * 0.12);
                System.out.println("O veiculo é do ano " + ano
                        + " e está no valor de "
                        + media + " com 12% de desconto");
                totalCarrosAteDoisMil = totalCarrosAteDoisMil + 1;
            } else {
                media = valor - (valor * 0.07);
                System.out.println("O veiculo é do ano " + ano
                        + " e está no valor de "
                        + media + " com 7% de desconto");
            }
            totalCarros = totalCarros + 1;
            System.out.println("Deseja continuar? Caso não basta digitar (N) Não"
                    + ", caso sim, digite qualquer coisa :D");
            resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
        }
        System.out.println("Total de carros: " + totalCarros
                + " Total de carros até 2000: " + totalCarrosAteDoisMil);
    }
}
