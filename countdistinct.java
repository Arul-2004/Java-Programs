package Practiceprograms;
import java.util.*;
class countdistinct {
	public static void main (String args []) {
	int n;
	Scanner sc=new Scanner (System.in);
	n=sc.nextInt();
	int arr []=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int c=0;
	for(int i=0;i<n;i++) {
	    
		for(int j=0;j<i;j++) {
			if (arr[i]!=arr[j] ){
				c++;
			}
		}
		
	}
	
	System.out.print(c);
}
}
