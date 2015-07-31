package checkfile;

import java.io.*;
/**
 *
 * @author Ashish
 */

public class CheckFile {
    public static void main(String[] args){
        FileInputStream fstream;
	try {
            int temp,n;
            fstream = new FileInputStream("d:\\input_numbers.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String fout = "d:\\output_numbers.txt";
            String strLine;
            try {       //Read line by line
		while ((strLine = br.readLine()) != null)   {
                    String[] arr=(strLine.split(","));
                    int[] arr1[arr.length];
                    int l=0;
		    for(String str:arr){
                        arr1[l]=Integer.parseInt(str);
			l++;
                    }
                    n=arr1.length;
                    
		    for (int i = 0; i < (n - 1); i++) {             //sorting
                        for (int j = 0; j < n - i - 1; j++) {
			    if (arr1[j] > arr1[j+1]) 
                            {
                                temp= arr1[j];
                                arr1[j]= arr1[j+1];
                                arr1[j+1]= temp;
                            }
                        }
                    }
                    String str1=String.valueOf(arr1[0]);
                    for(int k=1;k<arr.length;k++){
                        str1 = str1+","+String.valueOf(arr1[k]);
                    }
                    System.out.println(str1);
                    FileWriter fileWriter = new FileWriter(fout);
                    try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                        bufferedWriter.write(str1);
                    }
						   
		}
					
            }catch (IOException e) { e.getMessage();}
				
        }catch (FileNotFoundException e) {e.getMessage();}
    }
}

					
		
	 
			
