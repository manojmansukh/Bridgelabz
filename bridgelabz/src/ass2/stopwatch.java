package ass2;
import java.util.*;
public class stopwatch {

	public static void main(String[] args) {
		int start,stop,elapse;
		Scanner sc=new Scanner(System.in);
		System.out.println("time is start");
		start=(int) System.currentTimeMillis();
		System.out.println("press 0 to stop:");
		int n=sc.nextInt();
		stop=(int) System.currentTimeMillis();
		elapse=(stop-start)/1000;
		System.out.println("elapse time"+elapse+"ms");
	}

}
