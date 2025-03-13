class Animal{
    String raca;
    String tipo;
    String cor;
    String especie;
    int idade;
    String som;

    void exibir(){
        System.out.println("Especie: "+especie+"Tipo do animal "+tipo+" Raca:"+raca+" Cor:"+cor+" Idade:"+idade+" Som:"+som);
    }
    void fazerSom(){
        System.out.println("O "+tipo+" "+som);
    }
}
public class classe3 {
    public static void main(String[] args){
        Animal meupet = new Animal();
        meupet.raca = "Poodle";
        meupet.tipo = "Cachorro";
        meupet.cor = "Branco";
        meupet.especie = "Mamifero";
        meupet.idade = 3;
        meupet.som = "Ladrar";
        meupet.exibir();
        meupet.fazerSom();
    }
}
