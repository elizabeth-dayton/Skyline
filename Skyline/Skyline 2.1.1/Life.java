import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Scores
{
    GreenfootImage full = new GreenfootImage ("hud_heartFull.png");
    GreenfootImage half = new GreenfootImage ("hud_heartHalf.png");
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int life = getWorld().getObjects(Player.class).get(0).Life();
        if (life == 2)
        {
            setImage(full);
        }
        else if (life == 1)
        {
            setImage(half);
        }
    }    
}
