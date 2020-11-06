package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringBuilder str = new StringBuilder(console.nextLine());
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                str.deleteCharAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(j) == str.charAt(i)){
                    str.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.print(str);
    }
}
