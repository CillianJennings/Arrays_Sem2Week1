package ie.atu;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] array;
        array = new int[10];

        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000;

        for(int x = 0; x< array.length; x++) {
            System.out.println("Element at Index " + x + ": " + array[x]);
        }

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a value: ");
            array[10] = input.nextInt();
            System.out.println("Result: " + array[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Entered a value outside the array");
        }


    }

}
