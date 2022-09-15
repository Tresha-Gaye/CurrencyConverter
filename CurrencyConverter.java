package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class CurrencyConverter {

    public static void main(String[] args) {

        Map<Integer, String> currency = new HashMap<Integer, String>();

        // add currency codes.

        currency.put(1, "USD");
        currency.put(2, "EUR");
        currency.put(3, "AUD");
        currency.put(4, "CAD");
        currency.put(5, "JMD");
        currency.put(6, "NGN");
        currency.put(7, "CNY");
        currency.put(8, "JPY");
        currency.put(9, "AED");
        currency.put(10, "GBP");

        String fromCode, toCode;
        double amount;

        Scanner scan = new Scanner(System.in);

        System.out.println("Use this Converter on the following currencies " + currency + " !");

        System.out.println("Currency to convert FROM?");

        System.out.println("1:USD \t 2:EUR \t 3:AUD \t 4:CAD  \t 5:JMD \t 6:NGN \t 7:CNY  \t 8:JPY  \t 9:AED  \t 10:GBP");

        fromCode = currency.get(scan.nextInt());

        System.out.println("Currency to convert TO?");

        System.out.println("1:USD \t 2:EUR \t 3:AUD \t 4:CAD  \t 5:JMD \t 6:NGN \t 7:CNY  \t 8:JPY  \t 9:AED  \t 10:GBP");

        toCode = currency.get(scan.nextInt());

        System.out.println("Amount you wish to convert?");

        amount = scan.nextFloat();

//

        System.out.println("Thanks for using currency converter!");

    }

    private void sendHttpGETRequest(String fromCode, String toCode, double amount) throws IOException {
        String GET_URL = "https://api.exchangeratesapi.io/latest?base=" + toCode + "&symbols=" + fromCode;
        URL url = new URL(GET_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");

        int responseCode = httpURLConnection.getResponseCode();

        if(responseCode==HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            } in.close();
        }
    }
}
