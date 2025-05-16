import org.jline.reader.*;
import org.jline.reader.impl.*;
import org.jline.terminal.*;

public class InteractiveInput {
    public static void main(String[] args) throws Exception {
        Terminal terminal = TerminalBuilder.builder().system(true).build();
        LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();
        
        String name = reader.readLine("Digite seu nome: ");
        System.out.println("Olá, " + name + "!");
    }
}
