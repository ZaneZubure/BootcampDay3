package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] multipTable = new int[10][10];
        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                multipTable[i][j] = (j+1)*(i+1);
            }
        }

        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.println((i+1) + " * " + (j+1) + " = " + multipTable[i][j]);
            }
        }

    }
}