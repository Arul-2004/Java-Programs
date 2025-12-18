package Practiceprograms;
import java.util.*;
public class Main {
	public static void main (String args []) {
int n,s=0;
Scanner sc=new Scanner (System.in);
System.out.print("Enter n:");
n=sc.nextInt();
int arr []=new int [n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	s+=arr[i];
}

System.out.print(s);
  }
}
