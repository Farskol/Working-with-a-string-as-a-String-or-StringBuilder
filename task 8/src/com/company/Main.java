package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int j = 0;
        int size = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ' || i == str.length()-1){
                if (j > size ){
                    size = j;
                    index = i - j;
                    j=0;
                }
            }
            else {
                j++;
            }
        }
        for (int i = index; i <= index+size; i++){
            System.out.print(str.charAt(i));
        }
    }
}
