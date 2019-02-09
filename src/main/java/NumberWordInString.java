import java.util.Scanner;

public class NumberWordInString {

    /*** определить количество слов в строке в Java */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();

        int count = 0;   // сount - счётчик      //Начальное количество слов равно 0

        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if (input.length() != 0) {
            count++;

            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + "слов");
    }
}