package ass1;
import java.util.*;
public class floyd_tri {

	public static void main(String[] args) {
		int count=1;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
