import java.util.*;

public class Issues9 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        if(x>0){
            int ar1[] = new int[x];
            System.out.print("Введите значения массива: ");
            for(int i = 0;i<x;i++){
            ar1[i]= console.nextInt();
            }
            System.out.print("Значения массива умноженные на 2: ");
            for(int j = 0;j<x;j++) {
               System.out.print(ar1[j] * 2 + " ");
            }
        }else{
            System.out.print("Длина массива должна быть больше 0!");
            }
    }

}

