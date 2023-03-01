package tftJframeConsole;

import java.util.ArrayList;

import javax.swing.*;
public class tftDataConsoleinput {

  public static void main(String[] args) {
    /* JOptionPane Java user input example */
    var name = JOptionPane.showInputDialog("What is T3 ?");
    
    
    
    
    var output = name + " is such a nice name!";
    
    var name1 = JOptionPane.showInputDialog("What is free-T4 ?");
    var output1 = name1 + " is such a nice name!";
    
    ArrayList<String>  fruits = new ArrayList<String> ();
    fruits.add(name);
    System.out.println(fruits.toString());
    fruits.add(name1);
    System.out.println(fruits.toString());
    fruits.add("kiwi");
    System.out.println(fruits.toString());
    
    
    JOptionPane.showMessageDialog(null, output);
    JOptionPane.showMessageDialog(null, output1);
    
    
    
  }
}