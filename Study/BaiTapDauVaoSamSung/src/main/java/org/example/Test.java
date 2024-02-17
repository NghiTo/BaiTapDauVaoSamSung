package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Nhập số cột từ người dùng
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        int rows = (int) Math.ceil((double) inputString.length() / cols);

        char[][] matrix = new char[rows][cols];

        int index = 0;
        // Đặt từng ký tự vào ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Điều chỉnh cho hàng chẵn
                if (i % 2 == 0) {
                    matrix[i][j] = inputString.charAt(index++);
                } else {
                    // Nếu là hàng lẻ, thêm từ phải sang trái
                    matrix[i][cols - 1 - j] = inputString.charAt(index++);
                }
            }
        }

        // In ma trận
        System.out.println("Ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Kết quả:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j]);
            }
        }
        scanner.close();
    }
}
