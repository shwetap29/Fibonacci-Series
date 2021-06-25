package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series = [0,1,1,2,3,5,8,13]");
        int[] arr = new int[]{2,4,8,10,12,14,18,20};
        int indexValue1 =0;
        int indexValue2 =1;
        int indexValue3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for (int i =0; i< arr.length; i++){
            indexValue3 = indexValue1+ indexValue2;
            if (indexValue3 > arr.length){
                break;
            }
            System.out.println(arr[indexValue3] + " ");
            indexValue1 = indexValue2;
            indexValue2 = indexValue3;
        }
    }
}