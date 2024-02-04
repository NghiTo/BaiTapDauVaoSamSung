package org.example;

import java.util.Scanner;

public class VuotChuongNgaiVat
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int startRow = scanner.nextInt();
            int startCol = scanner.nextInt();
            int[][] maTran = new int[n][n];
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    maTran[j][k] = scanner.nextInt();
                }
            }
            int count = 0;
            boolean changed;
            do
            {
                changed = false;
                int min = Integer.MAX_VALUE;
                int newRow = startRow;
                int newCol = startCol;
                for (int j = Math.max(0, startRow - 1); j <= Math.min(n - 1, startRow + 1); j++)
                {
                    for (int k = Math.max(0, startCol - 1); k <= Math.min(n - 1, startCol + 1); k++)
                    {
                        if (maTran[j][k] < min && maTran[j][k] > maTran[startRow][startCol])
                        {
                            min = maTran[j][k];
                            newRow = j;
                            newCol = k;
                            changed = true;
                        }
                    }
                }
                if (changed)
                {
                    startRow = newRow;
                    startCol = newCol;
                    count ++;
                }
            } while (changed);
            System.out.println("#" + i + " " + count);
        }
    }
}
