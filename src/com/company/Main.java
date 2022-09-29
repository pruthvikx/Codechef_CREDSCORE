package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int credScore = scan.nextInt();
        System.out.println(credScore >= 750 ? "YES" : "NO");
    }
}
