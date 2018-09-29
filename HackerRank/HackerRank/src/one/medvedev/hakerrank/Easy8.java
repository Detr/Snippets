package one.medvedev.hakerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Easy8
{

	/*
	 * Complete the birthdayCakeCandles function below.
	 */
	static int birthdayCakeCandles(int n, int[] ar)
	{
		HashMap<Integer, Integer> hs = new HashMap<>();
		int max = 0;
		for (int i : ar)
		{
			max = max < i ? i : max;
			hs.merge(i, new Integer(1), (x, y) -> x +y);
		}
		
		return hs.get(max);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\out.txt"));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] ar = new int[n];

		String[] arItems = scan.nextLine().split(" ");

		for (int arItr = 0; arItr < n; arItr++)
		{
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = birthdayCakeCandles(n, ar);

		bw.write(String.valueOf(result));
		bw.newLine();

		bw.close();
	}
}