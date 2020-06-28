import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
     private int direction = -1;
    private int animationCounter = 0;
    private GreenfootImage img1 = new GreenfootImage("slimeWalk1.png");
    private GreenfootImage img2 = new GreenfootImage("slimeWalk2.png");
    /**
     * Act - do whatever the Slime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX() + direction * (1 + getImage().getWidth() / 2), getY());
        animate();
        onGround();
        if (getOneIntersectingObject(Platforms.class) == null)
        {
            direction = -direction;
            //GreenfootImage img = getImage();
            img1.mirrorHorizontally();
            img2.mirrorHorizontally();
            //setImage(img);
            setLocation(getX() + (2 + getImage().getWidth() / 2) * direction , getY());
      
        }
        else
        {
            setLocation(getX() - direction * getImage().getWidth() / 2, getY());
        }
      
            
    }
        public void animate() {
            if (animationCounter == 12) {
                setImage(img1);
    }
   if (animationCounter == 24) {
        setImage(img2);
        animationCounter = 0;
        return;
    }
    animationCounter++;

        } 
        public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platforms.class);
        if(ground == null)
        {
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }   
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = (ground.getY() - ((groundHeight + getImage().getHeight())/2)) + 2;
        setLocation(getX(), newY);
    }
}
