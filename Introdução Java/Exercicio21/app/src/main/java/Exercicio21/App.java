/*
 * 21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package Exercicio21;

import java.util.Scanner;

public class App {

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static boolean IsAptoServicoMilitar(int sexo, int idade, int saude) {
        int pontuacao = 0;
        switch (sexo) {
            case 1:
                pontuacao = 1;
                break;
            case 2:
                pontuacao = 2;
                break;
            default:
                pontuacao = 0;
                break;
        }
        if (idade <= 25) {
            pontuacao = pontuacao + 3;
        } else {
            pontuacao = pontuacao + 2;
        }
        pontuacao = pontuacao + (saude / 2);
        if (pontuacao <= 6) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int sexo;
        int idade;
        int saude;
        int totalAptos = 0;
        System.out.println("Deseja informar quantas pessoas?");
        int qtdPessoas = scanner.nextInt();
        clearBuffer(scanner);
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Informe o nome da pessoa nº" + i);
            nome = scanner.nextLine();

            System.out.println("Informe o sexo da pessoa nº" + i
                    + "Sendo 1 para Feminino e 2 para Masculino");
            sexo = scanner.nextInt();
            clearBuffer(scanner);

            System.out.println("Informe o idade da pessoa nº" + i);
            idade = scanner.nextInt();
            clearBuffer(scanner);

            System.out.println("Informe a saude da pessoa nº" + i
                    + " com notas de 0 a 10, sendo 0 muito ruim e 10 Otimo");
            saude = scanner.nextInt();
            clearBuffer(scanner);

            if (IsAptoServicoMilitar(sexo, idade, saude)) {
                System.out.println(nome + " é apto a cumprir o Servico Militar Obrigatorio" + i);
                totalAptos = totalAptos + 1;
            } else {
                System.out.println(nome + " não é apto a cumprir o Servico Militar Obrigatorio" + i);
            }
        }
        System.out.println("Total de candidatos " + qtdPessoas);
        System.out.println("Total de candidatos aptos " + totalAptos);
    }
}
