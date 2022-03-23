//Task 2
package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] initialArray = {78, 35, 875, 5};
        int[] newArray = new int[4];

        for(int i=0; i<initialArray.length; i++) newArray[i]=initialArray[i];

        System.out.println("Inital array: " + Arrays.toString(initialArray));
        System.out.println("New array: " + Arrays.toString(newArray));

    }
}