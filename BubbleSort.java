package Array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 55, 33, 66, 33, 11, 77, 22 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {    
			
			
			
			System.out.print(a[i]+" ");
		}

	}

}
