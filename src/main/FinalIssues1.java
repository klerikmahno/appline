package main;

import java.util.*;

public class FinalIssues1 {
    public static void main(String[] args) {
        System.out.println("Введите число в двоичной системе:");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        double b = 0;
        int count = 0;
        while (a > 0 ){
            if(a%10 == 1 || a%10 == 0){
                b = b + (a%10 * (Math.pow(2,count)));
                a = a/10;
                count++;
            }else{
                b = 0;break;
            }
        }
        if(a!=0 && b==0){
            System.out.println("Число не в двоичной системе!");
        }else {
            int result = (int) b;
            System.out.println(result);
        }
    }
}
