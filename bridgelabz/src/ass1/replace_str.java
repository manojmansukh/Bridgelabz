package ass1;

import java.util.*;

public class replace_str {
	public static void main(String[] args) {
		int i;int pos=0;
		Scanner sc=new Scanner(System.in);
		String arr[]= {"Hello ","<<user_name>>",",How ","are ","you ?"};
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println("\nEnter the user name:");
		String name=sc.next();
		for(i=0;i<arr.length;i++) {
			
			if(arr[i]=="<<user_name>>")
			{
			 pos=i;
			// System.out.println(arr[pos]);
			}
		}
		arr[pos]=name;
		for(i=0;i<arr.length;i++) 
		System.out.print(arr[i]);
		
	}
	}

