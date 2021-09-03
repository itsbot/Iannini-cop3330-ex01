/*
 *  UCF COP3330 Fall 2021 Exercise 1 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise01;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("What is your name?\n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name + ", Nice to meet you");
    }
}
