package com.bridgelabz;
import java.util.*;
public class stopwatch {
	public static void main(String argsd[]) {
		Scanner sc = new Scanner(System.in);
		long t1=0,t2=0;
		t1=start(t1);
		System.out.println("\n time start.\n enter stop for calculate time.");
		String ch=sc.next();
		if("stop".equals(ch))
		{
			t2=stop(t2);
			System.out.println("Elapse time:"+elapsed(t1,t2));
		}
	}

public static long start(long t1) {
	return t1=System.currentTimeMillis();
}
public static long  stop(long t2) {
	return t2=System.currentTimeMillis();
}

public static long elapsed(long t1, long t2) {
return (t2-t1)/1000;
}
}