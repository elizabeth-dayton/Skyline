import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life2 extends Scores
{
    GreenfootImage full = new GreenfootImage ("hud_heartFull.png");
    GreenfootImage half = new GreenfootImage ("hud_heartHalf.png");
    /**
     * Act - do whatever the Life_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int life = getWorld().getObjects(Player.class).get(0).Life();
        if (life == 4)
        {
            setImage(full);
        }
        else if (life == 3)
        {
            setImage(half);
        }
        else if (life == 2)
        {
            getWorld().removeObject(this);
        }
    }    
}
