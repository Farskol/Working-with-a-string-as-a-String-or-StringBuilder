package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
	StringBuilder str = new StringBuilder(console.nextLine());
	for (int i = 0; i < str.length(); i++){
	    if (str.charAt(i) == 'a'){
	        str.insert(i+1, 'b');
        }
    }
	System.out.print(str);
    }
}
