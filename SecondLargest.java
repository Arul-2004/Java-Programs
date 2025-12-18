package Practiceprograms;
import java.util.*;
public class SecondLargest {
public static void main (String args[]) {
	int n;
	Scanner sc=new Scanner (System.in);
	n=sc.nextInt();
	int arr []=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	//System.out.print(arr[n-1]+" ");
	System.out.println(arr[n-2]);
	}
}

