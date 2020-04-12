package firstpack;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbers[];

        System.out.println("enter size of numbers: ");
        int noSize = input.nextInt();
        numbers = new int[noSize];

        System.out.println("enter your numbers: ");
        for (int i = 0; i < noSize; i++) {
            numbers[i] = input.nextInt();
        }




    }
}



