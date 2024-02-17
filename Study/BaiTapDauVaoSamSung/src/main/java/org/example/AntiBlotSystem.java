package org.example;

import java.util.Scanner;

public class AntiBlotSystem
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        try
        {
            scanner.nextLine();
            for (int i = 1; i <= testCase; i++)
            {
                String equation = scanner.nextLine();
                String[] parts = equation.split(" ");
                int result;
                int index = -1;
                for (int j = 0; j < parts.length; j++)
                {
                    if (parts[j].indexOf("machula") != -1)
                    {
                        index = j;
                        break;
                    }
                }
                if (index == 0)
                {
                    result = Integer.parseInt(parts[4]) - Integer.parseInt(parts[2]);
                    System.out.println(result + " + " + parts[2] + " = " + parts[4]);
                }
                else if (index == 2)
                {
                    result = Integer.parseInt(parts[4]) - Integer.parseInt(parts[0]);
                    System.out.println(parts[0] + " + " + result + " = " + parts[4]);
                }
                else
                {
                    result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]);
                    System.out.println(parts[0] + " + " + parts[2] + " = " + result);
                }
            }
        } catch (Exception e)
        {
        }
        scanner.close();
    }
}
