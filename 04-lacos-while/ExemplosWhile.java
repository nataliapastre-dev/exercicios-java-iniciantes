import java.util.Scanner;

/**
 * Exercício: Laços de Repetição em Java
 * Conteúdo: while e do while
 * Objetivo: praticar repetição baseada em condição
 */

public class ExemplosWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===============================
        // EXEMPLO 1 - while
        // ===============================
        int contador = 1;

        System.out.println("Contagem usando while:");

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // ===============================
        // EXEMPLO 2 - do while
        // ===============================
        int numero;

        System.out.println("\nDigite números positivos (0 para sair):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
        } while (numero > 0);

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}
