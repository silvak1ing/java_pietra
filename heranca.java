import java.util.Scanner;

public class heranca {
    String nome;
    String rg;
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
    }
    class estudante extends heranca {
        String curso;

        public void mostrar() {
            super.mostrar();
            System.out.println(nome + " está cursando o curso: " + curso);
        }
    }
    class professor extends heranca {
        String departamento;

        public void mostrar() {
            super.mostrar();
            System.out.println(nome + " é professor do departamento: " + departamento);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        heranca outer = new heranca(); 

        estudante[] est = new estudante[2];
        professor[] prof = new professor[2];

        System.out.println("---Cadastro de Estudantes---");
        for (int i = 0; i < est.length; i++) {
            est[i] = outer.new estudante(); 
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            est[i].nome = sc.nextLine();
            System.out.println("Digite o curso do aluno " + (i + 1) + ":");
            est[i].curso = sc.nextLine();
            System.out.println("Digite o RG do aluno " + (i + 1) + ":");
            est[i].rg = sc.nextLine();
        }
        System.out.println("---Cadastro de Professores---");
        for (int i = 0; i < prof.length; i++) {
            prof[i] = outer.new professor();
            System.out.println("Digite o nome do professor " + (i + 1) + ":");
            prof[i].nome = sc.nextLine();
            System.out.println("Digite o departamento do professor " + (i + 1) + ":");
            prof[i].departamento = sc.nextLine();
            System.out.println("Digite o RG do professor " + (i + 1) + ":");
            prof[i].rg = sc.nextLine();
        }
        System.out.println("\n---Dados dos Estudantes---");
        for (int i = 0; i < est.length; i++) {
            est[i].mostrar();
        }
        System.out.println("\n---Dados dos Professores---");
        for (int i = 0; i < prof.length; i++) {
            prof[i].mostrar();
        }
        sc.close();
        System.out.println("\n The End of the program.");
    }
}

