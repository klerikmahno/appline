package main;

import java.util.*;

public class FinalIssues2 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int arr[] = new int[x];
        if(x>0) {
            System.out.print("Введите значения массива: ");
            for (int i = 0; i < x; i++) {
                arr[i] = console.nextInt();
            }
        }else{
            System.out.println("Длина массива должна быть больше 0!");
        }
        int el, idx;
        for (int i = 0; i < arr.length; i++) {
            el = arr[i];
            idx = i;
            while (idx>0 && arr[idx-1] > el){
                arr[idx] = arr[idx-1];
                idx--;
                arr[idx] = el;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
