package Day3;

public class smallestelementarr {
	public static void main(String[] args) {

		int[] arr = new int[] { 55, 21, 37, 74, 26, 92, 8, 2 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in the given array: " + min);
	}
}