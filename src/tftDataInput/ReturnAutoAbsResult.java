package tftDataInput;

public class ReturnAutoAbsResult {

    public static String main(String autoabargs) {
        String returnTSH_R_Ab="";
        double TSH_R_Ab = Double.parseDouble(autoabargs); 
        if (TSH_R_Ab == 0.80) {
            returnTSH_R_Ab = addMark(TSH_R_Ab, "< ");
        }
        else if(TSH_R_Ab > 1.75) {
            returnTSH_R_Ab = addMark(TSH_R_Ab, "↑  ");
        }
        String tshrresult = ("\tAnti-TSH-R Ab : [ " + returnTSH_R_Ab +  " ] IU/L < 1.75  \n");
        return tshrresult;

    }
    public static String addMark(double amargs, String amark) {
        String tshrresult = (amark + amargs);
        return tshrresult;
    }
}
