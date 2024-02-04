package org.example;

import java.util.Scanner;

public class GiaoHangNhanh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int[][] maTran = new int[n][n];
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    maTran[j][k] = scanner.nextInt();
                }
                scanner.nextLine();
            }
            int sum = calculateDistance(maTran, n);
            System.out.println("#" + i + " " + sum);
        }
    }

    private static int calculateDistance(int[][] maTran, int n)
    {
        boolean[] visited = new boolean[n];
        int sum = 0;
        int temp = 0;
        visited[temp] = true;
        for (int i = 1; i < n; i++)
        {
            int next = findNextLocation(maTran, visited, temp, n);
            sum = sum + maTran[temp][next];
            visited[next] = true;
            temp = next;
        }
        sum = sum + maTran[temp][0];
        return sum;
    }

    private static int findNextLocation(int[][] maTran, boolean[] visited, int temp, int n)
    {
        int min = Integer.MAX_VALUE;
        int next = -1;
        for (int i = 0; i < n; i++)
        {
            if (!visited[i] && maTran[temp][i] < min)
            {
                min = maTran[temp][i];
                next = i;
            }
        }
        return next;
    }
}
