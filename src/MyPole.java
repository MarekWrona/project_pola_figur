import figury.*;

public class MyPole{

    private static double a, b, c;

    public static String obliczPole(int nrFigury, MyFrame myFrame){
        myFrame.getLblNazwaPole().setVisible(true);
        myFrame.getLblWynikPole().setVisible(true);
        Figura figura = null;
        switch (nrFigury){
            case 1:
            case 3: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                if (nrFigury == 1) {
                    figura = new Kwadrat(a);
                }
                else {
                    figura = new Kolo(a);
                }
                break;

            }
            case 2:
            case 4:
            case 6: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                b = Double.parseDouble(myFrame.getTxtb().getText());
                if (nrFigury == 6) {
                    figura = new Trojkat(a, b);
                }
                else {
                    figura = new Prostokat(a, b);
                }
                break;

            }
            case 5: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                b = Double.parseDouble(myFrame.getTxtb().getText());
                c = Double.parseDouble(myFrame.getTxtc().getText());
                figura = new Trapez(a, b, c);
                break;

            }
            default: {
                break;
            }

        }
        figura.obliczPole();
        return figura.getPole();
    }

}