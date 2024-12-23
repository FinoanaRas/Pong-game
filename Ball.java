package graphique;
import java.awt.*;
import javax.swing.*;
public class Ball extends JPanel{
    int x;
    int y;
    int addX = 1;
    int addY = -10;
    int state;
    Player[] joueurs;
    Score score;

    public void setState(int n){
        state = n;
    }
    public int getState(){
        return state;
    }

    public Ball(int givenX,int givenY,Fenetre f)
    {
        super();
        x = givenX;
        y = givenY;
        this.setBounds(x,y,20,20);
        this.setOpaque(false);
        state = 0;
        joueurs = f.getPlayers();
        score = f.getScorePanel();
    }

    public void passe()
    {   if(y+20>joueurs[1].getLocation().y)
        {
            if((x>joueurs[1].getLocation().x&&x<joueurs[1].getWidth()+joueurs[1].getLocation().x)||(x+20>joueurs[1].getLocation().x+20&&x<joueurs[1].getWidth()+joueurs[1].getLocation().x))
            {
                addY=-1*addY;
            }
        }else if(y<joueurs[0].getHeight()+joueurs[0].getLocation().y)
        {
            if((x>joueurs[0].getLocation().x&&x<joueurs[0].getWidth()+joueurs[0].getLocation().x)||(x+20>joueurs[0].getLocation().x+20&&x<joueurs[0].getWidth()+joueurs[0].getLocation().x))
            {
                addY=-1*addY;
            }
        }
        
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.white);
        g.fillOval(0,0,20,20);
        
        win();
        this.setLocation(x,y);


        /*if(x>720||x<40)
		{
            //((x==joueurs[0].getLocation().x+joueurs[0].getWidth()||x==joueurs[0].getLocation().x)&&y<joueurs[0].getLocation().y+joueurs[0].getHeight())||((x==joueurs[1].getLocation().x+joueurs[1].getWidth()||x==joueurs[1].getLocation().x)&&y+20==joueurs[1].getLocation().y)
			addX=-1*addX;
		}else if(y>530||y<50||(y<joueurs[0].getLocation().y+joueurs[0].getHeight()&&x<joueurs[0].getLocation().x+joueurs[0].getWidth()&&x>joueurs[0].getLocation().x)||(y+20>joueurs[1].getLocation().y&&x>joueurs[1].getLocation().x&&x<joueurs[1].getLocation().x+joueurs[1].getWidth())){
			addY=-1*addY;
		}*/
        
        
			
        if(this.state!=0)
        {
            passe();
            x=x+addX;
			y=y+addY;
            repaint();
        }
        
    }
    public void win()
    {
        try {
			Thread.sleep(30);
		    } catch (Exception e) {}
        if(y<50||((x>720||x<40)&&y<250+50))
        {
            x = joueurs[0].getLocation().x+(joueurs[0].getWidth()/2);
            y = joueurs[0].getLocation().y+joueurs[0].getHeight(); 
            joueurs[1].setScore(joueurs[1].getScore()+1);
            score.getPointLabel(1).setText(String.valueOf(joueurs[1].getScore()));
            System.out.println("2: "+joueurs[1].getScore());
            this.setState(0);
            addX = 1;
            addY = -10;
        }else if(y>530||((x>720||x<40)&&y>250+50))
        {
            x = joueurs[1].getLocation().x+(joueurs[1].getWidth()/2);
            y = joueurs[1].getLocation().y-20;
            joueurs[0].setScore(joueurs[0].getScore()+1);
            score.getPointLabel(0).setText(String.valueOf(joueurs[0].getScore()));
            System.out.println("1: "+joueurs[0].getScore());
            this.setState(0);
            addX = 1;
            addY = -10;
        }
    }
    public void moveBall(int gX, int gY)
    {
        addX=gX*addX;
        addY=gY*addY;
        repaint();
    }

}