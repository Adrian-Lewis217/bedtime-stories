package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(input)));


        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        //prompt the user for the name/file of story to read


    }
}
