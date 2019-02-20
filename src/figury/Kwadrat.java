package figury;

import static java.lang.Math.pow;

public class Kwadrat extends Figura {

    private double a;

    public Kwadrat(double bok) {
        this.a = bok;
    }

    @Override
    public void obliczPole() {
        double pole = pow(a,2);
        super.setPole(pole);
    }

}
