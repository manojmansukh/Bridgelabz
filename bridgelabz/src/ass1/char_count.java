package ass1;
import java.util.*;
public class char_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		char temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.next();
		char ch[]=str.toCharArray();
		for( i=0;i<ch.length;i++)
		{ int count=0;
			for( j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					temp=ch[i];
					count++;
				}
			}
			System.out.println(ch[i]+" "+count);
		}
	}

}
