package util;

public class Conversion {

    static public int calcConversion(char key, int temp) {
        if(key == 'C') {
            return ((temp * 9) / 5) + 32;
        }
        else if( key == 'F') {
            return (temp - 32) * (5 / 9);
        }
        return -1;
    }
}
