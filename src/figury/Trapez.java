package figury;

public class Trapez extends Figura {

    private double podstawa1, podstawa2, wysokosc, ramie1, ramie2;

    public Trapez(double podstawa1, double podstawa2, double wysokosc) {
        this.podstawa1 = podstawa1;
        this.podstawa2 = podstawa2;
        this.wysokosc = wysokosc;
    }

    public Trapez(double podstawa1, double podstawa2, double ramie1, double ramie2) {
        this.podstawa1 = podstawa1;
        this.podstawa2 = podstawa2;
        this.ramie1 = ramie1;
        this.ramie2 = ramie2;
    }

    @Override
    public void obliczPole() {
        double pole = (podstawa1 + podstawa2)* wysokosc /2;
        super.setPole(pole);
    }

    @Override
    public void obliczObwod() {
        double obwod = podstawa1 + podstawa2 + ramie1 + ramie2;
        super.setObwod(obwod);
    }

}
