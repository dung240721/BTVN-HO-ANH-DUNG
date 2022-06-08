package com.example.application;

public class ApplicationAlient {
    public static void main(String[] args) {
        int[][] intArray = new int[2][3];

        for(int row = 0; row < 2; row++){
            for(int col=0; col < 3; col++){
                System.out.println("inArray["+row+"," + col +"] =" +intArray[row][col]);

            }
        }
    }
}
