import figury.*;

//klasa odpowiedzialna za obliczanie pól
public class MyPole{

    private static double a, b, c;

    public static String obliczPole(int nrFigury, MyFrame myFrame){
        myFrame.getLblNazwaPole().setVisible(true);
        myFrame.getLblWynikPole().setVisible(true);
        Figura figura = null;
        try {
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
                    c = Double.parseDouble(myFrame.getTxtc().getText());
                    figura = new Trojkat(a, b);
                    break;

                }
                default: {
                    break;
                }

            }
            // gdy w pola tekstowe zostało wpisane coś i nie da się tego skonwertować do double
        } catch (Exception e) {
            a = 0;
            b = 0;
            c = 0;
            figura = new Kwadrat(a);
            myFrame.ukryjAll();
            myFrame.getLblKomentarz().setText("Wprowadź liczbę !");
            //myFrame.getLblKomentarz().setVisible(true);
            //MyFrame.ustawPustePole();
        }

        figura.obliczPole();
        return figura.getPole();
    }

}