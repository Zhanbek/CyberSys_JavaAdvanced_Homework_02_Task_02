import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

    private static String doubleAllSymbolsOfString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            stringBuffer.append(str.charAt(i));
            stringBuffer.append(str.charAt(i));
        }
        return stringBuffer.toString();
    }

    private static List<String> doubleValues(List<String> list) {
        List <String> newList = new ArrayList<>(list.size());
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String currentValue = iterator.next();
            newList.add(doubleAllSymbolsOfString(currentValue));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введіть 5 слів до списку рядків");
        for (int i = 0; i < 5; i++) {
            try {
                String value = bufferedReader.readLine();
                list.add(value);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        List<String> result = doubleValues(list);

        System.out.println("Результат виконання функції doubleValues: ");
        Iterator<String> iterator = result.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}