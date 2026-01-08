import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar pessoa pelo nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();

                    pessoas.add(new Pessoa(nome, idade));
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Pessoas cadastradas ---");
                    for (Pessoa p : pessoas) {
                        System.out.println("Nome: " + p.getNome() + " | Idade: " + p.getIdade());
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome para busca: ");
                    String busca = scanner.nextLine();

                    boolean encontrada = false;

                    for (Pessoa p : pessoas) {
                        if (p.getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Pessoa encontrada!");
                            System.out.println("Nome: " + p.getNome());
                            System.out.println("Idade: " + p.getIdade());
                            encontrada = true;
                            break;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
