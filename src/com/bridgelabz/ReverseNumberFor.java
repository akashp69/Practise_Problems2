package com.bridgelabz;

public class ReverseNumberFor {
    public static void main(String[] args) {
        int number = 451, reverse = 0;
        for(;number != 0;)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
