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


    void SelSort(int arr[]) {
        int MinIndex, temp;
        for (int i = 0; i < arr.length; i++) {
            MinIndex = i;


            for (int j = 1; j < arr.length; j++) {
                if (arr[MinIndex] > arr[j]) {
                    MinIndex = j;
                }
                temp = arr[i];
                arr [i] = arr [MinIndex];
                arr [MinIndex] = temp ;

            }
        }

    }

    void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }


}





