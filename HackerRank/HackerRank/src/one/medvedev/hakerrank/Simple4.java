package one.medvedev.hakerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Simple4 {

    static int diagonalDifference(int[][] a) 
    {
    	int res1 = 0;
        for (int i = 0; i < a.length; i++)
        {
       		res1 += a[i][i];
        }
        int res2 = 0;
        for (int i = a.length - 1; i >= 0; i--)
        {
        		res2 += a[i][a.length - i - 1];
        }
        
        return Math.abs(res1 - res2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}