package ex2;

import java.util.Scanner;

public class readArray {
    public static void main(String[] args){
        int []arrayA = new int [10];

        readArray(arrayA);
        for(int i = 1; i < arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\n" + plusNumber(arrayA));
        System.out.println("The average: " + average(arrayA));
    }

   public static void readArray(int []array){
        Scanner insert = new Scanner(System.in);
        for (int i = 1; i < array.length; i++){
            //array[i] += i;
            System.out.println("Type a number: ");
            int num = insert.nextInt();

            array[i] += num;
        }
    }

    public static int plusNumber(int []array){
       int num1 = 0;

       for(int i = 0; i < array.length; i++){

           num1 += array[i];
       }

       return(num1);
    }

    public static int average(int array[]){
        int average;
        int num2 = 0;

        for(int i = 0; i < array.length; i++){

            num2 += array[i];
        }
        average = num2 / array.length;

        return average;
    }

    /*public static float average(float array[]){
        float average2 = 0;
        float num3 = 0;

        for(int i = 0; i < array.length; i++){

            num3 += array[i];
        }
        average2 = num3 / array.length;

        return average2;
    }*/
}
