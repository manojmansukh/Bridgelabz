package ass2;
import java.util.*;
public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float no,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no;");
		no=sc.nextInt();
		for(float i=1;i<=no;i++) {
			result=result+(1/i);
		}
		System.out.println(result);
	}

}
