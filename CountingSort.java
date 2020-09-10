
import java.io.*;
import java.util.*;
// Java implementation of Counting Sort
// Output:
//    Sorted character array is eeeefggkkorss
class CountingSort 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // The output character array that will have sorted arr 
        int output[] = new int[n]; 
        // Create a count array to store count of inidividul 
        // characters and initialize count array as 0 
        int count[] = new int[256]; 
        for (int i=0; i<256; ++i) 
            count[i] = 0; 
  
        // store count of each character 
        for (int i=0; i<n; ++i) 
            ++count[arr[i]]; 
  
        // Change count[i] so that count[i] now contains actual 
        // position of this character in output array 
        for (int i=1; i<=255; ++i) 
            count[i] += count[i-1]; 
  
        // Build the output character array 
        // To make it stable we are operating in reverse order. 
        for (int i = n-1; i>=0; i--) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
  
        // Copy the output array to arr, so that arr now 
        // contains sorted characters 
        for (int i = 0; i<n; ++i) 
            arr[i] = output[i]; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
        throws FileNotFoundException 
    {         
        long startTime = System.nanoTime();

        CountingSort ob = new CountingSort(); 
       
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("midterm.txt"));
        while(input.hasNextInt()){
            int num = input.nextInt();
            arr.add(num);
        }
        int a[]=arr.stream().mapToInt(i->i).toArray();

        ob.sort(a); 
  
        System.out.print("Sorted character array is "); 
        for (int i=0; i<a.length; ++i) 
            System.out.print(a[i]+" "); 
        System.out.println();
        long stopTime = System.nanoTime();
        System.out.println("Time taken for extecution:"+ (stopTime - startTime));
    } 
    
}
