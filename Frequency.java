package Practiceprograms;
import java.util.*;
class Frequency {
	public static void main (String args[]) {
		int n;
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		int arr []=new int [n];
		boolean visited []=new boolean [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if (visited [i]==true) {
				continue;
			}
			int count=1;
		for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
			count++;
			visited[j]=true;
			}
		}
		System.out.println(arr[i]+"-> "+count);
			
	     }
		
	}
}

	



