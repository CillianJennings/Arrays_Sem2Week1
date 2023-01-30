package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);
        numbers.add(800);
        numbers.add(900);
        numbers.add(1000);

        for(int x = 0; x< numbers.size(); x++) {
            System.out.println("Element at Index " + x + ": " + numbers.get(x));
        }

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a value: ");
            numbers.add(input.nextInt());
            System.out.println("Result: " + numbers.get(10));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Entered a value outside the array");
        }
    }
}
