import java.util.*;

public class Issues10 {
    public static void main(String[] args) {
        System.out.print("Введите коллчиество и длину строк массива: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int arr[][] = new int[x][y];
        System.out.println("Введите значения массива: ");
        for(int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                arr[i][j] = console.nextInt();
            }
        }
        System.out.print("Значения строки 1 умноженные на 3: ");
        for(int i = 0;i<y;i++){
            System.out.print(arr[0][i] * 3+" ");
        }
    }
}
