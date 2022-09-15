package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        HashMap<Integer, String> currencyCode = new HashMap<Integer, String>();

        // add currency codes.

        currencyCode.put(1, "USD");
        currencyCode.put(2, "EUR");
        currencyCode.put(3, "AUD");
        currencyCode.put(4, "CAD");
        currencyCode.put(5, "JMD");
        currencyCode.put(6, "NGN");
        currencyCode.put(7, "CNY");
        currencyCode.put(8, "JPY");
        currencyCode.put(9, "AED");
        currencyCode.put(10, "GBP");

        String fromCode, toCode;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the currency converter!");

        System.out.println("Currency to convert FROM?");

        System.out.println("1:USD \t 2:EUR \t 3:AUD \t 4:CAD  \t 5:JMD \t 6:NGN \t 7:CNY  \t 8:JPY  \t 9:AED  \t 10:GBP");



    }
}
