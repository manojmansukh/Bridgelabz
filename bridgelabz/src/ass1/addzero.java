package ass1;
import java.util.*;
public class addzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,result=0;
		int arr[]= {0, -1, 2, -3, 1};
		int n=arr.length;
		for(i=0;i<n-2;i++) {
			for(j=i+1;j<n-1;j++) {
				for(k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0)
						System.out.println(arr[i]+" "+arr[j]+" "+ arr[k]);
				}
			}
		}
	}

}
