package BasicArray;

public class CountEvenandOdd {
	public static void main(String[] args) {
		int arr[]= {22,3,1,4,56,7,8,5};
		int even = 0;
		int odd =0;
		for (int i=1; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even Number:" +even);
		System.out.println("Odd Number:" +odd);
	}
}
