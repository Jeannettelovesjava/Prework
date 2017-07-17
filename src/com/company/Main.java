package com.company;

import java.util.Scanner;

public class Main{
	public static void main(String args[]) {

		//input number
		System.out.println("True/False");
		System.out.println("Enter a three digit number to find out if it's an Armstrong # : ");
        Scanner scan = new Scanner(System.in);

        int userNum = scan.nextInt();

		if (userNum == 153 || userNum == 370 || userNum == 371 || userNum == 407) {

			System.out.println("Number : " + userNum + " is True ");

		}else {
		System.out.println("Number : " + userNum + " is False "); } }}