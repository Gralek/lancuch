public class dostarczenieZamowienia implements ObslugaZamowienia {
    private ObslugaZamowienia nastepny;

    @Override
    public void ustawNastepny(ObslugaZamowienia nastepny) {
        this.nastepny = nastepny;
    }

    @Override
    public void przetworzZamowienie(Zamowienie zamowienie) {
        zamowienie.ustawStatus("Dostarczone");
        System.out.println("Dostarczanie dania: " + zamowienie.pobierzDania() + " do stolika " + zamowienie.pobierzNumerStolika());
    }
}
