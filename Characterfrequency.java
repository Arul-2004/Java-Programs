package Practiceprograms;
import java.util.*;
public class Characterfrequency {
public static void main  (String args []) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	int [] freq=new int [256];
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		freq[ch]++;
	}
	
	for(int i=0;i<freq.length;i++) {
		if(freq[i]>0) {
			System.out.println((char)i+":"+freq[i]);
		}
	}
}
}
