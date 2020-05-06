import java.util.*;

public class Issues15 {
    public static void main(String[] args) {
        System.out.println("Введите цифры в масcив через пробел: ");
        Scanner console = new Scanner(System.in);
        String[] a = console.nextLine().split(" ");
        int[] b = new int[a.length];
        for (int i = b.length-1; i >= 0; i--) {
            b[i] = Integer.parseInt(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length-1; j++) {
                if(b[j+1]<b[j]){
                    int temp = b[j+1];
                    b[j+1] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
