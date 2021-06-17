package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int choice;
    Scanner in = new Scanner(System.in);

	System.out.println("Basic Calculator \nSelect Operation to perform\n1:Add\n2:Sub\n3:Multiply\n4:Divide\n=>");
	choice = in.nextInt();
	switch(choice) {
        case 1: System.out.println("1 Selected");break;

        }
    }
}
