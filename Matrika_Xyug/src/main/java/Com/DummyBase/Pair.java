package Com.DummyBase;

import java.util.Arrays;

public class Pair {

	static Main getMinMax(int arr[], int n) {
		Main minmax = new Main();
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n - 1];
		return minmax;
	}

	public static void main(String[] args) {

		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = arr.length;

		Main minmax = getMinMax(arr, arr_size);
		System.out.println("minimum element is: " + minmax.min);
		System.out.println("minimum element is: " + minmax.max);
	}

}

class Main {

	public int min;
	public int max;

}
