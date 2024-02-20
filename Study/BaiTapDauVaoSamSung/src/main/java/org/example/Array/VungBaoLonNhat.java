package org.example.Array;

import java.util.Scanner;

public class VungBaoLonNhat
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int m, n, h, w, temp, max;
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            h = scanner.nextInt();
            w = scanner.nextInt();
            m = scanner.nextInt();
            n = scanner.nextInt();
            max = 0;
            int[][] matrix = new int[m][n];
            for (int j = 0; j < m; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    matrix[j][k] = scanner.nextInt();
                }
            }
            for (int j = 0; j <= m - h; j++)
            {
                for (int k = 0; k <= n - w; k++)
                {
                    if ((temp = calculate(j, k, h, w, matrix)) > max)
                    {
                        max = temp;
                    }
                }
            }
            System.out.println("#" + i + " " + max);
        }
        scanner.close();
    }

    public static int calculate(int r, int c, int h, int w, int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < h; i++)
        {
            if (matrix[r + i][c] % 2 == 0)
            {
                sum += matrix[r + i][c];
            }
            if (matrix[r + i][c + w - 1] % 2 == 0)
            {
                sum += matrix[r + i][c + w - 1];
            }
        }
        for (int i = 1; i < w - 1; i++)
        {
            if (matrix[r][c + i] % 2 == 0)
            {
                sum += matrix[r][c + i];
            }
            if (matrix[r + h - 1][c + i] % 2 == 0)
            {
                sum += matrix[r + h - 1][c + i];
            }
        }
        return sum;
    }
}
