package com.bridgelabz;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1,s2="";
		char ch1[],ch2[];
		int i,j=0;
		System.out.println("enter the String:");
		s1=sc.next();
			int n=s1.length();
		for( i=n-1;i>=0;i--)
		{
			s2=s2+ s1.charAt(i);
			
		}
		
		if(s1.equals(s2))
		{
			System.out.println("The string is palindrome.");
        }
		else
        {
            System.out.println("The string is not palindrome.");
        }
		
	}
}
