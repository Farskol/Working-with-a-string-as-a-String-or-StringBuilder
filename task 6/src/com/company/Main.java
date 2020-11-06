package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringBuilder str = new StringBuilder(console.nextLine());
        StringBuilder str2 = new StringBuilder(str);
        str2.ensureCapacity(str.length()*2);
        for (int i = 0; i < str.length(); i++){
            str2.insert(i+1+i,str.charAt(i));
        }
        System.out.print(str2);
    }
}
