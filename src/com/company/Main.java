package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan_x = new Scanner(System.in);
	    int x = scan_x.nextInt();

	    Scanner scan_y = new Scanner(System.in);
	    int y = scan_y.nextInt();

	    Scanner scan_z = new Scanner(System.in);
	    int z = scan_z.nextInt();

	    int avg = (x + y + z)/3;
        System.out.println(avg);

        int half = avg/2;
		System.out.println(half);

        if (half > 3){
			System.out.println("Программа выполнена корректно");
		}
    }
}
