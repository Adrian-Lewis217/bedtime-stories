package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which story would you like to read: ");
        String story = input.nextLine();

        try {
            BufferedReader bedtimeStories = new BufferedReader(new FileReader(story));

            while ((story = bedtimeStories.readLine()) != null) {
                System.out.println(story);
            }

            bedtimeStories.close();
            input.close();

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
