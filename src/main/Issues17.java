package main;
import java.io.*;

public class Issues17 {
    public static void main(String[] args) {
        String S;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Запись данных завершится введение слова 'stop'");
        try (FileWriter FW = new FileWriter("./src/resources/test17.txt")){
            do{
                S = BR.readLine();
                if(S.compareTo("stop") == 0 ) {
                    break;
                }else{
                        S = S + '\n';
                        FW.write(S);
                    }
                }
            while (S.compareTo("stop") != 0);
            }
        catch (IOException error){
            System.out.println("Ошибка ввода-вывода: "+ error);
        }
    }
}
