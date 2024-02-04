package org.example;

import java.util.Scanner;

public class AntiBlotSystem
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= testCase; i++)
        {
            String pt = scanner.nextLine();
            String[] split = pt.split(" ");
            int viTri = 0;
            for (int j = 0; j < split.length; j++)
            {
                if (split[j].equals("machula"))
                {
                    viTri = i;
                    break;
                }
            }
            int result;
            if (viTri == 0)
            {
                result = Integer.parseInt(split[4]) - Integer.parseInt(split[2]);
                System.out.println(result + " + " + split[2] + " = " + split[4]);
            }
            else if (viTri == 2)
            {
                result = Integer.parseInt(split[4]) - Integer.parseInt(split[0]);
                System.out.println(split[0] + " + " + result + " = " + split[4]);
            }
            else
            {
                result = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
                System.out.println(split[0] + " + " + split[2] + " = " + result);
            }
        }
    }
}
