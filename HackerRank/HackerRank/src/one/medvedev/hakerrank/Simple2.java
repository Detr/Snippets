package one.medvedev.hakerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Simple2 {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
    	int res = 0;
    	for (int i: ar)
    	{
    		res += i;
    	}
    	return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
