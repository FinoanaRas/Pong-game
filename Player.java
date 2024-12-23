package graphique;
import java.awt.*;
import javax.swing.*;
public class Player extends JPanel{
    int width;
    int height;
    int score;

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setScore(int s){
        score = s ;
    }

    public int getScore(){
        return score;
    }

    public Player(int x,int y)
    {
        super();
        this.setBackground(Color.getHSBColor(0,203,89));
        this.setBounds(x,y,80,20);
        width = 80;
        height = 20;
        this.setOpaque(true);
    }
}