package tftDataInput;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_delete_new {
  public static void main(String fhomeDir) {
    try {
    	File file = new File(fhomeDir);
    	file.delete();
    	
      FileWriter writer = new FileWriter(fhomeDir);
      writer.write("");
      writer.close();
      System.out.println("File created.");
    } catch (IOException e) {
      System.out.println("An error occurred while creating the file.");
      e.printStackTrace();
    }
  }
}
