/*Programmer: Austin Parker
 * Assignment: Chapter6 / PE 6.8 / Temp Conversion
 * Description: ****Test Class*** Program converts temperature in Celsius to Fahrenheit*/

import java.text.DecimalFormat;

public class TemperatureTest {

    public static void main(String[] args) {

        //declared double for temperature standards
        double fahrenheit = 120.0, celsius = 40.0;

// formats output data
        DecimalFormat df = new DecimalFormat("#.##");
        Temperature t = new Temperature();
        System.out.println(String.format("%-10s %-15s %-10s %-13s %-10s", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius"));
        System.out.println(String.format("%s", "---------------------------------------------------------------"));

// loops 10 times then prints information
        for (int i = 0; i < 10; i++) {
            double fResult = Temperature.celsiusToFahrenheit(celsius);
            double cResult = Temperature.fahrenheitToCelsius(fahrenheit);
            System.out.println(String.format("%-10s %-15s %-10s %-13s %-10s", celsius, df.format(fResult), "|", fahrenheit, df.format(cResult)));
            celsius -= 1;
            fahrenheit -= 10;
        }

    }
}