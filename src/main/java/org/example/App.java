package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //password prompt
        Scanner s = new Scanner(System.in);
        System.out.println("What is the password?");
        String pass = s.nextLine();
        if((pass).equals("abc$123")){System.out.println("Welcome!");}
        else System.out.println("I don't know you");
    }
}
