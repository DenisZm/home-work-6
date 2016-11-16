import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реалізувати клас, який називається Rectangle та містить дві властивості: width and height,
 * які мають тип даних double, а також метод getArea(), який повертає(return)
 * добуток ширини та висоти прямокутника.
 * В функції main створити об’єкт класу Rectangle, запросити у користувача його висоту і ширину
 * та записати їх у відповідні поля об’єкту, який створили. Вивести на консоль результат виклику
 * функції getArea.
 *
 * Created by Denis on 16.11.2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(getDoubleFromUser("Input rectangle width:"),
                                        getDoubleFromUser("Input rectangle height:"));
        System.out.println("Area of rectangle: " + rect1.getArea());
    }

    static double getDoubleFromUser(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            try {
                Scanner in = new Scanner(System.in);
                return in.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Please input number");
            }
        }
    }
}
