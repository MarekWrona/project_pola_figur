import figury.*;

//klasa odpowiedzialna za obliczanie pól
public class MyPole{

    private static double a, b, c;

    public static String obliczPole(int nrFigury, MyFrame myFrame){
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
                figura = new Trapez(a, b, c);
                break;

            }
            case 6: {
                a = Double.parseDouble(myFrame.getTxta().getText());
                b = Double.parseDouble(myFrame.getTxtb().getText());
                figura = new Trojkat(a, b);
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