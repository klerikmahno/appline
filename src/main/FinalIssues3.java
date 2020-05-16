package main;


import java.math.*;
import java.util.*;

public class FinalIssues3 {
    public static void main(String[] args) {
        System.out.println("Введите курс доллара:");
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        System.out.println("Введите количество рублей:");
        double b = console.nextDouble();
        double c = b / a;
        BigDecimal result = new BigDecimal(Double.toString(c));
        result = result.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(result + " долларов");
    }
}
