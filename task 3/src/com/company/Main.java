package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        boolean flag = true;
        for (int i = 0; i <= str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.print("it is palindrome");
        }
        else {
            System.out.print("it is not palindrome");
        }
    }
}
