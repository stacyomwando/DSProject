
 
package data.structures.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class DTS   {
public static void main(String[] args) throws IOException {
    /**
     * @param args the command line arguments
     */
       String token1 = "";

    // for-each loop for calculating heat index of May - October

    // create Scanner inFile1
    Scanner inFile1 = new Scanner(new File("names.txt")).useDelimiter(",\\s*");

    // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
    // List<String> temps = new LinkedList<String>();
    List<String> temps = new ArrayList<String>();

    // while loop
    while (inFile1.hasNext()) {
      // find next line
      token1 = inFile1.next();
      temps.add(token1);
    }
    

    String[] tempsArray = temps.toArray(new String[0]);

    for (int i=0;i<tempsArray.length;i++) {
      System.out.println(tempsArray[i]+" ,");
      
    }
    System.out.println(tempsArray[0]);
    
    String token2 = "";

    
    
    Scanner inFile2 = new Scanner(new File("q1.txt")).useDelimiter("\\s");

        List<String> temps1 = new ArrayList<String>();

    
    while (inFile2.hasNext()) {
    
      token2 = inFile2.next();
      temps1.add(token2);
    }
    

    String[] tempsArray1 = temps1.toArray(new String[0]);

    for (int i=0;i<tempsArray1.length;i++) {
      System.out.println(tempsArray1[i]+" ,");
      
    }
    
    
    String token3 = "";

    
    
    Scanner inFile3 = new Scanner(new File("q2.txt")).useDelimiter("\\s");

        List<String> temps2 = new ArrayList<String>();

    
    while (inFile3.hasNext()) {
    
      token3 = inFile3.next();
      temps2.add(token3);
    }
    

    String[] tempsArray2 = temps2.toArray(new String[0]);

    for (int i=0;i<tempsArray2.length;i++) {
      System.out.println(tempsArray2[i]+" ,");
      
    }
    

    String token4 = "";

    
    
    Scanner inFile4 = new Scanner(new File("q1.txt")).useDelimiter("\\s");

        List<String> temps3 = new ArrayList<String>();

    
    while (inFile4.hasNext()) {
    
      token4 = inFile4.next();
      temps3.add(token4);
    }
    

    String[] tempsArray3 = temps3.toArray(new String[0]);

    for (int i=0;i<tempsArray3.length;i++) {
      System.out.println(tempsArray3[i]+" ,");
      
    }
    
        String token5 = "";

    
    
    Scanner inFile5 = new Scanner(new File("r1.txt")).useDelimiter("\\s");

        List<String> temps4 = new ArrayList<String>();

    
    while (inFile5.hasNext()) {
    
      token5 = inFile5.next();
      temps4.add(token5);
    }
    

    String[] tempsArray4 = temps4.toArray(new String[0]);

    for (int i=0;i<tempsArray4.length;i++) {
      System.out.println(tempsArray4[i]+" ,");
      
    }
          String token6 = "";

    
    
    Scanner inFile6 = new Scanner(new File("r2.txt")).useDelimiter("\\s");

        List<String> temps5 = new ArrayList<String>();

    
    while (inFile6.hasNext()) {
    
      token6 = inFile6.next();
      temps5.add(token6);
    }
    

    String[] tempsArray5 = temps5.toArray(new String[0]);

    for (int i=0;i<tempsArray5.length;i++) {
      System.out.println(tempsArray5[i]+" ,");
      
    }
      String token7 = "";

    
    
    Scanner inFile7 = new Scanner(new File("r3.txt")).useDelimiter("\\s");

        List<String> temps6 = new ArrayList<String>();

    
    while (inFile7.hasNext()) {
    
      token7 = inFile7.next();
      temps6.add(token7);
    }
    

    String[] tempsArray6 = temps6.toArray(new String[0]);

    for (int i=0;i<tempsArray6.length;i++) {
      System.out.println(tempsArray6[i]+" ,");
      
    }
}

}
