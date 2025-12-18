package Practiceprograms;
import java.util.*;
public class NonrepatingCharacter {
public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		boolean isrepeated=false;
		for(int j=0;j<s.length();j++) {
			char c=s.charAt(j);
			if(ch==c) {
				isrepeated=true;
				break;
			}
			
		}
		if(isrepeated)
			System.out.print(ch);
	}
}
}
