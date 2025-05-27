// import java.util.Scanner;


// public class exemplotry {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Digite a senha (minimo 6 caracteres):");
//         String senha = sc.nextLine();

//         try {
//             if (senha.length() < 6) {
//                 throw new Exception("Senha muito curta");
//             }
//             System.out.println("aceito essa senha: " + senha);
//         } catch (Exception e) {
//             System.out.println("tente novamente: " + e.getMessage());
//         } finally {
//             sc.close();
//         }
//     }
// }

import java.util.Scanner;


// public class exemplotry {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Digite sua idade: ");
//         int idade = sc.nextInt();
//         try{
//             if (idade < 18) {
//                 throw new Exception("Voce ainda nao pode dirigir");
                
//             }
//             System.out.println("Voce pode dirigir");
//         }
//         catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         } finally {
//             sc.close();
//         }
//     }
// }


public class exemplotry {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu CPF (apenas numeros):");
        String cpf = sc.nextLine();
        try {
            long cpfNumber = Long.parseLong(cpf);
            // Verifica se o CPF contém apenas dígitos numéricos
            if (cpf.length() != 11) {
                throw new Exception("CPF Invalido, deve conter 11 digitos");          
            }
            System.out.println("CPF aceito: " + cpf);
        }
        catch (NumberFormatException e) {

            System.out.println("Erro: O CPF DEVE CONTER APENAS NUMEROS " + e.getMessage());
        }catch (Exception e2) {
            System.out.println("Erro: " + e2.getMessage());
        } finally {
            sc.close();
        }
    }
}