import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class systemZamowien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer stolika: ");
        int numerStolika = scanner.nextInt();
        scanner.nextLine();

        List<String> dania = new ArrayList<>();
        String danie;

        System.out.println("Podaj nazwę dania (lub wpisz 'koniec', aby zakończyć dodawanie): ");
        while (true) {
            System.out.print("Danie: ");
            danie = scanner.nextLine();
            if (danie.equalsIgnoreCase("koniec")) {
                break;
            }
            dania.add(danie);
        }

        Zamowienie zamowienie = new Zamowienie(dania, numerStolika);

        ObslugaZamowienia przyjecie = new przyjecieZamowienia();
        ObslugaZamowienia przygotowanie = new przygotowanieZamowienia();
        ObslugaZamowienia dostarczenie = new dostarczenieZamowienia();

        przyjecie.ustawNastepny(przygotowanie);
        przygotowanie.ustawNastepny(dostarczenie);

        przyjecie.przetworzZamowienie(zamowienie);

        scanner.close();
    }
}