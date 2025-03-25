public class Cinema {
    private int capacidade;
    private int ingressosVendidos;
    public Cinema(int capacidade) {
        this.capacidade = capacidade;
        this.ingressosVendidos = 0;
    }
    public void venderIngresso(int quantidade) {
        if (ingressosVendidos + quantidade <= capacidade) {
            ingressosVendidos += quantidade;
            System.out.println(quantidade + " ingressos vendidos.");
        } else {
            System.out.println("Nao ha vagas suficientes para vender " + quantidade + " ingressos.");
        }
    }
    public void verificarDisponibilidade() {
        int disponibilidade = capacidade - ingressosVendidos;
        System.out.println("Ingressos disponiveis: " + disponibilidade);
    }
    public static void main(String[] args) {
        Cinema cinema = new Cinema(50);
        cinema.venderIngresso(20);
        cinema.verificarDisponibilidade();
        cinema.venderIngresso(35);
        cinema.verificarDisponibilidade();
    }
}
