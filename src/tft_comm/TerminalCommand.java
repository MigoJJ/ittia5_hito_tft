package tft_comm;

import java.io.IOException;

public class TerminalCommand {
    public static void main(String[] args) {
        String command = "ls -l;pwd; sleep 15"; // replace with your desired command
       
        String command1 = "java -cp /home/migowj/tft/tftproc.jar tftDataInput.TFTmain";
         
        String[] terminal = { "gnome-terminal --geometry=80x24+200+200", "-x", "bash", "-c", command };
        String[] terminal1 = { "gnome-terminal", "-x", "bash", "-c", command1 };

        
        

        try {
            Runtime.getRuntime().exec(terminal);
            Runtime.getRuntime().exec(terminal1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
