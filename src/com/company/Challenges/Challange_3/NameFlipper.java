package com.company.Challenges.Challange_3;

import java.util.Scanner;

public class NameFlipper {

    /*
    This method flips the first and second name round.
    It does this by identifying the space between the names and separating the string based on that
    Then if puts them back together in the opposite way with a new space in the middle
     */
    public static String flipNames(String names){
        int pivot = names.indexOf(" ");
        String name1 = names.substring(0,pivot);
        String name2 = names.substring(pivot+1);
        String flippedNames = name2 + " " + name1;
        return flippedNames;
    }


    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        System.out.println("Please Input names 1 and 2");
        String namesToFlip = Reader.nextLine();
        String resultingNames = flipNames(namesToFlip);
        System.out.println(resultingNames);
    }
}
