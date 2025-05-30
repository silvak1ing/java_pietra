import javax.swing.JOptionPane;

public class telajava {
    public static void main(String[] args) throws Exception {
        String email = JOptionPane.showInputDialog("Digite seu email:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");

        try {
            if (email.contains("@") && email.contains(".")) {
                if (senha.length() >= 8) {
                    do {
                        String confirmacaoSenha = JOptionPane.showInputDialog("Confirme sua senha:");
                        if (!confirmacaoSenha.equals(senha)) {
                            JOptionPane.showMessageDialog(null, "Senhas nao conferem Tente novamente.");
                        } else {
                            break;
                        }
                    } while (true);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Senha deve ter pelo menos 8 caracteres.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "email invalido. deve conter '@' e '.'");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro: " + e.getMessage());
        }
    }
}