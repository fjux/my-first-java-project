package se.lexicon.erikalfredsson;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtendedExercises {

    public static void main(String[] args){

    }

    public static void exercise3A(){
        int[] numbers = {45, 11, 12, 4, 24, 6, 55, 12};
        int result1 = numbers[0] + numbers[1];
        System.out.println(numbers[0] + " + " + numbers[1] + " = " + result1);

        int result2 = numbers[2] - numbers[3];
        System.out.println(numbers[2] + " - " + numbers[3] + " = " + result2);

        int result3 = numbers[4] * numbers[5];
        System.out.println(numbers[4] + " * " + numbers[5] + " = " + result3);

        int result4 = numbers[6] / numbers[7];
        System.out.println(numbers[6] + " / " + numbers[7] + " = " + result4);


    }

    public static void exercise3AL() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(11);
        numbers.add(12);
        numbers.add(4);
        numbers.add(24);
        numbers.add(6);
        numbers.add(55);
        numbers.add(12);



        int result1 = numbers.get(0) + numbers.get(1);
        System.out.println(numbers.get(0) + " + " + numbers.get(1) + " = " + result1);

        int result2 = numbers.get(2) - numbers.get(3);
        System.out.println(numbers.get(2) + " - " + numbers.get(3) + " = " + result2);

        int result3 = numbers.get(4) * numbers.get(5);
        System.out.println(numbers.get(4) + " * " + numbers.get(5) + " = " + result3);

        int result4 = numbers.get(6) / numbers.get(7);
        System.out.println(numbers.get(6) + " / " + numbers.get(7) + " = " + result4);


        numbers.add(67);
        int result5 = numbers.get(8) + numbers.get(8);
        System.out.println(numbers.get(8) + " + " + numbers.get(8) + " = " + result5);

        System.out.println("Enter a number, and I will multiply it by itself!");
        numbers.add(input.nextInt());

        int result6 = numbers.get(9) * numbers.get(9);

        System.out.println(numbers.get(9) + " * " + numbers.get(9) + " = " + result6);

    }
}

