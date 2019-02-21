package figury;

public class Prostokat extends Figura {

    private double bokA, bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public void obliczPole() {
        double pole = bokA * bokB;
        super.setPole(pole);
    }

    @Override
    public void obliczObwod() {
        double obwod = 2*(bokA + bokB);
        super.setObwod(obwod);
    }

}
