package Practiceprograms;
import java.util.*;
public class Converttoupperandlowercase {
  public static void main (String args []) {
	  Scanner sc=new Scanner (System.in);
	  String s=sc.nextLine();
	  String upper=s.toUpperCase();
	  String lower =s.toLowerCase();
	  System.out.println(upper);
	  System.out.println(lower);
  }
}
