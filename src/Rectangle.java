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
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        if (w <= 0 || h <= 0) {
            throw new ArithmeticException("Sides of rectangle can't be less or equal 0");
        } else {
            this.width = w;
            this.height = h;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
