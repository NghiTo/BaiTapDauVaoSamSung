package org.example.String;

import java.util.Scanner;

public class TimKiemString
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int testCase, count, index;
        String s1, s2;
        boolean isExist;
        do
        {
            testCase = scanner.nextInt();
            scanner.nextLine();
            s1 = scanner.nextLine();
            s2 = scanner.nextLine();
            count = 0;
            index = 0;
            for (int i = 0; i <= s2.length() - s1.length(); i++)
            {
                isExist = true;
                for (int j = 0; j < s1.length(); j++)
                {
                    if (s1.charAt(j) != s2.charAt(i + j))
                    {
                        isExist = false;
                        break;
                    }
                }
                if (isExist)
                {
                    count++;
                }
            }
            System.out.println("#" + testCase + " " + count);
        }
        while (testCase < 10);
        scanner.close();
    }
}