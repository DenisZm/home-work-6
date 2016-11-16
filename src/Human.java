/**
 * Створити клас "Human", який зберігатиме інформацію про людину(ім'я, прізвище, вік),
 * а також матиме метод printInfo, який в консоль інформацію про людину.
 * В функції main створити об'єкт класу та заповнити його поля значенями,
 * після чого визвати метод printInfo.
 *
 * Created by Denis on 16.11.2016.
 */
public class Human {

    private String name;
    private String family;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("%-7s %s\n", "Name:", this.name);
        System.out.printf("%-7s %s\n", "Family:", this.family);
        System.out.printf("%-7s %s\n", "Age:", this.age);
    }
}
