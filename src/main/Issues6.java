package main;

import java.util.*;

public class Issues6 {
    public static void main(String[] args) {
        System.out.println("Введите три числа:");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        double E = (double)(x+y+z)/3; // Cреднее арифметическое необязательно целое
        System.out.println("Cреднее арифметическое чисел x, y, z: "+ E);
        int result = (int)E / 2; // Делим без остатка
        if(result > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}