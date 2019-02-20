package figury;

public class Trapez extends Figura {

    private double podstawa1, podstawa2, wysokosc;

    public Trapez(double podstawa1, double podstawa2, double wysokosc) {
        this.podstawa1 = podstawa1;
        this.podstawa2 = podstawa2;
        this.wysokosc = wysokosc;
    }

    @Override
    public void obliczPole() {
        double pole = (podstawa1 + podstawa2)* wysokosc /2;
        super.setPole(pole);
    }

}
