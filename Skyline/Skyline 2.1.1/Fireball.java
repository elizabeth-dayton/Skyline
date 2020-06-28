import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    private int speed = 10;
    private GreenfootSound death = new GreenfootSound ("enemy_death.wav");
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       setLocation(getX() + speed, getY());
        destroyEnemies(); 
    } 
    public void destroyEnemies()
    {
        Actor enemy = getOneIntersectingObject(Slime.class);
        if(enemy != null)
        {
            getWorld().removeObject(enemy);
            death.setVolume(85);
            death.play();
            getWorld().removeObject(this);
        }
    }
}
