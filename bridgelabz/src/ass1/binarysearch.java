package ass1;
import java.util.*;
public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,15,23,32,34,45,50,67,89,90};
		int low =0,high=arr.length-1;
		//System.out.println(arr[9]);
		
		int key=45;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(key==arr[mid]) {
				System.out.println(mid);
				break;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		   
			
		}
	}

}
