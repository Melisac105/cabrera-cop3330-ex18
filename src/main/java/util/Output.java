package util;

public class Output {

    static public void printChoice(char key) {
        System.out.printf("Your choice: %c\n", key);
    }

    static public void printTemperature(char key, int finalTemp) {
        if(key == 'C') {
            System.out.printf("The temperature in Fahrenheit is %d", finalTemp);
        }
        else if( key == 'F') {
            System.out.printf("The temperature in Celsius is %d", finalTemp);
        }
    }
}
