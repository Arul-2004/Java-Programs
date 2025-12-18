package Practiceprograms;
import java.util.*;
class Missingelement {
public static void main (String args []) {
	int n,m,s=0;
	Scanner sc =new Scanner (System.in);
	n=sc.nextInt();
	int arr []=new int [n-1];
	for(int i=0;i<n-1;i++) {
		arr[i]=sc.nextInt();
		s+=arr[i];
	}
	int total=n*(n+1)/2;
	int missing=total-s;
	System.out.print(missing);
	}
}
 