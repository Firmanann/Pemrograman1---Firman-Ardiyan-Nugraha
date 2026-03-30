package tugas;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double suhuCelcius;
        double fahrenheit;
        double kelvin;


        //Statement 1
        System.out.println("===== Konverter Nilai Suhu Celcius - Kelvin dan Farenheit =====");
        System.out.println("Masukkan Suhu Celcius");
        suhuCelcius = input.nextFloat();

        //Proses
        fahrenheit = suhuCelcius * 9/5 + 32;
        kelvin = suhuCelcius + 273.15;

        //Statement 2
        System.out.println("Suhu Celcius : " + suhuCelcius);
        System.out.println("Suhu Celcius konvert ke Fahrenheit : " + fahrenheit);
        System.out.println("Suhu Celcius konvert ke Kelvin : " + kelvin);


    }
}
