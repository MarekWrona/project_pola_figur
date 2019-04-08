import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//klasa odpowiedzialna za widok
public class MyFrame extends JFrame implements ActionListener {

    private JLabel lblNazwaPole;
    private JLabel lbla;
    private JLabel lblb;
    private JLabel lblc;
    private JLabel lbld;
    private JLabel lblWynikPole;
    private JLabel lblKomentarz;
    private JTextField txta;
    private JTextField txtb;
    private JTextField txtc;
    private JTextField txtd;
    private JButton buttonObliczPole, buttonObliczObwod;
    private JButton buttonKWA, buttonPRO, buttonKOL, buttonROW, buttonTRA, buttonTRO;
    private JPanel[] panel = new JPanel[7];
    private int nrFigury, wyborOpcjiObliczania;

    public JLabel getLblNazwaPole() {
        return lblNazwaPole;
    }

    public JLabel getLbla() {
        return lbla;
    }

    public JLabel getLblb() {
        return lblb;
    }

    public JLabel getLblc() {
        return lblc;
    }

    public JLabel getLbld() {
        return lbld;
    }

    public JLabel getLblWynikPole() {
        return lblWynikPole;
    }

    public JLabel getLblKomentarz() { return lblKomentarz; }

    public JTextField getTxta() {
        return txta;
    }

    public JTextField getTxtb() {
        return txtb;
    }

    public JTextField getTxtc() {
        return txtc;
    }

    public JTextField getTxtd() {
        return txtd;
    }

    public JButton getButtonObliczPole() {
        return buttonObliczPole;
    }

    public JButton getButtonObliczObwod() {
        return buttonObliczObwod;
    }

    Font font30 = new Font("Serif", Font.BOLD, 30);
    Font font24 = new Font("Serif", Font.BOLD, 24);

    public MyFrame() {

        super("Pola i obwody figur płaskich");

        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(300, 200);
        setResizable(false);

        setSize(990, 360);
        setLayout(null);

        for (int i=1; i<=6; i++) {
            panel[i] = new MyShape(i);
            panel[i].setBounds(650, 60, 300, 200);
            add(panel[i]);
            ((MyShape) panel[i]).paintComponent();
            add(panel[i]);
        }

        lbla = new JLabel("");
        lbla.setBounds(50, 60, 200, 20);
        add(lbla);

        lblb = new JLabel("");
        lblb.setBounds(50, 100, 200, 20);
        add(lblb);

        lblc = new JLabel("");
        lblc.setBounds(50, 140, 200, 20);
        add(lblc);

        lbld = new JLabel("");
        lbld.setBounds(50, 180, 200, 20);
        add(lbld);

        lblNazwaPole = new JLabel("Pole figury:");
        lblNazwaPole.setHorizontalAlignment(0);
        lblNazwaPole.setFont(font24);
        lblNazwaPole.setBounds(380, 120, 250, 40);
        add(lblNazwaPole);

        lblKomentarz = new JLabel("");
        lblKomentarz.setHorizontalAlignment(0);
        lblKomentarz.setFont(font30);
        lblKomentarz.setBounds(20, 260, 480, 40);
        add(lblKomentarz);

        txta = new JTextField("");
        txta.setBounds(300, 60, 50, 20);
        add(txta);
        txta.addActionListener(this);

        txtb = new JTextField("");
        txtb.setBounds(300, 100, 50, 20);
        add(txtb);

        txtc = new JTextField("");
        txtc.setBounds(300, 140, 50, 20);
        add(txtc);

        txtd = new JTextField("");
        txtd.setBounds(300, 180, 50, 20);
        add(txtd);

        lblWynikPole = new JLabel("");
        lblWynikPole.setHorizontalAlignment(0);
        lblWynikPole.setFont(font24);
        lblWynikPole.setBounds(380, 160, 250, 40);
        add(lblWynikPole);

        buttonObliczPole = new JButton("Oblicz pole");
        buttonObliczPole.setBounds(820, 280, 150, 20);
        add(buttonObliczPole);
        buttonObliczPole.addActionListener(this);

        buttonObliczObwod = new JButton("Oblicz obwód");
        buttonObliczObwod.setBounds(660, 280, 150, 20);
        add(buttonObliczObwod);
        buttonObliczObwod.addActionListener(this);

        buttonKWA = new JButton("Kwadrat");
        buttonKWA.setBounds(20, 20, 150, 20);
        add(buttonKWA);
        buttonKWA.addActionListener(this);

        buttonPRO = new JButton("Prostokąt");
        buttonPRO.setBounds(180, 20, 150, 20);
        add(buttonPRO);
        buttonPRO.addActionListener(this);

        buttonKOL = new JButton("Koło");
        buttonKOL.setBounds(340, 20, 150, 20);
        add(buttonKOL);
        buttonKOL.addActionListener(this);

        buttonROW = new JButton("Równoległobok");
        buttonROW.setBounds(500, 20, 150, 20);
        add(buttonROW);
        buttonROW.addActionListener(this);

        buttonTRA = new JButton("Trapez");
        buttonTRA.setBounds(660, 20, 150, 20);
        add(buttonTRA);
        buttonTRA.addActionListener(this);

        buttonTRO = new JButton("Trójkąt");
        buttonTRO.setBounds(820, 20, 150, 20);
        add(buttonTRO);
        buttonTRO.addActionListener(this);

        ukryjAll();
    }

