import java.awt.*;
import java.awt.geom.*;

import javax.swing.JPanel;

public class MyShape extends JPanel {

    private int nrFigury;
    private JPanel paneKwadrat, paneKolo, paneRownoleglobok, paneTrapez, paneTrojkat, paneProstokat;
    Font font24 = new Font("Serif", Font.BOLD, 24);

    public void setNrFigury(int nrFigury) {
        this.nrFigury = nrFigury;
    }

    public MyShape(int nrFigury) {
        setOpaque(false);
        setNrFigury(nrFigury);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke grubaLinia = new BasicStroke(3.0f);
        g2d.setStroke(grubaLinia);
        g2d.setFont(font24);

        switch (nrFigury) {
            case 1: {
                g2d.setColor(Color.yellow);
                g2d.fillRect(60, 10, 180, 180);
                g2d.setColor(Color.BLACK);
                Rectangle2D rectangle = new Rectangle2D.Double(60, 10, 180, 180);
                g2d.draw(rectangle);
                g2d.drawString("a", 42, 100);
                g2d.drawString("a", 150, 180);
                break;
            }
            case 2: {
                g2d.setColor(Color.GREEN);
                g2d.fillRect(18, 10, 280, 180);
                g2d.setColor(Color.BLACK);
                Rectangle2D rectangle = new Rectangle2D.Double(18, 10, 280, 180);
                g2d.draw(rectangle);
                g2d.drawString("b", 0, 100);
                g2d.drawString("a", 155, 180);
                break;
            }
            case 3: {
                Color color2 = new Color(255, 0, 0);
                g2d.setColor(color2);
                g2d.fillOval(60, 10, 180, 180);
                g2d.setColor(Color.BLACK);
                Ellipse2D circle = new Ellipse2D.Double(60, 10, 180, 180);
                g2d.draw(circle);
                g2d.drawLine(60, 100, 150, 100);
                g2d.drawString("R", 105, 90);
                break;
            }
            case 4: {
                g2d.setColor(Color.BLUE);
                int[] x = {10, 60, 290, 240};
                int[] y = {190, 10, 10, 190};
                g2d.fillPolygon(x, y, 4);
                g2d.setColor(Color.BLACK);
                Polygon polygon = new Polygon(x, y, 4);
                g2d.draw(polygon);
                g2d.drawLine(60, 10, 60, 190);
                g2d.drawString("h", 65, 100);
                g2d.drawString("a", 125, 180);
                g2d.drawString("b", 18, 100);
                break;
            }
            case 5: {
                g2d.setColor(Color.PINK);
                int[] x = {10, 90, 210, 290};
                int[] y = {190, 10, 10, 190};
                g2d.fillPolygon(x, y, 4);
                g2d.setColor(Color.BLACK);
                Polygon polygon = new Polygon(x, y, 4);
                g2d.draw(polygon);
                g2d.drawLine(90, 10, 90, 190);
                g2d.drawString("h", 95, 100);
                g2d.drawString("a", 150, 180);
                g2d.drawString("b", 150, 35);
                g2d.drawString("c", 32, 100);
                g2d.drawString("d", 255, 100);
                break;
            }
            case 6: {
                g2d.setColor(Color.MAGENTA);
                int[] x = {10, 110, 290};
                int[] y = {190, 10, 190};
                g2d.fillPolygon(x, y, 3);
                g2d.setColor(Color.BLACK);
                Polygon polygon = new Polygon(x, y, 3);
                g2d.draw(polygon);
                g2d.drawLine(110, 10, 110, 190);
                g2d.drawString("h", 115, 100);
                g2d.drawString("a", 150, 180);
                g2d.drawString("b", 42, 100);
                g2d.drawString("c", 208, 100);
                break;
            }
                default: break;
        }

    }

    public void paintComponent() {
    }
}