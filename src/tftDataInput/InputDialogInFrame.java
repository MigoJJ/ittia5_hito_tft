package tftDataInput;


import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputDialogInFrame extends JFrame{

    public InputDialogInFrame() {

        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Input Dialog in Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);

    }

    private void closeIt(){

        this.getContentPane().setVisible(false);
        this.dispose();

    }

    public static void main(String[] args){

        InputDialogInFrame frame = new InputDialogInFrame();
        

		ArrayList<String> inputs = new ArrayList<>();
		try {
		   while (true) {
			    var input = JOptionPane.showInputDialog(frame,"What is TFT results ?\n"
			    		+ "T3    free-T4    TSH ?\n\n"
			    		+ "\tp   :   T3 (pg/dL) \n"
			    		+ "\tn   :   T3 (ng/dL) \n"
			    		+ "\t4n   :  free-T3 (ng/dL) "
//			    		, 123456
			    		);
			     if (input.isEmpty()) {
						break;
				 }
				 inputs.add(input);
		   }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		scan.close();
      
//        return inputs;
		System.out.println(" inputs   :   " + inputs);

    }

}