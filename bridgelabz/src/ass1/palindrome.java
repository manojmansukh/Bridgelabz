package ass1;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1,s2="";
		System.out.println("enter the string:");
		s1=sc.next();
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2))
			System.out.println("string is palindrome");
		else
			System.out.println("string not palindrome");
	}
}
