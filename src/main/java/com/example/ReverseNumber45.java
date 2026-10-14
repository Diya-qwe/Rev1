package com.example;

public class ReverseNumber45 {

    public int reverse(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        ReverseNumber45 obj = new ReverseNumber45();

        int number = 12345;

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + obj.reverse(number));
    }
}