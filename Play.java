package gameplay;
import graphique.*;
import java.awt.*;
import javax.swing.*;
public class Play{
    Fenetre window;
    int ballX;
    int ballY;

    public Play(Fenetre f)
    {
        window = f;
        ballY = -1;
    }
    public void movePlayer(int numPlayer,int x){
        Player p = window.getPlayer(numPlayer);
        int newposX = p.getLocation().x+x;
        Board area = window.getBoard();
        int limitX = area.getWidth()+area.getLocation().x;

        if(newposX+p.getWidth()<limitX&&newposX>area.getLocation().x)
        {
            p.setLocation(p.getLocation().x+x,p.getLocation().y);
        }

        
    }
    
    
    



    
}