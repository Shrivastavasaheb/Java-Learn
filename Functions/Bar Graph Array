import java.util.*;
public class BarChart {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println();
		int[] array= Input(n);

		
		int max = array[0];
		for(int i=1; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];}
		}
			
		for( int floor = max; floor>=1; floor--) {
			for(int c=0; c<array.length; c++){
				if(array[c]>=floor){
					System.out.print("*\t");}
				else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}
	public static int[] Input(int n) {
		Scanner scn = new Scanner(System.in);
		
	int[] arr= new int[n];
	for(int i=0; i<arr.length ; i++) {
		System.out.println("Enter array" + "[" + i + "]" );
		arr[i]=scn.nextInt();				
	}
		
	return arr;
	}
}
