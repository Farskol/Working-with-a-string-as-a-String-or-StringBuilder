package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Please write sentence:");
        Scanner console = new Scanner(System.in);
        String X = console.nextLine();
        int numberOfSentence = 0;
        for(int i = 0; i < X.length(); i++){
            if ( X.charAt(i) == '.' || X.charAt(i) == '?' || X.charAt(i) == '!'){
                numberOfSentence++;
            }
        }
        System.out.println(numberOfSentence);
    }
}
