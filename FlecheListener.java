package listener;
import graphique.*;
import gameplay.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlecheListener implements KeyListener{
    Fenetre f;

    public FlecheListener(Fenetre window){
        f = window;
    }
     public void keyTyped(KeyEvent e)
    {

    }
    public void keyPressed(KeyEvent e)
    {
        Play g = new Play(f);
        if(f.getBall().getState()==0)
        {
            switch(e.getKeyCode()){
            case KeyEvent.VK_S:
                f.getBall().setState(1);
                f.getBall().moveBall(-1,-1);
                break;
            case KeyEvent.VK_D:
                f.getBall().setState(1);
                f.getBall().moveBall(1,-1);
                break;
            case KeyEvent.VK_LEFT:
                f.getBall().setState(2);
                f.getBall().moveBall(-1,1);
                break;
            case KeyEvent.VK_RIGHT:
                f.getBall().setState(2);
                f.getBall().moveBall(1,1);
                break;
            }
        }else{
            switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                g.movePlayer(1,-10);
                break;
            case KeyEvent.VK_RIGHT:
                g.movePlayer(1,10);
                break;
            case KeyEvent.VK_S:
                g.movePlayer(0,-10);
                break;
            case KeyEvent.VK_D:
                g.movePlayer(0,10);
                break;
            }
        }
            
        
        
        
          
    }
    public void keyReleased(KeyEvent e)
    {

    }
}