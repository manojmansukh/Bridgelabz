package ass1;
import java.util.*;
public class harmonicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		float result = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		no=sc.nextInt();
		for(float i=1;i<=no;i++)
		{
			result=result+1/i;
		}
		System.out.println("Result:"+result);	
	}

}
