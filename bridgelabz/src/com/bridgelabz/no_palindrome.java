package com.bridgelabz;
import java.util.*;
public class no_palindrome {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int no,rem,div=0,number;
	System.out.println("enter the String:");
	no=sc.nextInt();
	number=no;
	
	while(no!=0)
	{
		rem=no%10;
		div=div*10+rem;
		no=no/10;
	}
	
	System.out.println(div);
	if(number==div)
		System.out.println(+number+" is a palindrome." );
    else
    	System.out.println(+number+" is not a palindrome.");
}
}
