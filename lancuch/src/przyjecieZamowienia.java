import java.util.List;

public class przyjecieZamowienia implements ObslugaZamowienia {
    private ObslugaZamowienia nastepny;

    @Override
    public void ustawNastepny(ObslugaZamowienia nastepny) {
        this.nastepny = nastepny;
    }

    @Override
    public void przetworzZamowienie(Zamowienie zamowienie) {
        zamowienie.ustawStatus("Przyjęte");
        System.out.println("Przyjęto zamówienie dla stolika " + zamowienie.pobierzNumerStolika() + ": ");
        for (String danie : zamowienie.pobierzDania()) {
            System.out.println(" - " + danie);
        }
        if (nastepny != null) {
            nastepny.przetworzZamowienie(zamowienie);
        }
    }
}
