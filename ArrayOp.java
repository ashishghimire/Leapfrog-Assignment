package arrayop;

import java.util.*;

/**
 *
 * @author Ashish
 */
public class ArrayOp {
    public static int process(int[] a, int n) {
	int i;
	String str="";
	for(i=0;i<a.length;i++){
            str=str+String.valueOf(a[i]);
	}
	if(Integer.valueOf(str).equals(n)){
            return 1;
	}else{
            return 0;	
        }
		
    }
    public static void main(String[] args){
	int number,a,i;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no. of array elements");
	a=s.nextInt();
	int arr[]= new int[a];
	System.out.println("Input 1 - ");
	
	for(i=0;i<a;i++){
		arr[i]=s.nextInt();
	}
	
	System.out.println("Input 2 - ");
	number= s.nextInt();
	
	System.out.println("Returned Value: "+process(arr,number));
    }
}
