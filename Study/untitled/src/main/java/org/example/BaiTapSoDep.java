package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTapSoDep
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] soDep = new int[n];
            for (int j = 0; j < n; j++)
            {
                soDep[j] = scanner.nextInt();
            }
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int count = demSoDepInRange(x, y, soDep);
            System.out.println("#" + i + " " + count);
        }
    }

    public static int demSoDepInRange(int start, int end, int[] soDep)
    {
        int count = 0;
        char[] specificDigits = convertIntArrayToCharArray(soDep);
        for (int k = start; k <= end; k++)
        {
            Map<Character, Integer> digitCount = demSoDep(k, specificDigits);
            int totalSpecificDigits = 0;
            for (char specificDigit : specificDigits)
            {
                totalSpecificDigits += digitCount.getOrDefault(specificDigit, 0);
            }
            if (totalSpecificDigits >= 3)
            {
                count++;
            }
        }
        return count;
    }

    public static Map<Character, Integer> demSoDep(int number, char[] specificDigits)
    {
        Map<Character, Integer> digitCount = new HashMap<>();
        String numberString = Integer.toString(number);
        for (char digitChar : numberString.toCharArray())
        {
            if (coSoDep(digitChar, specificDigits))
            {
                digitCount.put(digitChar, digitCount.getOrDefault(digitChar, 0) + 1);
            }
        }
        return digitCount;
    }

    public static boolean coSoDep(char target, char[] chars)
    {
        for (char c : chars)
        {
            if (c == target)
            {
                return true;
            }
        }
        return false;
    }

    public static char[] convertIntArrayToCharArray(int[] intArray)
    {
        char[] charArray = new char[intArray.length];
        for (int i = 0; i < intArray.length; i++)
        {
            charArray[i] = (char) (intArray[i] + '0');
        }
        return charArray;
    }
}
