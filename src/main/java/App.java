/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.
 */


import util.Conversion;
import util.Output;
import util.UsrInput;

public class App {

    public static void main(String[] args) {
        char usrInput = UsrInput.getInput();
        Output.printChoice(usrInput);
        int temp = UsrInput.getTemp(usrInput);
        int conversion = Conversion.calcConversion(usrInput, temp);
        Output.printTemperature(usrInput, conversion);
    }
}
