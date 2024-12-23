package graphique;
import gameplay.*;
import listener.*;
import java.awt.*;
import javax.swing.*;
public class Fenetre extends JFrame{
    Board area;
    Player[] j;
    Ball b;
    Play game;
    Score score; 

    public Ball getBall(){
        return this.b;
    }
    public Player[] getPlayers(){
        return this.j;
    }
    public Player getPlayer(int indice){
        return this.j[indice];
    }
    public Board getBoard(){
        return this.area;
    }
    public Play getPlay(){
        return game; 
    }
    public Score getScorePanel(){
        return score;
    }


    public Fenetre()
    {
        super();
        game = new Play(this);
        area=new Board(1,1);
        j=new Player[2];
        j[0]=new Player(350,80);
        j[1]=new Player(350,500);
        score = new Score(area.getWidth()+50,(area.getHeight()/4)+50);
        b=new Ball(380,480,this);

        this.add(j[0]);
        this.add(j[1]);
        this.add(b);
        this.add(area);
        this.add(score);
        this.add(new JPanel());

        this.addKeyListener(new FlecheListener(this));

        this.setSize(1000,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}