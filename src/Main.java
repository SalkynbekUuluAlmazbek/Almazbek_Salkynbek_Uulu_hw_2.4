import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Введите строки для списка А:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Строка  " + (i + 1) + ": ");
            listA.add(sc.nextLine());
        }
        System.out.println("А:");
        for (String str : listA) {
            System.out.println(str);
        }
        System.out.println();


        System.out.println("Введите строки для списка Б:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Строка  " + (i + 1) + ": ");
            listB.add(sc.nextLine());
        }
        System.out.println("Б:");
        for (String str1 : listB) {
            System.out.println(str1);
        }
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Список C: " + listC);

        System.out.println();

        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Отсортированный список С: " + listC);
    }
}