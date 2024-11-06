import java.util.List;

public class Zamowienie {
    private List<String> dania;
    private int numerStolika;
    private String status;

    public Zamowienie(List<String> dania, int numerStolika) {
        this.dania = dania;
        this.numerStolika = numerStolika;
        this.status = "Odebrane";
    }

    public List<String> pobierzDania() {
        return dania;
    }

    public int pobierzNumerStolika() {
        return numerStolika;
    }

    public String pobierzStatus() {
        return status;
    }

    public void ustawStatus(String status) {
        this.status = status;
    }
}
