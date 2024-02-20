package org.example.Array;

import java.util.Scanner;

public class QueueRookie
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner= new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int[] heights = new int[n];
            int[] heightCount =  new int[n];
            int[] result = new int[n];
            for (int j = 0; j < n; j++)
            {
                heights[j] = scanner.nextInt();
                result[j] = 0;
            }
            for (int j = 0; j < n; j++)
            {
                heightCount[j] = scanner.nextInt();
            }
            for (int j = 0; j < n - 1; j++)
            {
                for (int k = j + 1; k < n; k++)
                {
                    if (heights[k] < heights[j] || heights[k] == heights[j] && heightCount[k] < heightCount[j])
                    {
                        swap(j, k, heights, heightCount);
                    }
                }
            }
            for (int j = 0; j < n; j++)
            {
                int count = 0;
                for (int k = 0; k < n; k++)
                {
                    if (result[k] == 0)
                    {
                        count++;
                        if (count > heightCount[j])
                        {
                            result[k] = heights[j];
                            break;
                        }
                    }
                }
            }
            for (int j = 0; j < n; j++)
            {
                System.out.print(result[j] + " ");
            }
        }
        scanner.close();
    }

    private static void swap(int j, int k, int[] heights, int[] heightCount)
    {
        int temp = heights[j];
        heights[j] = heights[k];
        heights[k] = temp;

        temp = heightCount[j];
        heightCount[j] = heightCount[k];
        heightCount[k] = temp;
    }
}
