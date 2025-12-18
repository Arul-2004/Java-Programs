package Practiceprograms;
import java.util.*;
public class StringAnagram {
    public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	s1=s1.replaceAll("\\s","").toLowerCase();
	s2=s2.replaceAll("\\s","").toLowerCase();
	if(s1.length()!=s2.length()) {
		System.out.print("Not a Anagram");
	}
	else {
		char  [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		  if (Arrays.equals(c1, c2)) {
			System.out.println("Anagrams");
		}
		  else
			{
			
			 System.out.println("Not an Anagram");
		
	}
	
   }
}
}

