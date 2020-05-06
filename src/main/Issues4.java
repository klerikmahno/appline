package main;

import java.util.*;

public class Issues4 {
    public static void main(String[] args) {
        System.out.println("Введите число в двоичной системе:");
        Scanner console = new Scanner(System.in);
        String a = console.next();
        int result = Integer.parseInt(a, 2);
        System.out.println(result);
    }
}