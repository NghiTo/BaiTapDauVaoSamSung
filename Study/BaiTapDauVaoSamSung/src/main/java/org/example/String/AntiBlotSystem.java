package org.example.String;

import java.util.Scanner;

public class AntiBlotSystem
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String s;
        int s1, s2, s3;
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++)
        {
            s = scanner.next();
            s1 = stringToInteger(s);

            s = scanner.next();

            s = scanner.next();
            s2 = stringToInteger(s);

            s = scanner.next();

            s = scanner.next();
            s3 = stringToInteger(s);

            if (s1 == -1)
            {
                s1 = s3 - s2;
            }
            else if (s2 == -1)
            {
                s2 = s3 - s1;
            }
            else
            {
                s3 = s1 + s2;
            }
            System.out.println(s1 + " + " + s2 + " = " + s3);
        }
        scanner.close();
    }

    public static int stringToInteger(String s)
    {
        int temp = 0;
        char digit;
        for (int i = 0; i < s.length(); i++)
        {
            digit = s.charAt(i);
            if (digit == 'm')
            {
                return - 1;
            }
            temp = temp * 10 + digit - '0';
        }
        return temp;
    }
}
