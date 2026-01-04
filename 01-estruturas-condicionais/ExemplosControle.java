/**
 * Exercício: Estruturas Condicionais em Java
 * Conteúdo: if, else if, else e operadores de comparação
 */

public class ExemplosControle {

    public static void main(String[] args) {

        // ===============================
        // EXEMPLO 1 - Verificação de idade
        // ===============================

        int idade = 17;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // ===============================
        // EXEMPLO 2 - Avaliação de nota
        // ===============================

        double nota = 6.3;

        if (nota >= 7) {
            System.out.println("Situação: Aprovado.");
        } else if (nota >= 5) {
            System.out.println("Situação: Recuperação.");
        } else {
            System.out.println("Situação: Reprovado.");
        }
    }
}
