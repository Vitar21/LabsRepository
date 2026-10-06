import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи длину массива: ");
        int listSize = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            System.out.println("Введите элемент массива: ");
            numbers.add(scanner.nextInt());
        }

        Sorting<Integer> sorter = new InsertionSort();
        sorter.sort(numbers);

        for (int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i));
            System.out.print(i < numbers.size() - 1 ? " " : "");
        }

        scanner.close();
    }
}