package figury;

import java.text.DecimalFormat;

public abstract class Figura {

    private double pole, obwod;
    private String nazwaFigury;


    public String getPole() {
        //return Math.round(pole);
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(pole);
    }

    public String getObwod() {
        //return Math.round(obwod);
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(obwod);
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public void setNazwaFigury(String nazwaFigury) {
        this.nazwaFigury = nazwaFigury;
    }

    public abstract void obliczPole();

    public abstract void obliczObwod();

    public void wyswietlWynik(){
        System.out.println(nazwaFigury + " ma pole równe: " + getPole());
    }
}
