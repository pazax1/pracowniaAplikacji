import java.util.Scanner;

void main() {

    //zad 1

//    String[] array1 = new String[] {"poniedzialek", "wtorek", "sroda", "czwartek", "piatek"};
//    String[] array2 = new String[] {"styczen", "luty", "marzec", "kwiecien"};
//    int arrayLength;
//
//    if (array1.length < array2.length) {
//        arrayLength = array2.length;
//    } else {
//        arrayLength = array1.length;
//    }
//
//    for (int i = 0; i <= arrayLength; i+=2) {
//        System.out.println(array1[i]);
//        System.out.println(array2[i]);
//    }

    //zad 2


//    int[] array1 = new int[] {3, 6, 2, 9, 1, 5};
//    int max = 0;
//
//    for (int i = 0; i < array1.length; i++) {
//        if (array1[i] > max) {
//            max = array1[i];
//        }
//    }
//    System.out.println(max);

    //zad 3


//    String[] array1 = new String[] {"poniedzialek", "wtorek", "sroda", "czwartek", "piatek"};
//
//    for (int i = 0; i < array1.length; i++) {
//        System.out.println(array1[i].toUpperCase());
//    }

    //zad 4

    Scanner scanner = new Scanner(System.in);
//    String[] array1 = new String[5];
//    String arrayItem;
//    String arrayAtI;
//
//    for (int i = 0; i < 5; i++) {
//
//        System.out.println("Podaj wartosc do tabeli: ");
//
//        arrayItem = scanner.next();
//        array1[i] = arrayItem;
//
//    }
//
//    for (int i = 4; i >= 0; i--) {
//        arrayAtI = array1[i];
//        String reverse = new StringBuilder(arrayAtI).reverse().toString();
//        System.out.println(reverse);
//    }

//    Zadanie 5. Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie posortuje tą tablicę rosnąco i wypisze wynik
//    sortowania na ekran. Dla przykładu, dla liczb 10, -2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100. Zastanów się, jak
//    można posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie. Przetestuj je na różnych zestawach danych.

    int[] array1 = new int[8];
    int userInt;

    for (int i = 0; i < 8; i++) {
        System.out.println("Podaj liczbe: ");
        userInt = scanner.nextInt();
        array1[i] = userInt;
    }

    for (int i = 0; i < array1.length; i++) {
        for (int j = i + 1; j < array1.length; j++) {
            if (array1[i] < array1[j]) {
                array1[i] = array1[j];
            }
            System.out.println(array1[i]);
        }
    }
}

