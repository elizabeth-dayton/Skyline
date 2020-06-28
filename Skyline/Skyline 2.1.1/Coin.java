import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Collectables
{
    GreenfootImage img1 = new GreenfootImage ("coin1.png");
    GreenfootImage img2 = new GreenfootImage ("coin2.png");
    GreenfootImage img3 = new GreenfootImage ("coin3.png");
    GreenfootImage img4 = new GreenfootImage ("coin4.png");
    GreenfootImage img5 = new GreenfootImage ("coin5.png");
    GreenfootImage img6 = new GreenfootImage ("coin6.png");
    GreenfootImage img7 = new GreenfootImage ("coin7.png");
    GreenfootImage img8 = new GreenfootImage ("coin8.png");
    private int imageCount = 8; 
    private int actsPerImage = 3; 
    private int animationActCounter = 0; 
    public Coin()
    {
        setImage(img1);
    }
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animationActCounter = (animationActCounter + 1) % (imageCount * actsPerImage); 
        if (animationActCounter % actsPerImage == 0) 
        {
            animate();
        }
    }    
    public void animate()
    {
        if (getImage() == img1)
        {
            setImage(img2);
        }
        else if (getImage() == img2)
        {
            setImage(img3);
        }
         else if (getImage() == img3)
        {
            setImage(img4);
        }
         else if (getImage() == img4)
        {
            setImage(img5);
        }
         else if (getImage() == img5)
        {
            setImage(img6);
        }
         else if (getImage() == img6)
        {
            setImage(img7);
        }
         else if (getImage() == img7)
        {
            setImage(img8);
        }
         else if (getImage() == img8)
        {
            setImage(img1);
        }
    }
}
