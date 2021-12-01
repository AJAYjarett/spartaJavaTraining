package com.company.Challenge_2;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static String[] sorting(String[] words, int[] lengths){
        for(int j = 0; j< lengths.length; j++){
            String temp;
            for (int k = 0; k< words.length; k ++){
                if (lengths[j] == words[k].length()){
                    temp = words[j];
                    words[j] = words[k];
                    words[k] = temp;
                    break;
                }
            }
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        System.out.println("Please input the string to sort: ");
        String lineToSort = Reader.nextLine();
        String[] sortingString = lineToSort.split(" ");
        int[] lengths = new int[sortingString.length];
        for (int i = 0; i< sortingString.length; i++){
            lengths[i] = sortingString[i].length();
        }
        Arrays.sort(lengths);
        String[] sortedWords = sorting(sortingString,lengths);
        System.out.println(sortedWords);
    }

}
