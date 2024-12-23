package graphique;
import java.awt.*;
import javax.swing.*;
public class Score extends JPanel{
    JLabel[] points;
    JPanel[] p;

    public JLabel getPointLabel(int i){
        return points[i];
    }

    public Score(int x, int y)
    {
        super();
        this.setBounds(x,y,100,250);
        points = new JLabel[2];
        points[0] = new JLabel("0");
        points[1] = new JLabel("0");
        p = new JPanel[2];

        for(int i=0;i<2;i++)
        {
            p[i] = new JPanel();
            p[i].setBackground(Color.getHSBColor(45,58,15));
            p[i].add(points[i]);
        }

        this.setLayout(new BorderLayout());        

        add(p[0],BorderLayout.NORTH);
        add(p[1],BorderLayout.SOUTH);
    }
}