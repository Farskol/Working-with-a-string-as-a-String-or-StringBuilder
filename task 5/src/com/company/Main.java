package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int j = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a'){
                j++;
            }
        }
        System.out.print(j);
    }
}
