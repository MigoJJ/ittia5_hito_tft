package tftDataInput;

import java.util.ArrayList;	
import javax.swing.JOptionPane;
import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TFT_ArrayListInput  extends JFrame{
	
	public static ArrayList<String> getStrings() {
		ArrayList<String> inputs = new ArrayList<>();
			try {
			   while (true) {
			        InputDialogInFrame frame = new InputDialogInFrame();
	   
				   
				   
				    var input = JOptionPane.showInputDialog(frame,"What is TFT results ?\n"
				    		+ "T3    free-T4    TSH ?\n\n"
				    		+ "\tp   :   T3 (pg/dL) \n"
				    		+ "\tn   :   T3 (ng/dL) \n"
				    		+ "\t4n   :  free-T3 (ng/dL) "
//				    		, 123456
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
			return inputs;
	}
}

