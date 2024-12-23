package graphique;
import java.awt.*;
import javax.swing.*;
public class Board extends JPanel{
    int width;
    int height;

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Board(int x,int y)
    {
        super();
        this.setBackground(Color.black);
        this.setBounds(x*40,y*50,700,500);
        width = 700;
        height = 500;
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(0,0,width,height);
        g.setColor(Color.white);
        g.drawLine(0,height/2,width,height/2);
        
        this.setBackground(Color.black);
    }
}