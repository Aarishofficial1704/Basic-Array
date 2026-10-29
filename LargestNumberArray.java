package BasicArray;

public class LargestNumberArray {
	public static void main (String[] args) {
		int arr[]= {3,45,4,6,78,9};
		int largest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest Number:" +largest);
	}

}
