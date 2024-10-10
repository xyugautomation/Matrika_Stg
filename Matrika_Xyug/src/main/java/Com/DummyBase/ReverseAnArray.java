package Com.DummyBase;

import java.util.Arrays;

public class ReverseAnArray {

	public static void Array() {

		String[] stringArray1; // Declaration of the String Array without specifying the size.

		int[] number = new int[5];
		number[0] = 1;

		String[] stringArray2 = new String[2];
		stringArray2[0] = "Shiv";
		stringArray2[1] = "Xyug";
		stringArray2[2] = "IT";
		for (String s : stringArray2) {
			System.out.println(s);
		}
	}

	static void reverseArray(int[] arr) {

		int n = arr.length;

		int[] temp = new int[n];

		for (int i = 0; i < n; i++)
			temp[i] = arr[n - i - 1];
		for (int i = 0; i < n; i++)

			arr[i] = temp[i];

	}

	
	
	public static  void s() {
		
		String[] str= {"Ani","Sam","Joe"};
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		for(String strs:str) {
			System.out.println(strs);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//Array();

		//ToString method
		
//		String gfg[]= {"Geeks","for","Geeks"};
//		System.out.println(Arrays.toString(gfg));
//		
//		s();

	
		//deepToString method
		String grg1[][]= {{"GeeksForGeeks","Article writing"},{"Google","Search Engine"},{"Facebook","Social media"}};
		System.out.println(Arrays.deepToString(grg1));
	
		
		//for loop
		
		String gfg2[]=new String[3];
		
		gfg2[0]="Geeks";
		gfg2[1]="For";
		gfg2[2]="Geeks";	
		
		
		for(int i=0; i<=2;i++) {
			System.out.println(gfg2[i] + " ");
		}
		
	
	}

	
}
