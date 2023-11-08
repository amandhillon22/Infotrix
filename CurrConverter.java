package com.mycompany.currconverter;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.json.JSONObject;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class CurrConverter {

    public static void main(String[] args) throws IOException {
        ArrayList<String> favorites = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Type Currency to convert from: ");
        String convertFrom = scan.nextLine();

        System.out.println("Do you want this Currency in your favorites list? (Y/N)");
        String addYesNo = scan.nextLine();

        if (addYesNo.equals("Y")) {
            favorites.add(convertFrom);
            System.out.println("Success!");
        } else {
            System.out.println("Currency not added");
        }
        
                System.out.println("Do you want to see your favorites list? (Y/N)");
        String viewYesNo = scan.nextLine();
        if (viewYesNo.equals("Y")) {
            System.out.println(favorites);
        } else {
            System.out.println("Thank you for using Currency Converter!");
        }

        System.out.println("Type Currency to convert to: ");
        String convertTo = scan.nextLine();

        System.out.println("Type Quantity: ");
        BigDecimal quantity = scan.nextBigDecimal();

        String urlString = "https://frankfurter.app/latest?from=" + convertFrom + "&to=" + convertTo;

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(urlString).get().build();

        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String stringResponse = response.body().string();
                JSONObject jsonObject = new JSONObject(stringResponse);
                JSONObject ratesObject = jsonObject.getJSONObject("rates");
                BigDecimal rate = ratesObject.getBigDecimal(convertTo.toUpperCase());

                BigDecimal result = rate.multiply(quantity);
                System.out.println("Converted amount: " + result);
          
            } else {
                System.err.println("HTTP request failed with code: " + response.code());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while making the HTTP request: " + e.getMessage());
        }

      
    }
}
