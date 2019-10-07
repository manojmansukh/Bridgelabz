package ass2;
import java.util.*;
public class string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="manoj mansukh";
		String revstring="";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword+=word.charAt(j);
			}
			revstring+=revword+" ";
		}
		System.out.println(str);
		System.out.println(revstring);
	}

}
