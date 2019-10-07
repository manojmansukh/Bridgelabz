import java.util.*;
import java.math.*;
public class coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int count=collect(n);
		System.out.println(count);
	}

 public static int collect(int n) {
	boolean iscollect[]=new boolean[n];	
	 int count=0,distinct=0;
	 while(distinct<n) {
		 int value= (int) (Math.random()*n);
		 count++;
		 if(!iscollect[value]) {
			 distinct++;
			 iscollect[value]=true;
		 }
	 }
	 return(count);
	}
	

}
