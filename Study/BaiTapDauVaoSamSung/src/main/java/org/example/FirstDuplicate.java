package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class FirstDuplicate
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++)
            {
                numbers[j] = scanner.nextInt();
            }
            int result = findFirstDuplicate(numbers);
            System.out.println("#" + i + " " + result);
        }
    }

    private static int findFirstDuplicate(int[] numbers)
    {
        HashMap<Integer, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++)
        {
            if (lastIndexMap.containsKey(numbers[i]))
            {
                return numbers[i];
            }
            else
            {
                lastIndexMap.put(numbers[i], i);
            }
        }
        return -1;
    }
}
