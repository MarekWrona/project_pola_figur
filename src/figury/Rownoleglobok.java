package figury;

public class Rownoleglobok extends Figura {

    private double podstawa, wysokosc;

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
        double obwod = 2*(podstawa + wysokosc);
        super.setObwod(obwod);
    }

}
