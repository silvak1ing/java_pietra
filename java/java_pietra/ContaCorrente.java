public class ContaCorrente {
    private String titular;
    private double saldo;

    // Constructor
    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: R$ " + valor);
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + valor);
        }
    }
    public void aplicarTaxaMensal() {
        saldo -= 12.00;
        System.out.println("Taxa mensal de R$ 12,00 aplicada.");
    }
    public double getSaldo() {
        return saldo;
    }
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Joao");
        conta.depositar(100.0);
        conta.sacar(30.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
        conta.aplicarTaxaMensal();
        System.out.println("Saldo após taxa: R$ " + conta.getSaldo());
    }
}
