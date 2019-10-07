package ass1;
import java.util.*;
public class inesertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,12,3,14,8};
		for(int j=1;j<arr.length;j++) {
			int i=j-1,key=arr[j];
			while(i>=0 && arr[i]>key) {
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
		System.out.println("sorted array:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		}
	}


