import java.util.*;
public class gambler {

	public static void main(String[] args) {
		int stack,trail,goal,win=0,loss=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the stack:");
		stack=sc.nextInt();
		System.out.println("enter the goal:");
		goal=sc.nextInt();
		System.out.println("enter the trail:");
		trail=sc.nextInt();
		
		for(int i=0;i<trail;i++)
		{
			int cash=stack;
			while(cash>=0 && cash<goal ) {
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
			}
			if(cash==goal)
				win++;
			else if(cash==0)
				loss++;
			
			}
		System.out.println(win + " wins of " + trail);
	    System.out.println("Percent of games won = " + 100.0 * win / trail);
	    System.out.println("Percent of games loss = " + 100.0 * loss / trail);
		}
}
	
		/*for(int i=0;i<=trail;i++) {
			int value=(int) Math.random();
			if(value>0.5) {
				stack++;
				win++;
			}
			else {
				loss++;
				stack--;
			}
			if(stack==0) {
				System.out.println("you loss at "+i);
				System.out.println("you lost"+ (i-win) +"times");
			}
				else if(stack==goal) {
				System.out.println("you win at"+i);
				System.out.println("you win"+ win +"times");
				}
		}
		
	}*/


