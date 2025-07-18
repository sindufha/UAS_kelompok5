package kasir;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedPanel extends JPanel {
    private int radius;
  
    public void setRadius(int radius) {
    this.radius = radius;
    repaint();
    
}
    public RoundedPanel() {
        this(40); // panggil konstruktor utama dengan radius default
    }

    public RoundedPanel(int radius) {
        this.radius = radius;
        setOpaque(false);
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), radius, radius));
        super.paintComponent(g);
    }
}
