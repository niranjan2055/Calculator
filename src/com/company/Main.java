package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int choice;
    Scanner in = new Scanner(System.in);

	System.out.println("Basic Calculator \nSelect Operation to perform\n1:Add\n2:Sub\n3:Multiply\n4:Divide");
	choice = in.nextInt();
	switch(choice) {
        case 1: System.out.println("Addition Operation");break;
        case 2: System.out.println("Subtraction operation");break;
        case 3: System.out.println("Multiplication operation");break;
        case 4: System.out.println("Division operation");break;

        }
    }
}
