public class ContaBancaria {

    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getter
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
