package Practiceprograms;
import java.util.*;
public class Pallindrome {
public static void main (String args []) {
	int n;
	Scanner sc =new Scanner (System.in);
	n=sc.nextInt();
	int arr []=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n/2;i++) {
		if(arr[i]!=arr[n-1-i]) {
			System.out.print("Not Pallindrome");
			break;
		}
		else {
			
			System.out.print("Pallindrome");
			break;
		}
		}
		
	}
	
	
}
