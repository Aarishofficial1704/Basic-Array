package BasicArray;

public class PositiveAndNegativeNumber {
	public static void main(String[] args) {
		int arr[]= {10,-32,-10,32,56,7,-8,-9};
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<positive) {
				positive++;
			}else if(arr[i]>negative) {
				negative++;
			}else {
				zero++;
			}
		}
		System.out.println("Positive Number:" +positive);
		System.out.println("Negative Number:" +negative);
		System.out.println("Zero:" +zero);
	}
}
