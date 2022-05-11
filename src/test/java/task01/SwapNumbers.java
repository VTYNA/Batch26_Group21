package task01;

import java.util.Scanner;

        //Numbers - Swap Numbers
       // Swap two variable' values without using a third variable


public class SwapNumbers {

    public static void main(String arr[])


    {
        System.out.println("Enter variable 1 and variable 2");
        Scanner input = new Scanner(System.in);
        int variable1 = input.nextInt();
        int variable2 = input.nextInt();
        System.out.println("before "+ variable1 +" "+ variable2);
        variable1 = variable1 + variable2;
        variable2 = variable1 - variable2;
        variable1 = variable1 - variable2;
        System.out.println("After: "+ variable1 + " " + variable2);
    }


}
