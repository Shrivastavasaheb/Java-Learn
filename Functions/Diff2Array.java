import java.util.*;
public class Diff2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the size of Array 1:");
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];
		System.out.println("Enter the elements of Array 1:");
		for(int i = 0; i < a1.length; i++) {
			a1[i]= scn.nextInt();			
		}
		System.out.println("Enter the size of Array 2 entered"
				+ " value should be greater than Array 1:");
		int n2= scn.nextInt();
		int[] a2= new int[n2];
		System.out.println("Enter the elements of Array 2:");
		for(int i=0; i< a2.length; i++) {
			a2[i]= scn.nextInt();
		}
		
		int[] diff = new int[n2];
		int c= 0;
		
		int i =  a1.length-1;
		int j = a2.length-1;
		int k = diff.length - 1;
		

		
		while(k>=0) {
			int d=0;
			int a1v = i >= 0 ? a1[i]:0;
			if(a2[j] >= a1v) {
				d= a2[j] + c - a1v;
				c=0;	
			}
			else {
				d = a2[j] + c + 10 - a1v;
				c=-1;
			}
			
			diff[k]=d;
			i--;
			j--;
			k--;
			
		}
		int inx = 0;
		while(inx<diff.length) {
			if(diff[inx]==0) {
				inx ++;
			}
			else {
				break;
			}
		}
		System.out.print( "Array 2 - Array 1 = " );
		while(inx<diff.length) {
			System.out.print(diff[inx]);
			inx++;
		}
		

	}
}


