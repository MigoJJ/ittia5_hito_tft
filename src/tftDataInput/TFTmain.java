package tftDataInput;

import java.util.ArrayList;

public class TFTmain {
	static final String currentUsersHomeDir = System.getProperty("user.home");
	static final String udbu5 =currentUsersHomeDir + "/ittia_chart/addjar_ittia5/hito/tft/tftputput";
	static File_cdrw_proc fcp1 = new File_cdrw_proc();
	static String T3 = "\tT3(ug/mL)"; 
	static String T4 = "\tfree-T4(ng/dL)";
	static String TSH = "\tTSH(mIU/L)";
	static String T3r = "\t(2.0-4.4)"; 
	static String T4r = "\t(0.84-1.74)";
	static String TSHr = "\t\t(0.45-4.12)";
	
		
	
	static String reference2,outclinic3,saveTime;
	static String t1,t2,t3,t4,t5,t6,t3n,t3p,t4n;
  
	public static void main(String[] args) throws Exception {
	  File_delete_new.main(udbu5);
	  saveTime = CurrentDateAdd_date.defineTime("d");
	  ArrayList<String> result = TFT_ArrayListInput.getStrings();
//	  System.out.println("Inputs: " + result);
	    for (int i = 0; i < result.size(); i++) {
	    	 	
	    	if (result.get(i).startsWith("p")) {
	    		T3 = "\tT3 (pg/mL)";
			}else if (result.get(i).startsWith("n")) {
	    		T3 = "\tT3 (ng/mL)";
						
			}else if (result.get(i).startsWith("4n")) {
	    		T4 = "\tfree-T4 (ng/dL)";

			}else if (result.get(i).startsWith("o")) {
				outclinic3 = "\t[ 외부 ]";
					
			}else {
			}
	    } 
        result.remove("p");
        result.remove("n");
        result.remove("4n");
        result.remove("o");
        
	    System.out.println("Date/Time : " + saveTime);
	    Filewriter_oneline.main("Date/Time : " + saveTime);
	    for (String s : result) {
        System.out.println(s);
	    }
        System.out.print(T3 +T4 + TSH + outclinic3 +"\n");
        System.out.print(T3r +T4r + TSHr + "\n");

	}
}
