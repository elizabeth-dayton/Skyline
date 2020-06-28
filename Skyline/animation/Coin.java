import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Collectables
{
    GreenfootImage ani1 = new GreenfootImage ("coin1");
    GreenfootImage ani2 = new GreenfootImage ("coin2");
    GreenfootImage ani3 = new GreenfootImage ("coin3");
    GreenfootImage ani4 = new GreenfootImage ("coin4");
    GreenfootImage ani5 = new GreenfootImage ("coin5");
    GreenfootImage ani6 = new GreenfootImage ("coin6");
    GreenfootImage ani7 = new GreenfootImage ("coin7");
    GreenfootImage ani8 = new GreenfootImage ("coin8");
    public Coin()
    {
 
    }
 
    public void act()
    {
        animation();
    }
 
    public void animation()
    {
        if(getImage() == ani1)
            setImage(ani2);
            else if(getImage() == ani2)
            setImage(ani3);
           else if(getImage() == ani3)
            setImage(ani4);
           else if(getImage() == ani4)
            setImage(ani5);
           else if(getImage() == ani5)
            setImage(ani6);
           else if(getImage() == ani6)
            setImage(ani7);
           else if(getImage() == ani7)
            setImage(ani8);
           else if(getImage() == ani8)
            setImage(ani1);
    }
}
