import greenfoot.*;
import java.awt.Font; 
//import java.awt.Color;


/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Scores
{   int speed = 4;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int score = getWorld().getObjects(Player.class).get(0).Score();
        Color color = new Color (0,0,0,0);
        setImage(new GreenfootImage("Score: " + score, 48,Color.BLUE,color));
    }    
}
