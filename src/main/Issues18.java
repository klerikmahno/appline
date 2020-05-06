package main;

import java.io.*;

public class Issues18 {
    public static void main(String[] args) {
        String str;
        int X = 0;
        try (BufferedReader BR = new BufferedReader(new FileReader("./src/resources/test18.txt"))) {
            while ((str = BR.readLine()) != null) {
                System.out.println(str);
                X++;
            }
        } catch (IOException err) {
            System.out.println("Ошибка ввода-вывода: " + err);
        }
        BufferedReader newBR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println('\n');
        System.out.println("Введите новые данные, количество строк должно совпадать: ");
        System.out.println("Лишние строки не будут записаны!");
        try (FileWriter FW = new FileWriter("./src/resources/test18.txt")) {
            for (int i = 0; i < X; i++) {
                str = newBR.readLine()+'\n';
                FW.write(str);
                //не понял, надо ли выводить ошибку при привышении количества строк
                //сейчас больше просто не запишешь
            }
        } catch (IOException err) {
            System.out.println("Ошибка ввода-вывода: " + err);
        }
    }
}


