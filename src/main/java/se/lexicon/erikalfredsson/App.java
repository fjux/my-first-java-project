package se.lexicon.erikalfredsson;

import java.util.Scanner;


public class App 
{


    public static void main( String[] args ) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
    }

    public static void exercise1(){
        System.out.println("Hello");
        System.out.println("Erik!");
    }
    public static void exercise2() {
        Scanner objOne = new Scanner(System.in);

        System.out.println("Enter year");

        int year = objOne.nextInt();

        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            } else
                leap = true;
        } else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    public static void exercise3() {

        int number1 = 45;
        int number2 = 11;
        int number3 = 12;
        int number4 = 4;
        int number5 = 24;
        int number6 = 6;
        int number7 = 55;
        int number8 = 12;

        int result1 = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result1);

       int result2 = number3 - number4;
        System.out.println(number3 + " - " + number4 + " = " + result2);

       int result3 = number5 * number6;
        System.out.println(number5 + " * " + number6 + " = " + result3);

       int result4 = number7 / number8;
        System.out.println(number7 + " / " + number8 + " = " + result4);

    }
        public static void exercise4() {


        double number1 = 20;
        double number2 = 30;
        double number3 = 40;

        System.out.println((number1 + number2 + number3) / 3);
    }
    public static void exercise5() {
        Scanner name = new Scanner(System.in);

        System.out.println("Enter your name");

        String username = name.next();
        System.out.println("Hello " + username);

    }
    public static void exercise6() {

        int number1, number2, result1, result2, result3, result4;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number");

        number1 = input.nextInt();

        System.out.println("Enter another number");

        number2 = input.nextInt();

        result1 = number1 + number2;
        result2 = number1 - number2;
        result3 = number1 * number2;
        result4 = number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + result1);
        System.out.println(number1 + " - " + number2 + " = " + result2);
        System.out.println(number1 + " * " + number2 + " = " + result3);
        System.out.println(number1 + " / " + number2 + " = " + result4);
    }

    public static void exercise7(){

       int input = 86399;
       int hours = input / 3600;
       input %= 3600;
       int minutes = input / 60;
       input %= 60;
       int seconds = input;

       System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void exercise8() {
        int secretNumber;
        secretNumber = (int) (Math.random() * 499 + 1);
        Scanner input = new Scanner(System.in);
        int guess;
        int numberOfGuesses = 0;

        do {
            System.out.println("Enter a guess: ");
            guess = input.nextInt();
            numberOfGuesses++;
            System.out.println("Your guess is " + guess);
            System.out.println( "Number of guesses: " + numberOfGuesses);

            if (guess == secretNumber) {
                System.out.println("Congratulations!");
                System.out.println("You guessed the right number!");
            }
            if (guess < secretNumber) {
                System.out.println("Go higher!");
            }
            if (guess > secretNumber) {
                System.out.println("Go lower!");
            }
        } while (guess != secretNumber);
    }
}

