import java.util.*;

public class Issues14 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner console = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String S = console.nextLine();
        result.append(S);
        result.append('\n');
        int X = Integer.parseInt(S);
        result.append(X);
        result.append('\n');
        double Y = X;
        result.append(Y);
        result.append('\n');
        System.out.println(result);
    }
}
