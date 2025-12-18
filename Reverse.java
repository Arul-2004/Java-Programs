package Practiceprograms;
import java.util.*;
public class Reverse {
	public static void main (String args []) {
		int n;
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		int arr []=new int [n];
		for(int i=0;i<n;i++) {//to create an array
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n/2;i++) {//to make changes that is to reverse
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		for(int i=0;i<n;i++) {//print the reversed array
			System.out.print(arr[i]+" ");
		}
	}

}
