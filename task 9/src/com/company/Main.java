package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int lowercase = 0;
        int uppercase = 0;
        for ( int i =0; i < str.length(); i++){
            int ascii = str.charAt(i);
            System.out.println(ascii);
            if (ascii >= 97 && ascii <= 122 || ascii >= 65 && ascii <= 90){
                if (Character.isUpperCase(str.charAt(i))){
                    uppercase++;
                }
                else {
                    lowercase++;
                }
            }
        }
        System.out.println("Number of uppercase letters is: " + uppercase);
        System.out.println("Number of lowercase letters is: " + lowercase);
    }
}
