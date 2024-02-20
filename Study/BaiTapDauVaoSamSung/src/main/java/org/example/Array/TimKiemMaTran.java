package org.example.Array;

import java.util.Scanner;

public class TimKiemMaTran
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int target = scanner.nextInt();
            int[][] matrix = new int[n][n];
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    matrix[j][k] = scanner.nextInt();
                }
            }
            
        }
    }
}
