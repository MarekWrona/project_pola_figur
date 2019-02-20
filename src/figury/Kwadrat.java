package figury;

import static java.lang.Math.pow;

public class Kwadrat extends Figura {

    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public void obliczPole() {
        double pole = pow(bok,2);
        super.setPole(pole);
    }

}
