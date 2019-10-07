package ass2;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	in
		int arr[]= {12,3,45,4,3,65,46};
		int i,j;
		for(i=0;i<arr.length-1;i++) {
			int min=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
