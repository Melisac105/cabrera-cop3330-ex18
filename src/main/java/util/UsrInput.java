package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);
    static public char getInput() {
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit ");
        char key = input.next().charAt(0);
        return Character.toUpperCase(key);
    }

    static public int getTemp(char key) {
        if(key == 'C') {
            System.out.print("Please enter the temperature in Celsius: ");
            return input.nextInt();
        }
        else if( key == 'F') {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            return input.nextInt();
        }
        return -1;
    }
}
