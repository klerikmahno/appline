package main;

import java.io.*;

public class Issues16 {
    public static void main(String[] args) {
        String S;
        try (BufferedReader BR = new BufferedReader(new FileReader("./src/resources/test.txt"))) {
            while ((S = BR.readLine()) != null) {
                System.out.println(S);
            }
        } catch (IOException err) {
            System.out.println("Ошибка ввода-вывода: "+ err);
            }
        }
    }

