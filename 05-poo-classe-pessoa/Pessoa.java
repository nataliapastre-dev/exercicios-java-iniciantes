public class Pessoa {

    // Atributos (características)
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Construtor padrão
    public Pessoa() {
        this.nome = "Natália";
        this.idade = 34;
        this.altura = 1.61;
        this.peso = 76;
    }

    // ===== GETTERS E SETTERS =====

    // Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    // Idade
    public void setIdade(int idade) {
        if (idade > 0) { // validação básica
            this.idade = idade;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    // Altura
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return this.altura;
    }

    // Peso
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getPeso() {
        return this.peso;
    }
}
