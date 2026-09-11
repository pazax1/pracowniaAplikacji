//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Zad.1 Wyświetl w 3 kolejnych liniach trzy imiona: Ania, Bartek, Kasia.

    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");
            /* Zad.2 Zadeklaruj następujące zmienne:

    - przechowującą Twoje imie,

    - przechowującą Twój rok urodzenia,

            - przechowującą liczbę 0,66 */

    String imie = "Tomek";
    int rokUrodzenia = 2007;
    double liczba = 0.66;

    /* Zad.3 Wypisz na ekranie poniższe zdanie, gdzie informacje zawarte w znacznikach <> zastąpisz zmiennymi lub działaniami.

    Mam na imię <imie>, mam <obecny rok minus Twój rok urodzenia> lat  i będę pisać maturę za <zmienna 0,66> roku. */

    System.out.println("Mam na imię " + imie + " mam " + (2025 - 2007) + " lat i będę pisać maturę za " + liczba + " roku");

            // Zad.4 Stwórz zmienną o nazwie stopnie. Wczytaj od użytkownika informację dotyczącą temperatury na dworze - pamiętaj o tym, żeby przed wczytaniem
    //          danych wypisać w konsoli odpowiednią informację o tym dla użytkownika. Następnie napisz program służący do konwersji wartości temperatury podanej w stopniach Celsjusza
    //          na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0).

    double stopnie = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj temperature na dworzę (w mierze Celsjusza): ");

    stopnie = scanner.nextDouble();

    double konwersja = 1.8 * stopnie + 32.0;

    System.out.println("Jest " + konwersja + " stopni Fahrenheita");

    // Zad.5 Napisz program, który pobierze od użytkownika trzy boki trójkąta, policzy jego obwód i wypisze wynik na ekran.

            /* Zad.6 Napisz program, który wczyta od użytkownika trzy słowa i wypisze je w odwrotnej kolejności, niż podał je użytkownik, oddzielone przecinkami. Dla przykładu, gdy użytkownik poda:

    Ala
            ma
    kota
    To program powinien wypisać kota, ma, Ala */

    /* Zad.7 Napisz program, który wczyta od użytkownika jeden wyraz i wypisz liczbę znaków, z których się składa. Dla przykładu, dla podanego słowa nauka wypisze 5.

    Podpowiedź: Sprawdź w dokumentacji JavaDoc dla typu String jak dowiedzieć się z ile znaków składa się tekst przetrzymywany w zmiennej typu String: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html */

    /* Zad.8 Zmień poniższy kod, by wynik wypisany na ekran nie był liczbą zaokrągloną do całkowitej wartości, lecz zmienną rzeczywistą (z częścią ułamkową):

    int x = 5;
    int y = 2;
    double wynik = x / y;
    System.out.println(wynik); */

    // Zad.9 Napisz program, który pobierze od użytkownika słowo i wypisze je z małymi literami zamienionymi na wielkie. Skorzystaj z metody toUpperCase typu String.

    // Zad.10 Napisz program, który policzy pole koła o promieniu podanym przez użytkownika i wypisze wynik na ekran. Promień koła powinien być liczbą całkowitą – do jego przechowywania użyj zmiennej typu int.
}
