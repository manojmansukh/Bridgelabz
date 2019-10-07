package ass2;
import java.util.*;
public class coupon {

	public static int collect(int n) {
		int count=0,distinct=0;
		boolean iscollect[]=new boolean[n];
		while(distinct<n) {
			count++;
			int value=(int) (Math.random()*n);
			if(!iscollect[value])
			{
				distinct++;
				iscollect[value]=true;
				
			}
		}return count;
		
	}
	public static void main(String[] args) {
		int n=100;
		int count=collect(n);
		System.out.println(count);
	}

}
