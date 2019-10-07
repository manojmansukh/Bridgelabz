package ass1;
import java.util.*;
public class insertion_sort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the of element insert:");
		int no =sc.nextInt();
		int arr[]=new int[no];
		System.out.println("enter the "+no + " element");
		for(int i=0 ;i<no;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=1;j<arr.length;j++) {
			int i=j-1;
			int key=arr[j];
			while(i>=0 && arr[i]>key) {
				arr[i+1]=arr[i];
				i=i-1;
			}
				arr[i+1]=key;
			
			
			}
		System.out.print("sorted arr:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
