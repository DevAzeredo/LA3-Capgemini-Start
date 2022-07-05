/*
 * 19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;

 */
package Exercicio19;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        char sexo = '0';
        int homens = 0;
        int mulheres = 0;
        boolean sexoValido = false;
        for (int i = 0; i < 56; i++) {
            System.out.println("Informe o nome" + i);

            nome = scanner.nextLine();

            while (!sexoValido) {
                System.out.println("Informe o sexo M ou F");
                sexo = scanner.next().charAt(0);
                // Ler o lixo que o scanner deixa
                scanner.nextLine();
                sexoValido = (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f');
                if (sexoValido) {
                    if (sexo == 'M' || sexo == 'm') {
                        homens += 1;
                    } else {
                        mulheres += 1;
                    }
                } else {
                    System.out.println("Você não informou um sexo valido.");
                }
            }
            sexoValido = false;
            System.out.println(nome + " é do sexo " + sexo);
            nome = "";
        }
        System.out.println("Total de homens " + homens
                + ", total de mulheres " + mulheres);
    }
}
