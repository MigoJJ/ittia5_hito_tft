package tftDataInput;

import java.util.ArrayList;

public class TFTmain {
    // Define constant variables for file paths and column labels
    static final String CURRENT_USERS_HOME_DIR = System.getProperty("user.home");
    static final String UDBU5 = CURRENT_USERS_HOME_DIR + "/ittia_chart/addjar_ittia5/hito/tft/tftoutput";
    static String T3 = "\tT3(ng/mL)"; 
    static String T4 = "\tfree-T4(ng/L)";
    static String TSH = "\tTSH(mIU/L)";
    static String T3R = "\t(0.9-2.5)"; 
    static String T4R = "\t(10.6-19.4)";
    static String TSHR = "\t(0.25-5.00)";

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
                T3 = "\tT3 (pg/dL)";
                T3R = "\t(0.60-1.81)"; 

            } else if (result.get(i).startsWith("n")) {
                T3 = "\tT3 (ng/dL)";
                T3R = "\t(0.60-1.81)"; 

            } else if (result.get(i).startsWith("4n")) {
                T4 = "\tfree-T4 (ng/dL)";
                T4R = "\t(0.60-1.81)"; 

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
        System.out.print("\t" + "------------------------------------------\n");
        System.out.print("\t" + result.get(0) + "\t\t" + result.get(1) + "\t\t" + result.get(2) + "\n");

        // Print the TFT Auto abtiboies output
        if(result.size() > 3){ 
        System.out.print("\t" + result.get(3)+"\n");
        System.out.print("\t" + result.get(4)+"\n");
        System.out.print("\t" + result.get(5)+"\n");
        System.out.print(ReturnAutoAbsResult.main(result.get(3)));

        }
    }
}