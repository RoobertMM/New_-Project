package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        List<Integer> myNumbers = new ArrayList<>();
        int totalSum = 0;
        for (int i = 0; i <= 145; i++) {
            myNumbers.add(i);
        }
        System.out.println(myNumbers);
        System.out.println(totalSum);

        Random rand = new Random();
        myNumbers.remove(rand.nextInt(145));

        int newSum = 0;
        for (int i = 0; i < myNumbers.size(); i++) {
            newSum = myNumbers.get(i) + newSum;
        }

        System.out.println(myNumbers);
        int sumOfNumbers = CalculateNewSum(totalSum, newSum);
        System.out.println(getListOfNumbers(50));
    }

    public static int CalculateNewSum(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static List<Integer> getListOfNumbers(int limit) {
        List<Integer> myNumbersList = new ArrayList<>();
        for (int i = 1; i <= limit; i++){
            myNumbersList.add(i);
        }
        return myNumbersList;
    }
}

