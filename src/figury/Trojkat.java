package figury;

public class Trojkat extends Figura {

    private double podstawa, wysokosc, bok1, bok2;

    public Trojkat(double podstawa, double wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    public Trojkat(double podstawa, double bok1, double bok2) {
        this.podstawa = podstawa;
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public void obliczPole() {
        double pole = podstawa * wysokosc /2;
        super.setPole(pole);
    }

    @Override
    public void obliczObwod() {
        double obwod = podstawa + bok1 + bok2;
        super.setObwod(obwod);
    }

}
