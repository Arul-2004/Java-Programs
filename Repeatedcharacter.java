package Practiceprograms;
import java.util.*;
public class Repeatedcharacter {
public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	int freq []=new int [256];
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		freq[ch]++;
	}
	boolean isrepeated=false;
	for(int i=0;i<s.length();i++) {
		if(freq[s.charAt(i)]==1) {
			isrepeated=true;
			System.out.print(s.charAt(i)+" ");
			
	}
}
	if(!isrepeated) {
		System.out.println("None");
	}
	
}
}