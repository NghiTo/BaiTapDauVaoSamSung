package org.example.String;

import java.util.Scanner;

public class ToAndFro
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            int columns = scanner.nextInt();
            if (columns == 0) break;
            scanner.nextLine();
            String inputString = scanner.nextLine();
            int rows = (int) Math.ceil((double) inputString.length() / columns);
            char[][] matrix = new char[rows][columns];
            int index = 0;
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    if (i % 2 == 0)
                    {
                        matrix[i][j] = inputString.charAt(index++);
                    }
                    else
                    {
                        matrix[i][columns - 1 - j] = inputString.charAt(index++);
                    }
                }
            }
            for (int k = 0; k < columns; k++)
            {
                for (int l = 0; l < rows; l++)
                {
                    System.out.print(matrix[l][k]);
                }
            }
            System.out.println();
        }
    }
}
