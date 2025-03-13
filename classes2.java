class Pessoa{
    String nome;
    int idade;
    double altura;
    double peso;
    String curso;
    void apresentar(){
        System.out.println("Nome: " + nome+ ",Idade: " + idade + ",Altura: " + altura + ",Peso: " + peso);
    }
    void mostrarcurso(){
        System.out.println(nome+" está cursando " + curso);
    }
}
public class classes2 {
    public static void main(String[] args) throws Exception {
    Pessoa aluno = new Pessoa();
    aluno.nome = "João";
    aluno.idade = 20;
    aluno.altura = 1.80;
    aluno.peso = 70.0;
    aluno.curso = "Engenharia";
    aluno.apresentar();
    aluno.mostrarcurso();
}
}