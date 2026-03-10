LEVEL 1

1. Check if a number is divisible by 5
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}



2. Check if the first number is the smallest of 3 numbers
import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
 




3. Check which number is the largest
import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
    }
}



4. Sum of n natural numbers
import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}


LEVEL 2

1. Print odd and even numbers from 1 to n
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number >= 0){
            for(int i = 1; i <= number; i++){
                if(i % 2 == 0){
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}


2. Employee bonus based on years of service
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();

        if(years > 5){
            double bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("Bonus amount = 0");
        }
    }
}



3. Multiplication table from 6 to 9
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 6; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}


LEVEL 3

1.	Using multiple if-else statements


import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year >= 1582){
            if(year % 400 == 0){
                System.out.println("Year is a Leap Year");
            }
            else if(year % 100 == 0){
                System.out.println("Year is not a Leap Year");
            }
            else if(year % 4 == 0){
                System.out.println("Year is a Leap Year");
            }
            else{
                System.out.println("Year is not a Leap Year");
            }
        }
        else{
            System.out.println("Year is not a Leap Year");
        }
    }
}


Using one if statement with logical operators
import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            System.out.println("Year is a Leap Year");
        }
        else{
            System.out.println("Year is not a Leap Year");
        }
    }
}