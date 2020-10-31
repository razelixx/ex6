package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
	    double x = scan.nextInt();
		double y = scan.nextInt();
		double z = scan.nextInt();

		double avg = (x + y + z)/3;
//        System.out.println(avg);

		double half = Math.floor(avg/2);
//		System.out.println(half);

        if (half > 3){
			System.out.println("Программа выполнена корректно");
		}
    }
}
