import java.util.Scanner;
public class Ex13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int codigo;
        
        System.out.println("Digite a senha: ");
        codigo = input.nextInt();
        
        if(codigo == 1){
            System.out.print("um");        
        }
        if(codigo == 2){
            System.out.print("dois");        
        }
        if(codigo == 3){
            System.out.print("três");        
        }
        if(codigo > 3 ){
            System.out.print("Código inválido!");        
        }
        
    }
}
