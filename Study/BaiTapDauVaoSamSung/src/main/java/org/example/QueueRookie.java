package org.example;

import java.util.Scanner;

public class QueueRookie
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int[] heights = new int[n];
            int[] heightCount =  new int[n];
            for (int j = 0; j < n; j++)
            {
                heights[j] = scanner.nextInt();
            }
            for (int k = 0; k < n; k++)
            {
                heightCount[k] = scanner.nextInt();
            }
            int[] result = new int[n];
            for (int p = 0; p < n; p++)
            {
                int tallerCount = 0;
                for (int q = 0; q < n; q++)
                {
                    if (tallerCount == heightCount[p] && result[q] == 0)
                    {
                        result[q] = heights[p];
                        break;
                    }
                    if (result[q] == 0 || result[q] > heights[p])
                    {
                        tallerCount++;
                    }
                }
            }
            for (int l = 0; l < n; l++)
            {
                System.out.print(result[l] + " ");
            }
        }
    }
}
