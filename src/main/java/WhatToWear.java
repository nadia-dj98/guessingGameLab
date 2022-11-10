import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {
        String weather = "";
        byte temperature = 0;

        //prompt 1
        System.out.println("What's the weather like today?");

        //user input 1
        Scanner q1 = new Scanner(System.in);
        weather = q1.nextLine();

        //prompt 2
        System.out.println("What's the temperature like today?");
//
//        //user input 2
        Scanner q2 = new Scanner(System.in);
        temperature = q2.nextByte();
//
//
        //if else statements

        if (weather.equals("rainy") && temperature < 12 ) {
            System.out.println("Wear a winter coat and bring an umbrella!");
        }
        else if (weather.equals("sunny") || temperature > 25) {
            System.out.println("Leave that jacket at home!");
        }
        else if (weather.equals("snowing") && temperature < 0) {
            System.out.println("Wear 500 layers or stay at home!");
        }
        else {
            System.out.println("figure it out yourself!");
        }
//
    }
}
