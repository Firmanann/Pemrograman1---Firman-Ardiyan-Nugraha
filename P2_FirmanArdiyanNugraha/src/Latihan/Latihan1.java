package Latihan;

import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int age;

        //Input
        System.out.println("Input Name : ");
        name = input.nextLine();

        System.out.println("Input age : ");
        age = input.nextInt();


        //Output
        System.out.println("====================");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("====================");
    }

}
