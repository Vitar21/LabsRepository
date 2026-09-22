import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static boolean skobka_valid(String str){
        if (str == null || str.isEmpty()){
            System.out.println("Ты Алёша???");
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char symbol : str.toCharArray()){
            if (symbol == '(' || symbol == '{' || symbol == '['){
                stack.push(symbol);
            }

            else if (symbol == ')' || symbol == '}' || symbol == ']'){
                if (stack.isEmpty()){
                    return false;
                }

                char top_element = stack.pop();

                if (symbol == ')' && top_element != '('){
                    return false;
                }
                if (symbol == '}' && top_element != '{'){
                    return false;
                }
                if (symbol == ']' && top_element != '[') {
                    return false;
                }
            }
            else{
                System.out.println("Неверный набор символов, Алёша");
                return false;
            }
        }
        return stack.isEmpty();
    }
    
    public static int remove_number(int[] arr, int value){
        int k = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != value){
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какую функцию вы хотите использовать?\n");
        System.out.println("1. Со скобками");
        System.out.println("2. С массивом");

        int variant = scanner.nextInt();
        scanner.nextLine();

        switch(variant){
            case 1:{
                System.out.println("Введите строку скобок\n");
                String str = scanner.nextLine();
                System.out.println(skobka_valid(str));
                break;
            }
            case 2:{
                System.out.println("Введите размер массива");
                int size = scanner.nextInt();
                int[] arr = new int[size];

                System.out.println("Введите " + size + " чисел");
                for (int i = 0; i < size; i++){
                    arr[i] = scanner.nextInt();
                }

                System.out.println("\nВаш массив: ");
                for (int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }

                System.out.println("\nВведите число val");
                int value = scanner.nextInt();

                int new_length = remove_number(arr, value);

                System.out.println("Новая длина - " + new_length);

                System.out.print("Новый массив:");
                for (int i = 0; i < new_length; i++){
                    System.out.print(arr[i] + " ");
                }

                System.out.print("\nПеределанный массив: ");
                for (int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }

                System.out.println();

                break;
            }
            default:{
                break;
            }
        }

        scanner.close();

    }


}
