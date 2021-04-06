package Ru.GeekBrains.HomeWorkApp_1;

import java.util.Scanner;

public class HomeWorkApp_1 {

    public static void main(String[] args) {
	            printThreeWords();
                checkSumsign();
                printColour();
                compareNumbers();
            }
            public static void printThreeWords() {
                System.out.println("Orange");
                System.out.println("Banana");
                System.out.println("Apple");
            }
            public static void checkSumsign() {
                int a = 7;
                int b = 7;
                if (a * b >= 0) {
                    System.out.println("Сумма положительная");
                } else {
                    System.out.println("Сумма отрицательная");
                }
            }
            public static void printColour() {
                System.out.println("Введите число");
                Scanner scanner = new Scanner(System.in);
                int value = scanner.nextInt();
                System.out.println("value = " + value);
                if (value <= 0) {
                    System.out.println("Красный");
                } else if (value > 0 && value <= 100) {
                    System.out.println("Желтый");
                } else {
                    System.out.println("Зеленый");
                }
            }
            public static void compareNumbers() {
                int a = 10;
                System.out.println("Введите число");
                Scanner scanner = new Scanner(System.in);
                int b = scanner.nextInt();
                System.out.println("b = " + b);
                if (a >= b) {
                    System.out.println("a >=b");}
                else  {
                    System.out.println("a < b");
                }
            }

        }


