package tft_comm;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InputDialogPanel {

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setSize(new Dimension(550, 120));
        panel.setLayout(null);

        JLabel label = new JLabel("It's your choice! :)");
        label.setForeground(new Color(255, 255, 0));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(0, 0, 250, 128);
        panel.add(label);

        UIManager.put("OptionPane.minimumSize",new Dimension(540, 240));

        Object[] options = {16, "No", 11.2, true};
        Object l = JOptionPane.showInputDialog(null, panel, 
                "Mix & Match", JOptionPane.PLAIN_MESSAGE, null, options, options[3]);

        if(l instanceof Integer){
            System.out.println("You picked an Integer!");
        }else if(l instanceof String){
            System.out.println("You picked a String!");
        }else if(l instanceof Double){
            System.out.println("You picked a Double!");
        }else if(l instanceof Boolean){
            System.out.println("You picked a Boolean!");
        }

    }

}