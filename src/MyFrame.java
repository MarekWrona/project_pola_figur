import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JLabel lblNazwaPole;
    private JLabel lbla;
    private JLabel lblb;
    private JLabel lblc;
    private JLabel lblWynikPole;
    private JTextField txta, txtb, txtc;
    private JButton buttonObliczPole;
    private JButton buttonPoleKWA, buttonPolePRO, buttonPoleKOL, buttonPoleROW, buttonPoleTRA, buttonPoleTRO;
    private int nrFigury;

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

    public JButton getButtonObliczPole() {
        return buttonObliczPole;
    }

    public JButton getButtonPoleKWA() {
        return buttonPoleKWA;
    }

    public JButton getButtonPolePRO() {
        return buttonPolePRO;
    }

    public JButton getButtonPoleKOL() {
        return buttonPoleKOL;
    }

    public JButton getButtonPoleROW() {
        return buttonPoleROW;
    }

    public JButton getButtonPoleTRA() {
        return buttonPoleTRA;
    }

    public JButton getButtonPoleTRO() {
        return buttonPoleTRO;
    }

    public MyFrame() {

        super("Pola figur płaskich");
        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(300, 200);
        setResizable(false);

        setSize(1000, 315);
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

        lblNazwaPole = new JLabel("Pole figury:");
        lblNazwaPole.setBounds(50, 200, 100, 20);
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

        lblWynikPole = new JLabel("");
        lblWynikPole.setBounds(300, 200, 100, 20);
        add(lblWynikPole);

        buttonObliczPole = new JButton("Oblicz pole");
        buttonObliczPole.setBounds(830, 250, 150, 20);
        add(buttonObliczPole);
        buttonObliczPole.addActionListener(this);

        buttonPoleKWA = new JButton("Pole kwadratu");
        buttonPoleKWA.setBounds(20, 20, 150, 20);
        add(buttonPoleKWA);
        buttonPoleKWA.addActionListener(this);

        buttonPolePRO = new JButton("Pole prostokąta");
        buttonPolePRO.setBounds(180, 20, 150, 20);
        add(buttonPolePRO);
        buttonPolePRO.addActionListener(this);

        buttonPoleKOL = new JButton("Pole koła");
        buttonPoleKOL.setBounds(340, 20, 150, 20);
        add(buttonPoleKOL);
        buttonPoleKOL.addActionListener(this);

        buttonPoleROW = new JButton("Pole równoległoboku");
        buttonPoleROW.setBounds(500, 20, 150, 20);
        add(buttonPoleROW);
        buttonPoleROW.addActionListener(this);

        buttonPoleTRA = new JButton("Pole trapezu");
        buttonPoleTRA.setBounds(660, 20, 150, 20);
        add(buttonPoleTRA);
        buttonPoleTRA.addActionListener(this);

        buttonPoleTRO = new JButton("Pole trójkąta");
        buttonPoleTRO.setBounds(830, 20, 150, 20);
        add(buttonPoleTRO);
        buttonPoleTRO.addActionListener(this);

        ukryjAll();
    }

    public void ukryjAll(){
        getLblNazwaPole().setVisible(false);
        getLbla().setVisible(false);
        getLblb().setVisible(false);
        getLblc().setVisible(false);
        getLblWynikPole().setVisible(false);
        getLblWynikPole().setText("");
        getTxta().setVisible(false);
        getTxta().setText("");
        getTxtb().setVisible(false);
        getTxtb().setText("");
        getTxtc().setVisible(false);
        getTxtc().setText("");
        getButtonObliczPole().setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == buttonPoleKWA || source == buttonPoleKOL) {
            ukryjAll();
            lbla.setText("Bok kwadratu:");
            lbla.setVisible(true);
            getTxta().setVisible(true);
            getButtonObliczPole().setVisible(true);
            if (source == getButtonPoleKWA()) nrFigury = 1;
            else nrFigury = 3;

        } else if (source == getButtonPolePRO() || source == getButtonPoleROW()) {
            ukryjAll();
            getLbla().setText("Pierwszy bok prostokąta:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Drugi bok prostokąta:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            getButtonObliczPole().setVisible(true);
            if (source == getButtonPolePRO()) nrFigury = 2;
            else nrFigury = 4;

        } else if (source == getButtonPoleTRA()) {
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
            nrFigury = 5;

        } else if (source == getButtonPoleTRO()) {
            ukryjAll();
            getLbla().setText("Podstawa trójkąta:");
            getLbla().setVisible(true);
            getTxta().setVisible(true);
            getLblb().setText("Wysokość trójkąta:");
            getLblb().setVisible(true);
            getTxtb().setVisible(true);
            getButtonObliczPole().setVisible(true);
            nrFigury = 6;
        } else {
            String pole = MyPole.obliczPole(nrFigury, this);
            getLblWynikPole().setText(pole);
        }
    }
}

