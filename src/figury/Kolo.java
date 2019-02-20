package figury;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Kolo extends Figura {

    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public void obliczPole() {
        double pole = PI*pow(promien,2);
        super.setPole(pole);
    }

}
