import java.util.Scanner;
public class Pessoa {
    String nome;
    int idade;
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    class Funcionario extends Pessoa{
        int salario;
    }
    class Aluno extends Pessoa{
        int nota;
    }
    public static void main (String[]args)throws Exception{
        Scanner sc = new Scanner(System.in);
        Pessoa outer = new Pessoa();
        Funcionario funcionario = outer.new Funcionario();
        Aluno aluno = outer.new Aluno();
        System.out.println("Nome do funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Idade do funcionario:");
        funcionario.idade = sc.nextInt();
        System.out.println("Salario do funcionario:");
        funcionario.salario = sc.nextInt();
        System.out.println("Nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Idade do aluno:");
        aluno.idade = sc.nextInt();
        System.out.println("Nota do aluno:");
        aluno.nota = sc.nextInt();
        System.out.println("Dados do funcionario:");
        funcionario.mostrar();
        System.out.println("Dados do aluno:");
        aluno.mostrar();
        if (funcionario.idade > aluno.idade) {
            System.out.println("" + funcionario.nome + " é Funcionario");
        } else if (funcionario.idade < aluno.idade) {
            System.out.println(aluno.nome + " é Aluno");
        }
        }
    }
