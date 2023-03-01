package tft_comm;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ConsoleFrame2 extends JFrame {

    private JTextArea textArea;

    public ConsoleFrame2() {
        setTitle("Console Output");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Redirect standard output and error streams to the JTextArea
        PrintStream printStream = new PrintStream(new ConsoleOutputStream(textArea));
        System.setOut(printStream);
        System.setErr(printStream);
    }

    private static class ConsoleOutputStream extends OutputStream {
        private JTextArea textArea;

        public ConsoleOutputStream(JTextArea textArea) {
            this.textArea = textArea;
        }

        @Override
        public void write(int b) throws IOException {
            // Append the output to the JTextArea
            textArea.append(String.valueOf((char) b));
            // Scroll to the end of the JTextArea
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }

    public static void main(String[] args) {
        ConsoleFrame2 consoleFrame = new ConsoleFrame2();
        consoleFrame.setVisible(true);

        // Your Java program code goes here
        System.out.println("Hello, world!");
    }
}
