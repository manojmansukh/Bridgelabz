package ass1;

import java.util.Scanner;

public class stopwatch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long start;
		long stop;
		System.out.println("\ntime is start");
		start=(int) System.currentTimeMillis();
		System.out.println("\n press 0 for stop for calculate elapse time:");
		stop=sc.nextInt();
		stop=System.currentTimeMillis();
		long elapse=(int) (stop-start)/1000;
		System.out.println("elapse time "+elapse+" ms");
	}
}
