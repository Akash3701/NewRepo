import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int minProd = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(minProd > arr[i]*arr[j]){
					minProd = arr[i]*arr[j];
				}
			}
		}
		System.out.println(minProd);
		
		sc.close();
	}
}
