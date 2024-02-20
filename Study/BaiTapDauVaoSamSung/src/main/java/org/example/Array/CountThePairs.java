package org.example.Array;

import java.util.Scanner;

public class CountThePairs 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for (int i = 1; i <= testCase; i++)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] numbers = new int[n];
			for (int j = 0; j < n; j++)
			{
				numbers[j] = scanner.nextInt();
			}
			int count = 0;
			for (int l = 0; l < n; l++)
			{
				for (int p = 0; p < n; p++)
				{
					if (numbers[l] - numbers[p] == k)
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
