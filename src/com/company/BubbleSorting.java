package com.company;


public class BubbleSorting {

    int[] intArray = {13, 3, 12, 5, 6, 7, 22, 7, 15};
    int n = intArray.length;


    public void showTheArray() {


        int helpNoFirst = 0;
        int helpNoSecond = 0;


        System.out.println("This is your array after bubble sorting algorithm: ");
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < n; i++) {

                if (intArray[i - 1] > intArray[i]) {
                    helpNoFirst = intArray[i - 1];
                    helpNoSecond = intArray[i];

                    intArray[i - 1] = helpNoSecond;
                    intArray[i] = helpNoFirst;
                    //System.out.println("This is your swapped array " + intArray[i - 1]);
                    //System.out.println("This is your swapped array " + intArray[i]);

                } else {

                    helpNoFirst = intArray[i - 1];
                    helpNoSecond = intArray[i];

                    intArray[i - 1] = helpNoFirst;
                    intArray[i] = helpNoSecond;
                    //System.out.println("This is your swapped array " + intArray[i]);
                    //System.out.println("This is your swapped array " + intArray[i - 1]);
                }

            }
            //System.out.println("It is your array after bubble sorting algorithm: ");
            System.out.print(intArray[j] + " ");

        }
    }
}