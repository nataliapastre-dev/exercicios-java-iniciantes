/**
 * Exercício: Laços de Repetição em Java
 * Conteúdo: for
 * Objetivo: praticar repetição de comandos
 */

public class ExemplosLacos {

    public static void main(String[] args) {

        // ===============================
        // EXEMPLO 1 - Contador simples
        // ===============================

        System.out.println("Contagem de 1 até 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // ===============================
        // EXEMPLO 2 - Números pares
        // ===============================

        System.out.println("\nNúmeros pares de 0 até 10:");

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

