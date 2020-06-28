import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndFlag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndFlag extends Collectables
{
    GreenfootImage img1 = new GreenfootImage ("flagRed.png");
    GreenfootImage img2 = new GreenfootImage ("flagRed2.png");
    private int imageCount = 2; 
    private int actsPerImage = 12; 
    private int animationActCounter = 0; 
    /**
     * Act - do whatever the EndFlag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EndFlag()
    {
        setImage(img1);
    }
    
    public void act() 
    {
       animationActCounter = (animationActCounter + 1) % (imageCount * actsPerImage); 
        if (animationActCounter % actsPerImage == 0) 
        {
            animate();
        }
        //checkcollision();
    }    
    public void animate()
    {
        if (getImage() == img1)
        {
            setImage(img2);
        }
        else if (getImage() == img2)
        {
            setImage(img1);
        }
    }
    // public void checkcollision()
    // {
        // Actor p = getOneIntersectingObject(Player.class);
        // if (p != null)
        // {
            // Greenfoot.setWorld(new YouWinScreen());
        // }
    // }
}
