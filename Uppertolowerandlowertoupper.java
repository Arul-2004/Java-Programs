package Practiceprograms;
import java.util.*;
public class Uppertolowerandlowertoupper {
public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
	
	if(Character.isLowerCase(ch)) {
		 res+=Character.toUpperCase(ch);
	}
	else if(Character.isUpperCase(ch)){
		res+=Character.toLowerCase(ch);
	}
	else {
		res+=ch;
	}
}
	System.out.println(res);
}
}
