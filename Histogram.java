import java.io.*;
import java.util.*;

public class Histogram {

    public static void main(String[] args) 
            throws FileNotFoundException 
   {
        long startTime = System.nanoTime();

        // counters of test scores 0 - 100
        int[] counts = new int[101];     
        
        Scanner input = new Scanner(new File("midterm.txt"));
        // read file into counts array
        while (input.hasNextInt()) {     
            int score = input.nextInt();
            // if score is 87, then counts[87]++
            counts[score]++;             
        }
        
        // print star histogram
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                // counts[i] stores how many students 
                // scored i on the test, so print a 
                // star (counts[i]) times
                System.out.print(i + ": ");
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        long stopTime = System.nanoTime();
        System.out.println("Time taken for extecution:"+ (stopTime - startTime));
    }
    
}