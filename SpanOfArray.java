package www.java.firstproject;
import java.util.Scanner;
public class SpanOfArray {
	static int span;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		//int spans = 0;
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int num:arr) {
			if(num>max)
				max = num;
			if(num<min)
				min = num;
			
		}
		span = max-min;
		System.out.println("Span of the array is : "+span);
		
	}
}
