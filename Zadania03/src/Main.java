void main() {
    Scanner scanner = new Scanner(System.in);
//    boolean isCorrectNum = false;
//    int number = 0;
//
//    while (!isCorrectNum) {
//        System.out.println("Podaj liczbe calkowita dodatnia: ");
//        number = scanner.nextInt();
//
//        if (number < 0) {
//            System.out.println("Podana liczba jest ujemna");
//        } else {
//            isCorrectNum = true;
//
//            if (number % 2 == 0) {
//                number--;
//            }
//        }
//
//        for (int i = 0; i < number; number = number - 2) {
//            System.out.println(number + " ");
//        }
//
//    }

    // zad 2

//    boolean isCorrectNum = false;
//    int number = 0;
//
//    while (!isCorrectNum) {
//        System.out.println("Podaj liczbe calkowita dodatnia: ");
//        number = scanner.nextInt();
//
//        if (number < 0) {
//            System.out.println("Podana liczba jest ujemna");
//        } else {
//            isCorrectNum = true;
//        }
//
//        for (int i = 0; Math.pow(2, i) <= number; i++) {
//            System.out.println(Math.pow(2, i));
//        }
//
//    }

//    zad 3

//    boolean isNotZero = false;
//    int num = 0;
//    int result = 0;
//
//    while (!isNotZero) {
//        System.out.println("Podaj liczbe: ");
//        num = scanner.nextInt();
//        result += num;
//
//        if (num == 0) {
//            System.out.println(result);
//            break;
//        }
//    }

    // zad 4

//    boolean isNotZero = false;
//    int num = 0;
//    int max = 0;
//    int min = 0;
//
//    while (!isNotZero) {
//        System.out.println("Podaj liczbe: ");
//        num = scanner.nextInt();
//        if (min > num) {
//            min = num;
//        }
//
//        if (max < num) {
//            max = num;
//        }
//        if (num == 0) {
//            System.out.println("Suma najwiekszej i najmniejszej: " + (max + min) + " Srednia tych dwoch liczb: " + ((max + min) / 2));
//            break;
//        }
//    }

    // zad 5

//    double randomNum = Math.ceil(Math.random() * 100 + 1);
//    int randomNumInt = (int) randomNum;
//    int userNum = 0;
//    boolean isCorrectNum = false;
//
//
//    while (!isCorrectNum) {
//        System.out.println("Podaj liczbe 1 - 100: ");
//        userNum = scanner.nextInt();
//
//        if (userNum == randomNumInt) {
//            System.out.println("Brawo!");
//            isCorrectNum = true;
//        } else {
//            System.out.println("Strzelaj dalej");
//        }
//    }

    // zad 6

//    String filling = "";
//    int sideA;
//    int sideB;
//
//    System.out.print("Znak wypelnienia prostokata: ");
//    filling = scanner.nextLine();
//    System.out.print("Dlugosc boku A prostokata: ");
//    sideA = scanner.nextInt();
//    System.out.print("Dlugosc boku B prostokata: ");
//    sideB = scanner.nextInt();
//
//    for (int i = 0; i < sideA; i++) {
//        for (int j = 0; j < sideB; j++) {
//                System.out.print(filling);
//            }
//        System.out.println();
//        }

    //zad 7

//    int treeLength;
//    int treeBranch = 1;
//
//    System.out.print("Podaj dlugosc choinki: ");
//    treeLength = scanner.nextInt();
//
//    for (int i = 0; i < treeLength; i++) {
//        for (int j = 0; j < treeBranch; j++) {
//            System.out.print("*");
//        }
//        treeBranch += 2;
//        System.out.println();
//    }

    //zad 8

//            System.out.print("Podaj liczbę: ");
//            int liczba = scanner.nextInt();
//
//            int silnia = 1;
//
//            for (int i = 1; i <= liczba; i++) {
//                silnia *= i;
//            }
//
//            System.out.println("Silnia wynosi: " + silnia);

    //zad 9


//            System.out.print("Podaj słowo: ");
//            String slowo = scanner.nextLine();
//
//            String odwrocone = new StringBuilder(slowo).reverse().toString();
//
//            if (slowo.equals(odwrocone)) {
//                System.out.println("To jest palindrom.");
//            } else {
//                System.out.println("To nie jest palindrom.");
//            }

//    Zadanie 10. Napisz program z dwoma pętlami (jedna zagnieżdżona w drugiej), każda z pętli powinna iterować od 1 do 10.
//
//    Pętla główna powinna pomijać swoje iteracje za pomocą instrukcji continue, gdy jej zmienna jest nieparzysta.
//            Pętla zagnieżdżona powinna wypisywać wartość swojej zmiennej.
//    Następnie, gdy zmienna pętli zagnieżdżonej jest większa od zmiennej pętli głównej, pętla zagnieżdżona powinna
//    spowodować, że przejdziemy do kolejnej iteracji pętli głównej (w tym przypadku skorzystaj z etykiety i instrukcji continue).

    for (int i = 1; i <= 10; i++) {
        if (i%2==1) {
            continue;
        }
        System.out.println("i = " + i);
        for (int j = 1; j <= 10; j++) {
            if (j > i) {
                continue;
            }
            System.out.println("j = " + j);
        }
    }


}