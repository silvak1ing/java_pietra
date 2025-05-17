import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.screen.*;
import com.googlecode.lanterna.input.*;

public class interacao {
    public static void main(String[] args) throws Exception {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();
        screen.setCursorPosition(null); // Oculta o cursor

        screen.clear();
        screen.putString(10, 5, "Olá, mundo interativo!", Terminal.Color.WHITE, Terminal.Color.BLACK);
        screen.refresh();

        screen.readInput(); // Espera input
        screen.stopScreen();
    }
}