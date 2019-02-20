package figury;

import java.text.DecimalFormat;

public abstract class Figura {

    private double pole;
    private String nazwaFigury;


    public String getPole() {
        //return Math.round(pole);
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(pole);
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public void setNazwaFigury(String nazwaFigury) {
        this.nazwaFigury = nazwaFigury;
    }

    public abstract void obliczPole();


    public void wyswietlWynik(){
        System.out.println(nazwaFigury + " ma pole równe: " + getPole());
    }
}
