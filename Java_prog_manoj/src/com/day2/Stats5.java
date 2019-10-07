package com.day2;
import java.util.*;
import java.math.*;

public class Stats5 {
	public static void main(String args[]) {
		double min=0,max=0,avg=0,ran;
		double arr[]=new double[20];
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			arr[i]=Math.random();
			System.out.println("random no:"+arr[i]);
		}
		min=arr[0];
		max=arr.length;
		
		System.out.println("Min value:"+Math.min(min,max));
		System.out.println("Max value:"+Math.max(min,max));
		//avg=(min+max)/2;
		//System.out.println("avg value:"+avg);*/
	}
}
