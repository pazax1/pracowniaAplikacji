//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Zadanie 1. Napisz program, który wczyta od użytkownika liczbę i wypisze, czy jest podzielna bez reszty przez 3. Skorzystaj z operatora reszty z dzielenia – jeżeli reszta z dzielenia
//    jest równa 0, to liczba jest podzielna przez 3.

    Scanner scanner = new Scanner(System.in);

    int liczba ;

    System.out.println("Podaj liczbe: ");

    liczba = scanner.nextInt();

    if (liczba % 3 == 0) {
        System.out.println("Podzielna przez 3 bez reszty");
    }

    else {
        System.out.println("Podzielna przez 3 z reszta");
    }

//    Zadanie 2. Napisz program, który wczyta od użytkownika trzy liczby i odpowie na pytanie, czy można z nich zbudować trójkąt (suma każdych dwóch boków powinna być większa od trzeciego boku).

//            Zadanie 3. Napisz program, który pobierze od użytkownika dwie liczby i wypisze największą z nich.

//    Zadanie 4. Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.

//    Zadanie 5. Napisz program, który pobierze od użytkownika numer miesiąca i wypisze jego nazwę, lub komunikat "Nieprawidlowy numer miesiaca", jeżeli podany numer będzie spoza zakresu 1..12. Skorzystaj z instrukcji switch.

//    Zadanie 6. Napisz program, który pobierze od użytkownika jego imię i odpowie na pytanie, czy jego imię jest takie samo, jak Twoje (załóżmy, że użytkownik podaje swoje imię bez polskich znaków).
//
//            Uwaga! Pamiętaj, aby skorzystać z metody equals typu String zamiast porównywać stringi za pomocą operatora == !

//            Zadanie 7. Napisz program, który pobiera wiek od użytkownika. Zapisz w zmiennej typu boolean informację, czy użytkownik jest pełnoletni, czy nie. Skorzystaj z trój-argumentowego operatora warunkowego. Wypisz wynik zdefiniowanej zmiennej typu boolean na ekran.

//            Zadanie 8. Napisz program, który pobierze od użytkownika rok i odpowie na pytanie, czy podany rok jest rokiem przestępnym, czy nie. Wskazówka: rok jest rokiem przestępnym, jeżeli:
//
//    dzieli się przez 4 i nie dzieli się przez 100
//    lub
//
//    dzieli się przez 400.
//    Zadanie 9. Napisz program, który oblicza wartość współczynnika BMI (ang. body mass index) wg. wzoru: waga/wzrost^2. Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje "waga prawidłowa", jeżeli poniżej to "niedowaga", jeżeli powyżej "nadwaga".

//            Zadanie 10. W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla programu są:
//
//    cena towaru (od 100 zł do 10 tyś. zł),
//    liczba rat (od 6 do 48).
//    Kredyt jest oprocentowany w zależności od liczby rat:
//
//    od 6–12 wynosi 2.5%,
//            od 13–24 wynosi 5%,
//            od 25–48 wynosi 10%.
//    Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w przypadku błędu pytać
//    prosić użytkownika ponownie o podanie danych.

//    Zadanie 11. Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędnego symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu operacji. Scenariusz działania programu:
//
//    a) Program wyświetla informację o swoim przeznaczeniu.
//
//    b) Wczytuje pierwszą liczbę.
//
//            c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//
//    d) Wczytuje drugą liczbę.
//
//            e) Wyświetla wynik lub w razie konieczności informację o niemożności wy konania działania.
}
