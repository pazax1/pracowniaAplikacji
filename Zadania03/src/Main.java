//Zadanie 1. Napisz program, który pobiera od użytkownika liczbę całkowita dodatnia, a następnie wyświetla na ekranie kolejno wszystkie liczby nieparzyste nie większe
//od podanej liczby. Przykład: dla 15 program powinien wyświetlić: 1, 3, 5, 7, 9, 11, 13, 15.

void main() {
    Scanner scanner = new Scanner(System.in);
    boolean isCorrectNum = false;
    int number = 0;

    while (!isCorrectNum) {
        System.out.println("Podaj liczbe calkowita dodatnia: ");
        number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Podana liczba jest ujemna");
        } else {
            isCorrectNum = true;

            if (number % 2 == 0) {
                number--;
            }
        }

        for (int i = 0; i < number; number = number - 2) {
            System.out.println(number + " ");
        }

    }
}