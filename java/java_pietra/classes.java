class Carro{
    String marca;
    String modelo;
    String cor;
    int ano;

    void exibirinfor(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);

    }
}
public class classes {
    public static void main(String[] args){
    Carro meuCarro = new Carro();

    meuCarro.marca = "Fiat";
    meuCarro.modelo = "Fiorino";
    meuCarro.cor = "Azul";
    meuCarro.ano = 2010;
    meuCarro.exibirinfor();
}
}

