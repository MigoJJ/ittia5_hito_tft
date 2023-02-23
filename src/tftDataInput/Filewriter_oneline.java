package tftDataInput;

import java.io.FileReader;			
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter_oneline {
  public static void main(String str) {
    try {
      FileWriter writer = new FileWriter(TFTmain.udbu5,true);
      writer.write("\t"+ str +"\n");
      writer.close();
      System.out.println("String written to file.");
      Filewriter_oneline.read_write_file(null);
    } catch (IOException e) {
      System.out.println("An error occurred while writing to file.");
      e.printStackTrace();
    }
  }
    public static void read_write_file(String[] args) {
      try {
        FileReader reader = new FileReader(TFTmain.udbu5);
        FileWriter writer = new FileWriter(TFTmain.currentUsersHomeDir +"/ittia_chart/je/panse/doro/text/samsara/6OBJ");
        int c;
        while ((c = reader.read()) != -1) {
          writer.write(c);
        }

        reader.close();
        writer.close();

        System.out.println("File copied.");
      } catch (IOException e) {
        System.out.println("An error occurred while copying the file.");
        e.printStackTrace();
      }
    }
  }

