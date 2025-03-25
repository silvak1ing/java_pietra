public class Voo {
    private String numero;
    private int assentosDisponiveis;
    public Voo(String numero, int assentos) {
        this.numero = numero;
        this.assentosDisponiveis = assentos;
    }
    public void reservarAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            System.out.println("Assento reservado. Assentos restantes: " + assentosDisponiveis);
        } else {
            System.out.println("Nao há assentos disponiveis para reserva.");
        }
    }
    public int verificarDisponibilidade() {
        return assentosDisponiveis;
    }
    public static void main(String[] args) {
        Voo voo = new Voo("Voo 123", 10);
        voo.reservarAssento();
        voo.reservarAssento();
        System.out.println("Assentos disponiveis: " + voo.verificarDisponibilidade());
    }
}
