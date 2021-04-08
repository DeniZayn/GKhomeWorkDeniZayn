package Ru.GeekBrains.HomeWorkApp_2;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(switchVariableToTrue());
        isPositiveOrNegative();
        System.out.println(isNegative());
        printWordNTimes();
        System.out.println(detectLeapYear(2005));
    }

    public static boolean switchVariableToTrue() {
        boolean c = false;
        int a = 10;
        int b = 11;
        int d = a + b;
        if (d >= 10 && d <= 20) {
            c = true;
        } else {
            c = false;
        }
        return c;
    }

    public static void isPositiveOrNegative() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x <= 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    
    public static boolean isNegative() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("BigfootActuallyReal");
            if (i == 3) ;
        }
    }

    public static boolean detectLeapYear(int year) {

        boolean leap = false;

        if (year % 4 == 0 && year % 400 == 0) {
            leap = true;    }
        else if (year % 100 == 0) {
            leap = false;   }
        else {
            leap = false;  }
        return leap;
    }
}













 //       {
 //   if (a > 0) {
 //   return a + recursiveMethod (a - 1);}
 //   else {
 //       return 0;}








