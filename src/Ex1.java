import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Написати програму, яка містить 3 функції: main, inputArray, outputArray.
 * Функції inputArray та outputArray, є процедурами, та приймають массив цілих чисел.
 * Функція inputArray, приймає масив цілих чисел, та запрошує користувача заповнити кожен з елементів масиву.
 * Функція outputArray, приймає масив, та виводить кожен з його елементів на екран.
 * Функція main, запитує у користувача число n, після чого створює масив розміром n,
 * та викликає функції inputArray та outputArray.
 *
 * Created by Denis on 16.11.2016.
 */
public class Ex1 {

    public static void main(String[] args) {
        int[] array = new int[getIntFromUser("Input array size:")];
        inputArray(array);
        outputArray(array);
    }

    static int[] inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String prompt = "Input element " + i + " :";
            arr[i] = getIntFromUser(prompt);
        }
        return arr;
    }

    static void outputArray(int[] arr) {
        for (int anArr: arr) {
            System.out.printf("%4d ", anArr);
        }
    }

    static int getIntFromUser(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            try {
                Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please input integer");
            }
        }
    }
}
