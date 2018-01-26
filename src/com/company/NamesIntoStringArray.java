package com.company;

import java.util.Scanner;

public class NamesIntoStringArray {

    Scanner source = new Scanner(System.in);


    public void stringToArray() {

        System.out.println("Please tell me length of names array. Please enter integer number: ");
        int x = source.nextInt();
        System.out.println();

        String[] namesArray = new String[x];

        String s1 ="";

        for (int i = 0; i < namesArray.length; i++) {

            System.out.println("Please enter the name: ");

            namesArray[i] = source.nextLine();
            s1 = s1 + namesArray[i] + " ";


        }


        System.out.println(s1);



    }
}
