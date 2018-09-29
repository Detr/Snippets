package one.medvedev.hakerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Easy7 {

	/*
	 * Complete the miniMaxSum function below.
	 */
	static void miniMaxSum(int[] arr) 
	{
		Arrays.sort(arr);
		long sum = 0;
		for (int i : arr)
		{
			sum += i;
		}
		System.out.println((sum - arr[arr.length - 1]) + " " + (sum - arr[0]));
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < 5; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		miniMaxSum(arr);
	}
}