package ass1;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		int i,j,l1,l2,count=0;
		char ch1[],ch2[];
		System.out.println("Enter the first String");
		s1=sc.next();
		l1=s1.length();
		ch1=s1.toCharArray();
		int l=ch1.length;
		//for(i=0;i<ch1.length;i++)
		//System.out.println(l);
		System.out.println("Enter the sec String");
		s2=sc.next();
		l2=s2.length();
		ch2=s2.toCharArray();
		//for(i=0;i<ch2.length;i++)
			//System.out.print(ch2.length-1);
		if(l1==l2)
		{
			for(i=0;i<ch1.length;i++){
				for(j=0;j<ch2.length-1;j++) {
					if(ch1[i]==ch2[j]) {
						count++;
					}
					else {
						count=0;
					}
				}
			}
		}
		if(count==0)
			System.out.println("string not anagram");
		else
			System.out.println("string is anagram");
		
	}

}
