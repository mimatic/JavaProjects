package com;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    // always static
    // void doesn't return anything
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        Mortage Calculator:
            Takes in Principal, Annual Interest Rate, and Number of years
            Calculates Mortage with generic Mortage forumala
         */

        int MONTHS_IN_YEARS = 12;
        int PERCENT = 100;

        int principal;
        while (true) {
            System.out.print("Enter a number between 1,000 and 1,000,000\nPrincipal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
        }

        float annualInterestRate;
        while (true) {
            System.out.print("Enter a value greater than 0 or less than or equal to 30\nAnnual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30)
                break;
        }


        int years;
        while (true) {
            System.out.print("Enter a value greater than 0 or less than or equal to 30\nPeriod (Years): ");
            years = scanner.nextInt();
            if (years > 0 && years <= 30)
                break;
        }

        float monthyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEARS;
        double numberOfPayments = (double) years * MONTHS_IN_YEARS;
        float factor = (float) Math.pow((1 + monthyInterestRate), numberOfPayments);

        float mortage = (principal * monthyInterestRate * factor)
                / ((factor) - 1);

        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);

        // Output
        System.out.println("Mortage: " + formattedMortage);


        /* Arrays

        int[] numbers = {2,3,4,5,1,4};

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Multi-dimensional Arrays

        // two rows & three columns
        int[][] nums = { {1, 2, 3}, { 4, 5, 6}};
        nums[0][0] = 1;

        System.out.println("Multi-deminsional Arrays: " + Arrays.deepToString(nums));

        // Constants

        // final - can't change value of variable
        final float pi = 3.14F;

        int result = (int)Math.round((double)Math.random() * 100);
        System.out.println(result);

        // Formating numbers

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You ae " + name);


         */
        /*
        Scanner scanner = new Scanner(System.in);

        final byte MONTHS_IN_YEAR = 12;

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate (%): ");
        double annualRatePercent = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        int payments = years * MONTHS_IN_YEAR;
        double monthlyRate = (annualRatePercent / 100.0) / 12.0;

        double factor = Math.pow(1 + monthlyRate, payments);
        double mortgage = principal * monthlyRate * factor / (factor - 1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

         */

        /* Solution from Mosh

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int payments = years * MONTHS_IN_YEAR;

        double mortage = principal
                * (monthlyInterestRate * Math.pow( (1 + monthlyInterestRate), payments))
                / (Math.pow((1 + monthlyInterestRate), payments) - 1);

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: " + mortageFormatted);

         */

        // Conditional Statements

        // <= , >= , != , ==
        /*Scanner scanner = new Scanner(System.in);


        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);

        System.out.print("What's today's temperature? ");
        int temperature = scanner.nextInt();

        final int HOT = 30;
        final int WARM = 20;

        boolean isWarm = temperature >= WARM;
        boolean isHot = temperature > HOT;
        boolean isCold = temperature < WARM;

        if (isHot)
            System.out.println("It's a hot day\nDrink Plenty of Water");
        else if (isWarm)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");


        System.out.println(isWarm);





        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);

        System.out.println(hasHighIncome);

        int income = 120_000;

        String className = income > 100_000 ? "First" : "Economy";

        System.out.println(className);


        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("admin");
                break;

            case "moderator":
                System.out.println("moderator");
                break;

            default:
                System.out.println("guest");


        }




        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("Fizzbuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);




        for (int i = 5; i > 0; i--) {
            System.out.println("Hello World " + i);
        }

        System.out.println("");

        int i = 5;
        while (i > 0) {
            System.out.println("Hello World " + i);
            i--;
        }



        String input = "";

        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }


        String input = "";
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        String input = "";

        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if  (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }



        String[] fruits = {"apple", "mango", "organe"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);


        for (String fruit : fruits)
            System.out.println(fruit);


         */
    }

}