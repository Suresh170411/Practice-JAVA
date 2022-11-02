package Recursion;

import java.util.Scanner;

public class Recursion {

    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");    // printing nubmers in REVERSE using RECURSION..
        printNum(n-1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printNum(n);  // calling out the RECURSIVE function/method
    }
}
