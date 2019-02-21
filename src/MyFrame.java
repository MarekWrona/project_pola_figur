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
    private JTextField txta, txtb, txtc, txtd;
    private JButton buttonObliczPole, buttonObliczObwod;
    private JButton buttonKWA, buttonPRO, buttonKOL, buttonROW, buttonTRA, buttonTRO;
    private int nrFigury, nrOblicz;

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

    public JButton getButtonKWA() {
        return buttonKWA;
    }

    public JButton getButtonPRO() {
        return buttonPRO;
    }

    public JButton getButtonKOL() {
        return buttonKOL;
    }

    public JButton getButtonROW() {
        return buttonROW;
    }

    public JButton getButtonTRA() {
        return buttonTRA;
    }

    public JButton getButtonTRO() {
        return buttonTRO;
    }

    public MyFrame() {

        super("Pola i obwody figur płaskich");
        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(300, 200);
        setResizable(false);

        setSize(1000, 340);
        setLayout(null);

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
        lblNazwaPole.setBounds(50, 240, 100, 20);
        add(lblNazwaPole);

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
        lblWynikPole.setBounds(300, 240, 100, 20);
        add(lblWynikPole);

        buttonObliczPole = new JButton("Oblicz pole");
        buttonObliczPole.setBounds(830, 280, 150, 20);
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
        buttonTRO.setBounds(830, 20, 150, 20);
        add(buttonTRO);
        buttonTRO.addActionListener(this);

        ukryjAll();
    }

    public void ukryjAll(){
        getLblNazwaPole().setVisible(false);
        getLbla().setVisible(false);
        getLblb().setVisible(false);
        getLblc().setVisible(false);
        getLbld().setVisible(false);
        getLblWynikPole().setVisible(false);
        getLblWynikPole().setText("");
        getTxta().setVisible(false);
        getTxta().setText("");
        getTxtb().setVisible(false);
        getTxtb().setText("");
        getTxtc().setVisible(false);
        getTxtc().setText("");
        getTxtd().setVisible(false);
        getTxtd().setText("");
        getButtonObliczPole().setVisible(false);
        getButtonObliczObwod().setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == buttonKWA) {
            ukryjAll();
            getLbla().setText("Bok kwadratu:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getButtonObliczPole().setVisible(true);
            getButtonObliczObwod().setVisible(true);
            nrFigury = 1;

        }else if (source == getButtonPRO()) {
            ukryjAll();
            getLbla().setText("Pierwszy bok prostokąta:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Drugi bok prostokąta:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            getButtonObliczPole().setVisible(true);
            getButtonObliczObwod().setVisible(true);
            nrFigury = 2;

        } else if(source == buttonKOL) {
            ukryjAll();
            getLbla().setText("Promień koła:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getButtonObliczPole().setVisible(true);
            getButtonObliczObwod().setVisible(true);
            nrFigury = 3;

        }else if (source == getButtonROW()) {
            ukryjAll();
            getLbla().setText("Bok równoległoboku:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Wysokość równoległoboku:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            getButtonObliczPole().setVisible(true);
            getButtonObliczObwod().setVisible(true);
            nrFigury = 4;

        } else if (source == getButtonTRA()) {
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
            getButtonObliczPole().setVisible(true);
            getButtonObliczObwod().setVisible(true);
            nrFigury = 5;

        } else if (source == getButtonTRO()) {
            ukryjAll();
            getLbla().setText("Podstawa trójkąta:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Wysokość trójkąta:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            getButtonObliczPole().setVisible(true);
            getButtonObliczObwod().setVisible(true);
            nrFigury = 6;

        } else if (source == getButtonObliczPole()){
            String pole = MyPole.obliczPole(nrFigury, this);
            getLblNazwaPole().setText("Pole figury:");
            getLblWynikPole().setText(pole);
            nrOblicz = 1;

        } else {
            String obwod = MyObwod.obliczObwod(nrFigury, this);
            getLblNazwaPole().setText("Obwód figury:");
            getLblWynikPole().setText(obwod);
            nrOblicz = 2;

        }

        switch (nrFigury) {
            case 4: {
                if (nrOblicz == 1){
                    getLblb().setText("Wysokość równoległoboku:");
                } else {
                    getLblb().setText("Ramię równoległoboku:");
                }
                break;
            }
            case 5: {
                if (nrOblicz == 1){
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
                if (nrOblicz == 1){
                    getLblb().setText("Wysokość trójkąta:");
                    getLblc().setVisible(false);
                    getLblc().setText("");
                    getTxtc().setVisible(false);
                    getTxtc().setText("0");
                } else {
                    getLblb().setText("Jeden bok trójkąta:");
                    getLblc().setText("Drugi bok trójkąta:");
                    getLblc().setVisible(true);
                    getTxtc().setVisible(true);
                }
                break;
            }
            default: {
                if (nrOblicz == 1) {
                    getLblNazwaPole().setText("Pole figury:");
                } else {
                    getLblNazwaPole().setText("Obwód figury:");
                }
                break;
            }
        }
    }
}

