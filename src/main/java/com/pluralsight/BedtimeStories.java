package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            BufferedReader bedtimeStories = new BufferedReader(new FileReader(String.valueOf(input)));

            System.out.print("Which story would you like to read: ");
            String story = input.nextLine();

            while ((story = bedtimeStories.readLine()) != null) {
                System.out.println(story);
            }

            bedtimeStories.close();
            input.close();

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        //prompt the user for the name/file of story to read


    }
}
