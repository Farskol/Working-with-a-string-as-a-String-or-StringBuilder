package com.company;

public class Main {

    public static void main(String[] args) {
	String informatics = "информатика";
	String Pie = "торт";
	String newPie = "";
	for (int i = 0; i < Pie.length(); i++){
	    for (int j = 0; j < informatics.length(); j++){
            if (informatics.charAt(j) == Pie.charAt(i)){
                newPie += informatics.charAt(j);
                break;
            }
        }
    }
	System.out.print(newPie);
    }
}
