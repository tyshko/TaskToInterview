import java.util.Arrays;

public class MonetkaFalshiva {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 0, 1, 1, 1, 1, 1 };
        switch (measureBy3(arr)) {
            case 'e':
                print(measureBy1(Arrays.copyOfRange(arr, 6, 9)) + 6);
                break;
            case 'r':
                print(measureBy1(Arrays.copyOfRange(arr, 3, 6)) + 3);
                break;
            case 'l':
                print(measureBy1(Arrays.copyOfRange(arr, 0, 3)));
                break;
        }
    }

    static void print(int i) {
        System.out.println("False coin at index " + i);
    }

    static int measureBy1(int[] arr) {
        if (arr[0] == arr[1]) {
            return 2;
        } else if (arr[0] < arr[1]) {
            return 0;
        } else {
            return 1;
        }
    }

    static char measureBy3(int[] arr) {
        int left[] = Arrays.copyOf(arr, 3);
        int right[] = Arrays.copyOfRange(arr, 3, 6);
        if (getSumm(left) == getSumm(right)) {
            return 'e'; // равно
        } else if (getSumm(left) > getSumm(right)) {
            return 'r'; // левый тяжелее
        } else {
            return 'l'; // правый тяжелее
        }
    }

    static int getSumm(int[] arr) {
        int summ = 0;
        for (int i : arr)
            summ += i;
        return summ;
    }
}

/** Суть в тому що: Маємо 9 монеток, і ми ділимо на 3 частини, щоб знайти монетку яка хибна */