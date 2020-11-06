package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("please write text :");
        String str = console.nextLine();
        int n = 0;
        for (int i = 0; i < str.length(); i++){
            if ( str.charAt(i) == ' '){
                int k = 1;
                for (int j = i; ;j++){
                    if (str.charAt(j+1) == ' '){
                        k++;
                        i++;
                    }
                    else {
                        break;
                    }
                }
                if (n < k){
                    n=k;
                }
            }
        }
        System.out.print(n);
    }
}
