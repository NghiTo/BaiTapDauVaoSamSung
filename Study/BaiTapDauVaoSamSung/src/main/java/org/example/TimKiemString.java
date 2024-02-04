package org.example;

import java.util.Scanner;

public class TimKiemString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt())
        {
            int testCase = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= testCase; i++)
            {
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();
                int count = 0;
                int index = 0;
                while ((index = s2.indexOf(s1, index)) != -1)
                {
                    count++;
                    index = index + s1.length();
                }
                System.out.println("#" + i + " " + count);
            }
        }
    }
}
