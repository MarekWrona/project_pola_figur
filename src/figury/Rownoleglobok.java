package figury;

public class Rownoleglobok extends Figura {

    private double podstawa, wysokosc, ramie;

    public Rownoleglobok(double podstawa, double wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    @Override
    public void obliczPole() {
        double pole = podstawa * wysokosc;
        super.setPole(pole);
    }

    @Override
    public void obliczObwod() {
        double obwod = 2*(podstawa + ramie);
        super.setObwod(obwod);
    }

}
