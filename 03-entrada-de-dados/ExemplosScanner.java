
import java.util.Scanner;

/**
 * Exercício: Entrada de dados em Java
 * Conteúdo: Scanner
 * Objetivo: ler dados digitados pelo usuário
 */

public class ExemplosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("\nOlá, " + nome + "!");
        System.out.println("Idade informada: " + idade + " anos.");

        scanner.close();
    }
}
