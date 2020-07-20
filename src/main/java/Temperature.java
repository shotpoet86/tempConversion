/*Programmer: Austin Parker
* Assignment: Chapter6 / PE 6.8 / Temp Conversion
* Description: Program converts temperature in Celsius to Fahrenheit*/

public class Temperature {

    //calculation for fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5 ) * celsius + 32;
        return fahrenheit;
    }

//calculation for celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

