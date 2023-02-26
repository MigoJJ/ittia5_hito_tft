package tftDataInput;

import java.util.ArrayList;

public class TFTmain {
    // Define constant variables for file paths and column labels
    static final String CURRENT_USERS_HOME_DIR = System.getProperty("user.home");
    static final String UDBU5 = CURRENT_USERS_HOME_DIR + "/ittia_chart/addjar_ittia5/hito/tft/tftputput";
    static String T3 = "\tT3(ug/mL)"; 
    static String T4 = "\tfree-T4(ng/dL)";
    static String TSH = "\tTSH(mIU/L)";
    static String T3R = "\t(2.0-4.4)"; 
    static String T4R = "\t(0.84-1.74)";
    static String TSHR = "\t\t(0.45-4.12)";

    // Declare other necessary variables
    static String reference2;
    static String outclinic3 ="  at GDS";;
    static String saveTime;
    static String t1, t2, t3, t4, t5, t6, t3n, t3p, t4n;
    static File_cdrw_proc fcp1 = new File_cdrw_proc();

    public static void main(String[] args) throws Exception {
        // Delete and create a new output file
        File_delete_new.main(UDBU5);
        
        // Get the current date and time
        saveTime = CurrentDateAdd_date.defineTime("d");

        // Get the input strings from the user
        ArrayList<String> result = TFT_ArrayListInput.getStrings();
        
        // Modify column labels based on user inputs
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).startsWith("p")) {
                T3 = "\tT3 (pg/mL)";
            } else if (result.get(i).startsWith("n")) {
                T3 = "\tT3 (ng/mL)";
            } else if (result.get(i).startsWith("4n")) {
                T4 = "\tfree-T4 (ng/dL)";
            } else if (result.get(i).startsWith("o")) {
                outclinic3 = "\t[ 외부 ]";
            } else {
                // Do nothing
            }
        }
        
        // Remove input markers from the result list
        result.remove("p");
        result.remove("n");
        result.remove("4n");
        result.remove("o");

        // Print the output
        Filewriter_oneline.main("Date/Time : " + saveTime);

        System.out.print("\t" + saveTime + outclinic3 +"\n");
        System.out.print(T3 + T4 + TSH + "\n");
        System.out.print(T3R + T4R + TSHR + "\n");
        System.out.print("\t" + "-----------------------------------");
    }
}
