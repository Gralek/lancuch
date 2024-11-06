public class przygotowanieZamowienia implements ObslugaZamowienia {
    private ObslugaZamowienia nastepny;

    @Override
    public void ustawNastepny(ObslugaZamowienia nastepny) {
        this.nastepny = nastepny;
    }

    @Override
    public void przetworzZamowienie(Zamowienie zamowienie) {
        zamowienie.ustawStatus("W przygotowaniu");
        System.out.println("Przygotowywanie dania: " + zamowienie.pobierzDania() + " dla stolika " + zamowienie.pobierzNumerStolika());
        if (nastepny != null) {
            nastepny.przetworzZamowienie(zamowienie);
        }
    }
}
