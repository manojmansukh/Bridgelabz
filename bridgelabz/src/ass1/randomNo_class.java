package ass1;
import java.util.*;
public class randomNo_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max,random;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the min no.:");
		min=sc.nextInt();
		System.out.println("enter the max no.:");
		max=sc.nextInt();
		
		int range=max-min+1;
		Random ra=new Random();
		random=ra.nextInt(range)+min;
		System.out.println("Random no:"+random);
	}

}
