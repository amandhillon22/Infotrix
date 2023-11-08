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