    // ukrywanie wszystkich pól na formatce
    public void ukryjAll(){
        lblNazwaPole.setVisible(false);
        lbla.setVisible(false);
        lblb.setVisible(false);
        lblc.setVisible(false);
        lbld.setVisible(false);
        lblWynikPole.setVisible(false);
        lblWynikPole.setText("");
        txta.setVisible(false);
        txta.setText("");
        txtb.setVisible(false);
        txtb.setText("");
        txtc.setVisible(false);
        txtc.setText("");
        txtd.setVisible(false);
        txtd.setText("");
        buttonObliczPole.setVisible(false);
        buttonObliczObwod.setVisible(false);
        for (int i=1; i<=6; i++) {
            panel[i].setVisible(false);
        }
    }

    //reakcja na naciśnięcie przyciaków
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == buttonKWA) {
            ukryjAll();
            getLbla().setText("Bok kwadratu:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            buttonObliczPole.setVisible(true);
            buttonObliczObwod.setVisible(true);
            getLblKomentarz().setText("KWADRAT");
            nrFigury = 1;

        }else if (source == buttonPRO) {
            ukryjAll();
            getLbla().setText("Pierwszy bok prostokąta:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Drugi bok prostokąta:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            buttonObliczPole.setVisible(true);
            buttonObliczObwod.setVisible(true);
            getLblKomentarz().setText("PROSTOKĄT");
            nrFigury = 2;

        } else if(source == buttonKOL) {
            ukryjAll();
            getLbla().setText("Promień koła:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            buttonObliczPole.setVisible(true);
            buttonObliczObwod.setVisible(true);
            getLblKomentarz().setText("KOŁO");
            nrFigury = 3;

        }else if (source == buttonROW) {
            ukryjAll();
            getLbla().setText("Bok równoległoboku:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Wysokość równoległoboku:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            getButtonObliczPole().setVisible(true);
            getButtonObliczObwod().setVisible(true);
            getLblKomentarz().setText("RÓWNOLEGŁOBOK");
            nrFigury = 4;

        } else if (source == buttonTRA) {
            ukryjAll();
            getLbla().setText("Pierwsza podstawa trapezu:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Druga podstawa trapezu:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            getLblc().setText("Wysokość trapezu:");
            getLblc().setVisible(true);
            getTxtc().setVisible(true);
            buttonObliczPole.setVisible(true);
            buttonObliczObwod.setVisible(true);
            getLblKomentarz().setText("TRAPEZ");
            nrFigury = 5;

        } else if (source == buttonTRO) {
            ukryjAll();
            getLbla().setText("Podstawa trójkąta:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Wysokość trójkąta:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            buttonObliczPole.setVisible(true);
            buttonObliczObwod.setVisible(true);
            getLblKomentarz().setText("TRÓJKĄT");
            nrFigury = 6;

        } else if (source == buttonObliczPole){
            getLblNazwaPole().setText("Pole figury:");
            wyborOpcjiObliczania = 1;
            String pole = MyPole.obliczPole(nrFigury, this);
            getLblWynikPole().setText(pole);

        } else if (source == buttonObliczObwod) {
            getLblNazwaPole().setText("Obwód figury:");
            wyborOpcjiObliczania = 2;
            String obwod = MyObwod.obliczObwod(nrFigury, this);
            getLblWynikPole().setText(obwod);

        }

        //Jeśli wybrane POLE lub OBWÓD wyświetlane są inne nazwy w Label i róąna liczba potrzebnych danych
        switch (nrFigury) {
            case 4: {
                if (wyborOpcjiObliczania == 1){
                    getLblb().setText("Wysokość równoległoboku:");
                } else {
                    getLblb().setText("Ramię równoległoboku:");
                }
                break;
            }
            case 5: {
                if (wyborOpcjiObliczania == 1){
                    getLblc().setText("Wysokość trapezu:");
                    getLbld().setVisible(false);
                    getLbld().setText("");
                    getTxtd().setVisible(false);
                    getTxtd().setText("0");
                } else {
                    getLblc().setText("Pierwsze ramię trapezu:");
                    getLbld().setText("Drugie ramię trapezu:");
                    getLbld().setVisible(true);
                    getTxtd().setVisible(true);
                }
                break;
            }
            case 6: {
                if (wyborOpcjiObliczania == 1){
                    getLblb().setText("Wysokość trójkąta:");
                    getLblc().setVisible(false);
                    getLblc().setText("");
                    getTxtc().setVisible(false);
                    getTxtc().setText("0");
                } else {
                    getLblb().setText("Jeden bok trójkąta:");
                    getTxtb().setText("");
                    getLblc().setText("Drugi bok trójkąta:");
                    getTxtc().setText("");
                    getLblc().setVisible(true);
                    getTxtc().setVisible(true);
                }
                break;
            }
            default: {
                if (wyborOpcjiObliczania == 1) {
                    getLblNazwaPole().setText("Pole figury:");
                } else {
                    getLblNazwaPole().setText("Obwód figury:");
                }
                break;
            }
        }
        panel[nrFigury].setVisible(true);
    }

}

