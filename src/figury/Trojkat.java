package figury;

public class Trojkat extends Figura {

    private double podstawa, wysokosc;

    public Trojkat(double podstawa, double wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    @Override
    public void obliczPole() {
        double pole = podstawa * wysokosc /2;
        super.setPole(pole);
    }

}
