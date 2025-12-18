package Practiceprograms;
import java.util.*;
public class OddEven {
public static void main (String args []) {
	int n,evenc=0,oddc=0;
	Scanner sc=new Scanner (System.in);
	n=sc.nextInt();
	int arr []=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]%2==0) {
			evenc++;
		}
		else {
			oddc++;
		}
	 }
	System.out.println(evenc);
	System.out.println(oddc);
  }
}
