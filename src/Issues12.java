import java.util.*;

public class Issues12 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String x = console.nextLine();
        String result = x.replace(" ","");
        System.out.println(result);
    }
}
