/*
 * 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No final informar o nome do aluno e a sua média (aritmética);
 */
package Exercicio5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Aluno");
        String nomeAluno = scanner.nextLine();

        System.out.println("Informe a nota da primeira prova");
        float primeiraProva = scanner.nextFloat();

        System.out.println("Informe a nota da segunda prova");
        float segundaProva = scanner.nextFloat();

        System.out.println("Informe a nota da terceira prova");
        float terceiraProva = scanner.nextFloat();

        float media = (primeiraProva + segundaProva + terceiraProva) / 3;

        System.out.println("O Aluno " + nomeAluno + " teve uma média de " + media);

    }
}
