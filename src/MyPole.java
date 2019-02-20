
import figury.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import static java.lang.Math.*;

public class MyPole extends JFrame implements ActionListener {

    private JLabel lblNazwaPole;
    private JLabel lbla;
    private JLabel lblb;
    private JLabel lblc;
    private JLabel lblWynikPole;
    private JTextField txta, txtb, txtc;
    private JButton buttonObliczPole;
    private JButton buttonPoleKWA, buttonPolePRO, buttonPoleKOL, buttonPoleROW, buttonPoleTRA, buttonPoleTRO;

    private double a, b, c;
    private String pole;
    private int nrFigury;

    public MyPole() {

        super("Pola figur płaskich");
        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(300,200);
        setResizable(false);

        setSize(1000,315);
        setLayout(null);

        lbla = new JLabel("");
        lbla.setBounds(50, 60, 200, 20);
        add(lbla);
        lbla.setVisible(false);

        lblb = new JLabel("");
        lblb.setBounds(50, 100, 200, 20);
        add(lblb);
        lblb.setVisible(false);

        lblc = new JLabel("");
        lblc.setBounds(50, 140, 200, 20);
        add(lblc);
        lblc.setVisible(false);

        lblNazwaPole = new JLabel("Pole figury:");
        lblNazwaPole.setBounds(50, 200, 100, 20);
        add(lblNazwaPole);
        lblNazwaPole.setVisible(false);

        txta = new JTextField("");
        txta.setBounds(300, 60, 50, 20);
        txta.setVisible(false);
        add(txta);
        txta.addActionListener(this);

        txtb = new JTextField("");
        txtb.setBounds(300, 100, 50, 20);
        add(txtb);
        txtb.setVisible(false);

        txtc = new JTextField("");
        txtc.setBounds(300, 140, 50, 20);
        add(txtc);
        txtc.setVisible(false);

        lblWynikPole = new JLabel("");
        lblWynikPole.setBounds(300, 200, 100, 20);
        add(lblWynikPole);
        lblWynikPole.setVisible(false);

        buttonObliczPole = new JButton("Oblicz pole");
        buttonObliczPole.setBounds(830, 250, 150, 20);
        add(buttonObliczPole);
        buttonObliczPole.addActionListener(this);
        buttonObliczPole.setVisible(false);

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

    }

    private void ukryjAll(){
        lblNazwaPole.setVisible(false);
        lbla.setVisible(false);
        lblb.setVisible(false);
        lblc.setVisible(false);
        lblWynikPole.setVisible(false);
        lblWynikPole.setText("");
        txta.setVisible(false);
        txta.setText("");
        txtb.setVisible(false);
        txtb.setText("");
        txtc.setVisible(false);
        txtc.setText("");
        buttonObliczPole.setVisible(false);

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source==buttonPoleKWA || source==buttonPoleKOL) {
            ukryjAll();
            lbla.setText("Bok kwadratu:");
            lbla.setVisible(true);
            txta.setVisible(true);
            buttonObliczPole.setVisible(true);
            if (source==buttonPoleKWA) nrFigury = 1;
            else nrFigury = 3;

        }else if(source==buttonPolePRO || source==buttonPoleROW) {
            ukryjAll();
            lbla.setText("Pierwszy bok prostokąta:");
            lbla.setVisible(true);
            txta.setVisible(true);
            lblb.setText("Drugi bok prostokąta:");
            lblb.setVisible(true);
            txtb.setVisible(true);
            buttonObliczPole.setVisible(true);
            if (source==buttonPolePRO) nrFigury = 2;
            else nrFigury = 4;

        } else if (source==buttonPoleTRA) {
            ukryjAll();
            lbla.setText("Pierwsza podstawa trapezu:");
            lbla.setVisible(true);
            txta.setVisible(true);
            lblb.setText("Druga podstawa trapezu:");
            lblb.setVisible(true);
            txtb.setVisible(true);
            lblc.setText("Wysokość trapezu:");
            lblc.setVisible(true);
            txtc.setVisible(true);
            buttonObliczPole.setVisible(true);
            nrFigury = 5;

        } else if (source==buttonPoleTRO) {
            ukryjAll();
            lbla.setText("Podstawa trójkąta:");
            lbla.setVisible(true);
            txta.setVisible(true);
            lblb.setText("Wysokość trójkąta:");
            lblb.setVisible(true);
            txtb.setVisible(true);
            buttonObliczPole.setVisible(true);
            nrFigury = 6;

        } else {
            zachowanieNaObliczPole();
            lblWynikPole.setText(pole);
        }

    }

    private void zachowanieNaObliczPole(){
        lblNazwaPole.setVisible(true);
        lblWynikPole.setVisible(true);
        Figura figura = null;
        switch (nrFigury){
            case 1:
            case 3: {
                a = Double.parseDouble(txta.getText());
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
                a = Double.parseDouble(txta.getText());
                b = Double.parseDouble(txtb.getText());
                if (nrFigury == 6) {
                    figura = new Trojkat(a, b);
                }
                else {
                    figura = new Prostokat(a, b);
                }
                break;

            }
            case 5: {
                a = Double.parseDouble(txta.getText());
                b = Double.parseDouble(txtb.getText());
                c = Double.parseDouble(txtc.getText());
                figura = new Trapez(a, b, c);
                break;

            }
            default: {
                break;
            }

        }
        figura.obliczPole();
        pole = figura.getPole();
    }

}