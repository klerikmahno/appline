import java.util.*;

public class Issues13 {
    public static void main(String[] args) {
        System.out.print("Введите строку #1: ");
        Scanner console = new Scanner(System.in);
        String x = console.nextLine();
        System.out.print("Введите строку #2: ");
        String y = console.nextLine();
        if(x.length() == y.length()){
            System.out.println("Строки равной длины!");
        }else if (x.length()>y.length()){
            System.out.println(x);
        }else {
            System.out.println(y);
        }
    }
}
