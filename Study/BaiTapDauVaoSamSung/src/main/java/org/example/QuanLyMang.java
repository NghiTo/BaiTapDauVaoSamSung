package org.example;

import java.util.Scanner;

public class QuanLyMang
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++)
            {
                array[j] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            for (int k = 0; k < m; k++)
            {
                String action = scanner.next();
                int position = scanner.nextInt();
                if (action.equals("insert"))
                {
                    int value = scanner.nextInt();
                    array = insertNumber(array, position, value);
                }
                else if (action.equals("update"))
                {
                    int value= scanner.nextInt();
                    updateNumber(array, position, value);
                }
                else if (action.equals("delete"))
                {
                    array = deleteNumber(array, position);
                }
            }
            System.out.print("#" + i + " ");
            printArray(array);
        }
    }

    private static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] deleteNumber(int[] array, int position)
    {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, position);
        for (int i = position; i < newArray.length; i++)
        {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }

    private static void updateNumber(int[] array, int position, int value)
    {
        array[position] = value;
    }

    private static int[] insertNumber(int[] array, int position, int value)
    {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, position);
        newArray[position] = value;
        System.arraycopy(array, position, newArray, position + 1, array.length - position);
        return newArray;
    }
}
