package ass1;
import java.util.*;
public class matrix_mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		int r=2,c=2;
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		int m3[][]=new int[r][c];
		System.out.println("enter value for 1 matrix:");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
			System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("enter value for 2 matrix:");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
			System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
	
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				m3[i][j]=0;
				for(k=0;k<c;k++) {
					m3[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		System.out.println("mat ");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
			System.out.print(m3[i][j]+" ");
			}
			System.out.println();
	
	}

}
}
