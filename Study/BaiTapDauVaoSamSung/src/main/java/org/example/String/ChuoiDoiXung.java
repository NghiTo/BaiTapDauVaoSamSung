package org.example.String;

import java.util.Scanner;

public class ChuoiDoiXung
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= testCase; i++)
        {
            String s = scanner.nextLine();
            int count = 0;
            int length = s.length();
            for (int j = 0; j < 2 * length - 1; j++)
            {
                int l = j / 2;
                int r = l + j % 2;
                while (l >= 0 && r < length && s.charAt(l) == s.charAt(r))
                {
                    count ++;
                    l--;
                    r++;
                }
            }
            System.out.println("#" + i + " " + count);
        }
    }
}
