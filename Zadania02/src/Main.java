//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Zadanie 1. Napisz program, który wczyta od użytkownika liczbę i wypisze, czy jest podzielna bez reszty przez 3. Skorzystaj z operatora reszty z dzielenia – jeżeli reszta z dzielenia
//    jest równa 0, to liczba jest podzielna przez 3.

    Scanner scanner = new Scanner(System.in);

//    int liczba ;
//
//    System.out.println("Podaj liczbe: ");
//
//    liczba = scanner.nextInt();
//
//    if (liczba % 3 == 0) {
//        System.out.println("Podzielna przez 3 bez reszty");
//    }
//
//    else {
//        System.out.println("Podzielna przez 3 z reszta");
//    }

//    Zadanie 2. Napisz program, który wczyta od użytkownika trzy liczby i odpowie na pytanie, czy można z nich zbudować trójkąt (suma każdych dwóch boków powinna być większa od trzeciego boku).

//    double bokA;
//    double bokB;
//    double bokC;
//
//    System.out.println("Podaj bok A: ");
//    bokA = scanner.nextDouble();
//    System.out.println("Podaj bok B: ");
//    bokB = scanner.nextDouble();
//    System.out.println("Podaj bok C: ");
//    bokC = scanner.nextDouble();
//
//    if (bokA + bokB > bokC || bokB + bokC > bokA || bokA + bokC > bokB) {
//        System.out.println("Mozna zrobic trojkat");
//    }
//
//    else {
//        System.out.println("Nie mozna zrobic trojkata");
//    }

//            Zadanie 3. Napisz program, który pobierze od użytkownika dwie liczby i wypisze największą z nich.

//    double l1;
//    double l2;
//
//    System.out.println("Liczba pierwsza: ");
//    l1 = scanner.nextDouble();
//    System.out.println("Liczba drugaa: ");
//    l2 = scanner.nextDouble();
//
//
//    if (l1 > l2) {
//        System.out.println("Wieksza jest " + l1);
//    }
//
//    else {
//        System.out.println("Wieksza jest " + l2);
//    }

//    Zadanie 4. Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.

//    double l1;
//    double l2;
//    double l3;
//
//    System.out.println("Liczba pierwsza: ");
//    l1 = scanner.nextDouble();
//    System.out.println("Liczba druga: ");
//    l2 = scanner.nextDouble();
//    System.out.println("Liczba trzecia: ");
//    l3 = scanner.nextDouble();
//
//    if (l1 > l2 && l1 > l3) {
//        System.out.println("Wieksza jest " + l1);
//    }
//
//    else if (l2 > l1 && l2 > l3) {
//        System.out.println("Wieksza jest " + l2);
//    }
//
//    else if (l3 > l1 && l3 > l2) {
//        System.out.println("Wieksza jest " + l3);
//    }
//
//    else {
//        System.out.println("Liczby sa rowne");
//    }

//    Zadanie 5. Napisz program, który pobierze od użytkownika numer miesiąca i wypisze jego nazwę, lub komunikat "Nieprawidlowy numer miesiaca", jeżeli podany numer będzie spoza zakresu
//    1..12. Skorzystaj z instrukcji switch.
    // int liczba;
    // String mies = "";

    // System.out.println("Podaj miesiac: ");
    // liczba = scanner.nextInt();

    // switch (liczba) {
    //     case 1:
    //         mies = "Styczen";
    //         break;
    //     case 2:
    //         mies = "Luty";
    //         break;
    //     case 3:
    //         mies = "Marzec";
    //         break;
    //     case 4:
    //         mies = "Kwiecien";
    //         break;
    //     case 5:
    //         mies = "Maj";
    //         break;
    //     case 6:
    //         mies = "Czerwiec";
    //         break;
    //     case 7:
    //         mies = "Lipiec";
    //         break;
    //     case 8:
    //         mies = "Sierpien";
    //         break;
    //     case 9:
    //         mies = "Wrzesien";
    //         break;
    //     case 10:
    //         mies = "Pazdziernik";
    //         break;
    //     case 11:
    //         mies = "Listopad";
    //         break;
    //     case 12:
    //         mies = "Grudzien";
    //         break;
    // }

    // System.out.println(mies);

