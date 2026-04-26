package tugas;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username;
        String email;
        int pin;

        //Input
        System.out.println("Input Username : ");
        username = input.nextLine();

        System.out.println("Input Email : ");
        email = input.nextLine();

        System.out.println("Input PIN 6 Digit (Angka) : ");
        pin = input.nextInt();


        //Output
        System.out.println("Username : " + username);
        System.out.println("Email    : " + email);
        System.out.println("PIN      : " + pin);
    }

}