/*
 * 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a 
possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados;
 */
package Exercicio6;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da variavel A");
        String variavelA = scanner.nextLine();

        System.out.println("Agora, insira o valor da variavel B");
        String variavelB = scanner.nextLine();

        String variavelAuxiliar = variavelA;
        variavelA = variavelB;
        variavelB = variavelAuxiliar;
        
        System.out.println("Invertendo as variaveis..");
        System.out.println("Variavel A:" + variavelA);
        System.out.println("Variavel B:" + variavelB);

    }
}