//    Zadanie 6. Napisz program, który pobierze od użytkownika jego imię i odpowie na pytanie, czy jego imię jest takie samo, jak Twoje (załóżmy, że użytkownik podaje swoje imię bez polskich znaków).
//
//            Uwaga! Pamiętaj, aby skorzystać z metody equals typu String zamiast porównywać stringi za pomocą operatora == !

//    String mojeImie = "Tomek";
//
//    System.out.println("Podaj swoje imie: ");
//    String imieUzytkownika = scanner.nextLine();
//
//    if (imieUzytkownika.equals(mojeImie)) {
//        System.out.println("Twoje imie jest takie samo jak moje");
//    }
//
//    else {
//        System.out.println("Twoje imie jest inne niz moje");
//    }

//            Zadanie 7. Napisz program, który pobiera wiek od użytkownika. Zapisz w zmiennej typu boolean informację, czy użytkownik jest pełnoletni, czy nie. Skorzystaj z trój-argumentowego operatora warunkowego.
//            Wypisz wynik zdefiniowanej zmiennej typu boolean na ekran.

//    System.out.print("Podaj swoj wiek: ");
//    int wiek;
//    wiek = scanner.nextInt();
//    boolean jestPelnoletni = false;
//
//    if (wiek >= 18) {
//        jestPelnoletni = true;
//        System.out.println(jestPelnoletni);
//    }
//
//    else if (wiek < 18 && wiek > 0) {
//        jestPelnoletni = false;
//        System.out.println(jestPelnoletni);
//    }
//
//    else {
//        System.out.println("Nie mozesz byc mlodszy od 0");
//    }


//            Zadanie 8. Napisz program, który pobierze od użytkownika rok i odpowie na pytanie, czy podany rok jest rokiem przestępnym, czy nie. Wskazówka: rok jest rokiem przestępnym, jeżeli:
//
//    dzieli się przez 4 i nie dzieli się przez 100
//    lub
//
//    dzieli się przez 400.

//        int rok;
//
//    System.out.println("Podaj rok: ");
//
//    rok = scanner.nextInt();
//
//    if (rok % 4 == 0 && rok % 100 != 0) {
//        System.out.println("Rok jest przestepny");
//    }
//
//    else {
//        System.out.println("Rok nie jest przestepny");
//    }

//    Zadanie 9. Napisz program, który oblicza wartość współczynnika BMI (ang. body mass index) wg. wzoru: waga/wzrost^2. Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje "waga prawidłowa",
//    jeżeli poniżej to "niedowaga", jeżeli powyżej "nadwaga".

//    double waga;
//    double wzrost;
//    double bmi;
//
//    System.out.println("Podaj swoja wage: ");
//    waga = scanner.nextInt();
//    System.out.println("Podaj swoj wzrost: ");
//    wzrost = scanner.nextInt();
//
//    wzrost = wzrost/100;
//
//    bmi = waga/(wzrost*wzrost);
//
//    if (bmi < 18.5) {
//        System.out.println("Niedowaga");
//    }
//
//    else if (bmi > 24.9) {
//        System.out.println("Nadwaga");
//    }
//
//    else {
//        System.out.println("BMI w normie");
//    }

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

    double cenaTowaru = 0;
    int liczbaRat = 0;
    double kredyt;

    boolean dobraCena = false;
    boolean dobreRaty = false;

    while (!dobraCena) {
        System.out.println("Podaj cene towaru: ");
        cenaTowaru = scanner.nextDouble();
        if (cenaTowaru < 100 || cenaTowaru > 10000) {
            System.out.println("Nieprawidlowa cena towaru");
        }
        else {
            dobraCena = true;
        }

    }

    while (!dobreRaty) {
        System.out.println("Podaj ilosc rat: ");
        liczbaRat = scanner.nextInt();

        if (liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Zla ilosc rat");
        }
        else {
            dobreRaty = true;
        }
    }

    if (liczbaRat >= 6 || liczbaRat <= 12) {
        System.out.println(kredyt = (cenaTowaru + (cenaTowaru * 0.025)) / liczbaRat);
    }

    else if (liczbaRat >= 13 || liczbaRat <= 24) {
        System.out.println(kredyt = (cenaTowaru + (cenaTowaru * 0.05)) / liczbaRat);
    }

    else if (liczbaRat >= 25 || liczbaRat <=48) {
        System.out.println(kredyt = (cenaTowaru + (cenaTowaru * 0.1)) / liczbaRat);
    }

    else {
        System.out.println("Error");
    }


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
