package ass1;
import java.util.*;
public class bubble_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int arr[]= {10,2,56,7,34,78,3,58,9,43};
		System.out.println("enter the no of element insert:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the "+n +" element");
		for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
				}
			}
		}
		System.out.print("sorted arr:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
