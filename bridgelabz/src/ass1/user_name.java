package ass1;
import java.util.*;
public class user_name {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,pos=0;
		String arr[]={"Hello ","<<userName>> ",",how ","are ","you?"};
		String name;
		for (i=0;i<arr.length-1;i++)
		System.out.print(arr[i]);
		System.out.println("\nEnter the user name:");
		name=sc.next();
		for(i=0;i<arr.length-1;i++) {		
		if(arr[i]=="<<userName>>")
		{			
			pos=i;
		}
		}	
		arr[pos]=name;
		for (i=0;i<arr.length-1;i++)
			System.out.print(arr[i]);
				
	}	
}
