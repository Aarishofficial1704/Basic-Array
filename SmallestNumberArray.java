package BasicArray;

public class SmallestNumberArray {
	public static void main(String[] args) {
		int arr[] = {23,34,5,7,10,56};
		int smallest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("SmallestNumber:" +smallest);
	}

}
