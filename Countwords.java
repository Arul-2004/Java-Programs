package Practiceprograms;
import java.util.*;
public class Countwords {
    public static void main (String args[]) {
    	Scanner sc=new Scanner (System.in);
    	String s=sc.nextLine();
    	String [] word =s.trim().split("\\s+");
    	System.out.println(word.length);
    	
    }
}
