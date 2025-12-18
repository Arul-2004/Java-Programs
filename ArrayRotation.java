package Practiceprograms;
import java.util.*;
public class ArrayRotation {
public static void main (String args []) {
	int n,k;
	Scanner sc=new Scanner (System.in);
	n=sc.nextInt();
	k=sc.nextInt();
	int arr []=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	k=k%n;
	for(int i=0;i<n;i++) {
		System.out.print(arr[(i+k)%n]+" ");//left rotation
	}
}
}

