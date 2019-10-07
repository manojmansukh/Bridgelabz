package ass2;
import java.util.*;
class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	in
		int arr[]= {12,3,45,4,3,65,46};
		int i,j;
		for(j=1;j<arr.length;j++) {
			i=j-1;
			int key=arr[j];
			while(i>=0 && arr[i]>key) {
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
