package Practiceprograms;
import java.util.*;
public class Reversestring {
public static void main  (String args []) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	int n=s.length();
	String rev="";
	for(int i=n-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
