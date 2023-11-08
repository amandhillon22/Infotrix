Currency Converter in Java using API
Currency Converter

This project is a simple yet powerful Currency Converter tool implemented in Java. It allows users to convert currencies from one to another using the latest exchange rates obtained from the "frankfurter" API. Additionally, it provides an option to manage a favorites list of currencies for quick access.

Features
1. Currency Conversion
Users can specify the currency they want to convert from and to.
Enter the amount of the source currency you want to convert.
The application fetches the latest exchange rates from the "frankfurter" API and performs the conversion.
2. Favorites List
Users have the option to add their favorite currencies to a list.
They can view their favorite currencies at any time.
This feature allows for quick access to frequently used currencies.
How to Use
Run the program, and it will prompt you to enter the currency you want to convert from.
Optionally, you can choose to add this currency to your favorites list.
If added to your favorites, you can view your favorite currencies at any time.
Next, enter the currency you want to convert to and the quantity you wish to convert.
The program will fetch the latest exchange rates and display the converted amount.
Technologies Used
OkHttp: Used to make HTTP requests to the "frankfurter" API.
JSON: Utilized for parsing the JSON response from the API.



Here's a list of the commands used in your project with a brief description of each:

javac CurrConverter.java - Compiles the Java source code in the CurrConverter.java file, creating the bytecode class file.

java CurrConverter - Executes the Java program by running the CurrConverter class, which contains the main method.

Scanner scan = new Scanner(System.in) - Creates a Scanner object to read input from the command line.

scan.nextLine() - Reads the next line of text input from the user.

ArrayList<String> favorites = new ArrayList<>() - Initializes an ArrayList to store favorite currencies.

convertFrom = scan.nextLine() - Stores the currency to convert from, which is input by the user.

convertTo = scan.nextLine() - Stores the currency to convert to, which is input by the user.

quantity = scan.nextBigDecimal() - Reads a BigDecimal value representing the quantity of the source currency to convert.

OkHttpClient client = new OkHttpClient() - Creates an instance of the OkHttp client for making HTTP requests.

Request request = new Request.Builder().url(urlString).get().build() - Constructs an HTTP request using OkHttp, specifying the URL and request method (GET).

Response response = client.newCall(request).execute() - Executes the HTTP request and stores the response.

response.isSuccessful() - Checks if the HTTP request was successful (status code 200).

response.body().string() - Retrieves the response body as a string.

JSONObject jsonObject = new JSONObject(stringResponse) - Parses the JSON response string into a JSONObject.

JSONObject ratesObject = jsonObject.getJSONObject("rates") - Extracts the "rates" object from the JSON response.

ratesObject.getBigDecimal(convertTo.toUpperCase()) - Retrieves the exchange rate for the target currency.

rate.multiply(quantity) - Calculates the converted amount by multiplying the rate with the quantity.

System.out.println("Converted amount: " + result) - Displays the converted amount to the user.

System.err.println("HTTP request failed with code: " + response.code()) - Prints an error message in case of an unsuccessful HTTP request.

System.err.println("An error occurred while making the HTTP request: " + e.getMessage()) - Prints an error message when an exception occurs during the HTTP request.
