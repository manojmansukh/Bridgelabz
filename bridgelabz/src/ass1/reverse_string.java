package ass1;
import java.util.*;
public class reverse_string {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str="manoj mansukh";
	 
	String words[]=str.split(" ");
	String reversestr="";
	for(int i=0;i<words.length;i++) {
		String word=words[i];
		String revword="";
		for(int j=word.length()-1;j>=0;j--) {
			revword=revword+word.charAt(j); 
		}
		reversestr=reversestr+revword+" ";
	}
	System.out.println(str);
	System.out.println(reversestr);
	}
}
