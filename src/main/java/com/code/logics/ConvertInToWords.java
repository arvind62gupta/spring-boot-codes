package com.code.logics;


import java.util.Scanner;

public class ConvertInToWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter any number  ");
        int n = sc.nextInt();

        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] multiple = {"", "Thousand", "Lakh"};
        String res = "";
        int group = 0;

        while (n > 0) {
            if (n % 1000 != 0) {
                int value = n % 1000;
                String temp = "";

                // code for 3-digit number
                if (value > 100) {
                    temp = units[value / 100] + " Hundred ";
                    value = value % 100;
                }
                // code for 2-digit number
                if (value >= 20) {
                    temp = temp + tens[value / 10] + " ";
                    value = value % 10;
                }
                // code for unit number
                if (value > 0) {
                    temp = temp + units[value] + " ";

                }
                temp = temp + multiple[group] + " ";
                res = temp + res;
            }
            n = n / 1000;
            group++;
        }
        System.out.println(res.trim());

    }
}
