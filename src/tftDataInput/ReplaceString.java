package tftDataInput;

import java.util.ArrayList;

public class ReplaceString {
    public static void main(String[] args) {
        // Create an array list of strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("The quick brown fox jumps over the lazy dog.");
        stringList.add("The quick brown fox jumps over the lazy cat.");
        stringList.add("The quick brown dog jumps over the lazy cat.");

        // Print the original strings
        System.out.println("Original strings:");
        for (String s : stringList) {
            System.out.println(s);
        }

        // Replace the word "fox" with "rabbit" in the second string
        String selectedString = stringList.get(1);
        String replacedString = selectedString.replace("fox", "rabbit");
        stringList.set(1, replacedString);

        // Print the modified strings
        System.out.println("\nModified strings:");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
