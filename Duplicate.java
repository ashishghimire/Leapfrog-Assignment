package duplicate;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Ashish
 */
public class Duplicate {
    public static void main(String[] args) {
        
        FileInputStream fstream = null;
        try {
            
            //Taking input file
            fstream = new FileInputStream("d:\\input_sentence.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            //Reading the line and putting in strline string
            String strLine = br.readLine();
            int x=1;
            //Splitting the string
            String[] arr = strLine.split("\\s+");
            //Defining two array list for key and value pair
            ArrayList<String> key = new ArrayList<String>();
            ArrayList<String> value=new ArrayList<String>();
            String unique="unique words:",duplicate="duplicate words: ",dupElim="duplicate eliminated: ";
            
            for (int i=0;i<arr.length;i++){
                if (key.contains(arr[i])) {
                    for (int j=0;j<key.size();j++){
                        if(key.get(j).equals(arr[i])) {
                            x=Integer.parseInt(value.get(j));
                            x++;
                            key.remove(j);
                            value.remove(j);
                        }
                    }
                }
                key.add(arr[i]);
                value.add(Integer.toString(x));
            }
            //adding the duplicatea and unique values to the string
            for (int i=0;i<key.size();i++){
                if (Integer.parseInt(value.get(i))==1) unique=unique+" "+key.get(i);
                else if (Integer.parseInt(value.get(i))>1) duplicate=duplicate+" "+key.get(i)+" - "+value.get(i);
                dupElim=dupElim+" "+key.get(i);
            }
            
            //Printing out the output.
            System.out.println(unique);
            System.out.println(duplicate);
            System.out.println(dupElim);

        } catch (Exception e) {// Catch exception if any
          System.err.println("Error: " + e.toString());
        } finally {
          if (fstream != null) {
              try { fstream.close(); }
              catch (IOException e) {
              // log failure to close file
              }
          }
        } 
    }
}
