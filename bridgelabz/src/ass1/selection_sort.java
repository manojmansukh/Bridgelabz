package ass1;
import java.util.*;
public class selection_sort {
	public static void main(String[] args) {
		int arr[]= {10,23,5,32,2,1};
	
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println("sorted array:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
