/**
 * Створити клас "Human", який зберігатиме інформацію про людину(ім'я, прізвище, вік),
 * а також матиме метод printInfo, який в консоль інформацію про людину.
 * В функції main створити об'єкт класу та заповнити його поля значенями,
 * після чого визвати метод printInfo.
 *
 * Created by Denis on 16.11.2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        Human iAm = new Human();
        iAm.setName("Denis");
        iAm.setFamily("Zamosenchuk");
        iAm.setAge(41);

        iAm.printInfo();
    }
}
