package com.example.task14;

public class Task14 {
    public static int reverse(int value) {
        String str = new StringBuilder(String.valueOf(value)).reverse().toString();
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }
}
