/*
 * 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
Recuperação (media entre 5.1 a 6.9);
 */
package Exercicio16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do aluno");
        String alunoNome = scanner.nextLine();
        System.out.println("Informe a nota da primeira prova");
        float alunoPrimeiraProva = scanner.nextFloat();
        System.out.println("Informe a nota da segunda prova");
        float alunoSegundaProva = scanner.nextFloat();
        System.out.println("Informe a nota da terceira prova");
        float alunoTerceiraProva = scanner.nextFloat();
        System.out.println("Calculando media..");
        float alunoMedia = (alunoPrimeiraProva + alunoSegundaProva + alunoTerceiraProva) / 3;

        String resultadoMedia = "";
        if (alunoMedia >= 7) {
            resultadoMedia = "Aprovado";
        } else if (alunoMedia <= 5) {
            resultadoMedia = "Reprovado";
        } else {
            resultadoMedia = "de Recuperação";
        }

        System.out.println("O Aluno " + alunoNome + " está " + resultadoMedia);

    }
}
