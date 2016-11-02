package client;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Toolkit;

public class Class1 extends Canvas {
    public Class1(GraphicsConfiguration graphicsConfiguration) {
        super(graphicsConfiguration);
    }

    public Class1() {
        super();
    }
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.BLUE);
                g2.fillOval(100, 100, 20,20);
                
                g2.setColor(Color.PINK);
                g2.fillRect(200, 200, 40, 40);
                
        g2.setColor(Color.BLACK);
        g2.drawRect(200, 200, 40, 40);
        liblikas1=Toolkit.getDefaultToolkit().getImage("ani_Butterfly1.gif");
                g2.drawImage(liblikas1, 300, 200, 70, 70, this);
    }
    
    Image liblikas1;
}
