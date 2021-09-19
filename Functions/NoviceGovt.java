import java.util.*;
public class Novice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int [n];
		for(int i= 0; i<arr.length; i++) {
			arr[i]= scn.nextInt();
			
		}
		//System.out.println("Enter the currency");
		int d = scn.nextInt();
		
		int l = 0;
		int h = arr.length - 1;
		 while( l <= h) {
			 int mid = (l+h)/2;
			 if ( d > arr[mid]) {
				 l = mid + 1;
			 }
			 else if (d < arr[mid]) {
				 h = mid -1;
			 }
			 else {
				 System.out.println(arr[mid]);
			 }
		 }
		System.out.println(arr[l]);
		System.out.println(arr[h]);

	}

}

