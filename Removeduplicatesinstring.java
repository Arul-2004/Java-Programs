package Practiceprograms;
import java.util.*;
public class Removeduplicatesinstring {
public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		boolean isduplicate=false;
		for(int j=0;j<i;j++) {
			if(s.charAt(i)==s.charAt(j)) {
				isduplicate=true;
				break;
			}
		}
		if(!isduplicate) {
			System.out.print(ch);
		}
	}
}
}
