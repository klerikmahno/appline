package main;

import java.util.*;

public class Issues7 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        switch (number){
            case 1: System.out.println("Данное значение имеется в константах");break; // Константа X
            case 0: System.out.println("Данное значение имеется в константах");break; // Константа Y
            case 100500: System.out.println("Данное значение имеется в константах");break; // Константа Z
            default: System.out.println("Такой константы нет!");
        }
    }
}