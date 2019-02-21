
import figury.*;

public class MyObwod {

    private static double a=0, b=0, c=0, d=0;

    public static String obliczObwod(int nrFigury, MyFrame myFrame){
        myFrame.getLblNazwaPole().setVisible(true);
        myFrame.getLblWynikPole().setVisible(true);
        Figura figura = null;
        switch (nrFigury){
            case 1: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                figura = new Kwadrat(a);
                break;

            }
            case 2: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                b = Double.parseDouble(myFrame.getTxtb().getText());
                figura = new Prostokat(a, b);
                break;

            }
            case 3: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                figura = new Kolo(a);
                break;

            }
            case 4: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                b = Double.parseDouble(myFrame.getTxtb().getText());
                figura = new Rownoleglobok(a, b);
                break;

            }
            case 5: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                b = Double.parseDouble(myFrame.getTxtb().getText());
                c = Double.parseDouble(myFrame.getTxtc().getText());
                d = Double.parseDouble(myFrame.getTxtd().getText());
                figura = new Trapez(a, b, c, d);
                break;

            }
            case 6: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                b = Double.parseDouble(myFrame.getTxtb().getText());
                c = Double.parseDouble(myFrame.getTxtc().getText());
                figura = new Trojkat(a, b, c);
                break;

            }
            default: {
                break;
            }

        }
        figura.obliczObwod();
        return figura.getObwod();
    }

}
