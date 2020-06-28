import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private GreenfootImage walkr01 = new GreenfootImage("p1_walk01.png");
    private GreenfootImage walkr02 = new GreenfootImage("p1_walk02.png");
    private GreenfootImage walkr03 = new GreenfootImage("p1_walk03.png");
    private GreenfootImage walkr04= new GreenfootImage("p1_walk04.png");
    private GreenfootImage walkr05= new GreenfootImage("p1_walk05.png");
    private GreenfootImage walkr06= new GreenfootImage("p1_walk06.png");
    private GreenfootImage walkr07= new GreenfootImage("p1_walk07.png");
    private GreenfootImage walkr08= new GreenfootImage("p1_walk08.png");
    private GreenfootImage walkr09= new GreenfootImage("p1_walk09.png");
    private GreenfootImage walkr10= new GreenfootImage("p1_walk10.png");
    private GreenfootImage walkr11= new GreenfootImage("p1_walk11.png");
    private GreenfootImage walkl01 = new GreenfootImage("p1_walk01L.png");
    private GreenfootImage walkl02 = new GreenfootImage("p1_walk02L.png");
    private GreenfootImage walkl03 = new GreenfootImage("p1_walk03L.png");
    private GreenfootImage walkl04= new GreenfootImage("p1_walk04L.png");
    private GreenfootImage walkl05= new GreenfootImage("p1_walk05L.png");
    private GreenfootImage walkl06= new GreenfootImage("p1_walk06L.png");
    private GreenfootImage walkl07= new GreenfootImage("p1_walk07L.png");
    private GreenfootImage walkl08= new GreenfootImage("p1_walk08L.png");
    private GreenfootImage walkl09= new GreenfootImage("p1_walk09L.png");
    private GreenfootImage walkl10= new GreenfootImage("p1_walk10L.png");
    private GreenfootImage walkl11= new GreenfootImage("p1_walk11L.png");
    private int direction = 1;
    private int frame = 1;  
    private int speed = 4;
    private int animationCounter = 0;
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping;
    private int jumpStrength = 16;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        checkKey();
        checkFall();
        checkBottomEdge();
        animationCounter++;
    }
    public void checkKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            direction = 1;
            moveRight();
        }
        if(Greenfoot.isKeyDown("left"))
        {
            direction = -1;
            moveLeft();
        }
        if(Greenfoot.isKeyDown("up") && jumping == false)
        {
            jump();
        }
    }
        public void moveRight()
    {
        setLocation(getX()+speed, getY());
        if(animationCounter % 4 == 0)
        {
            animateRight();
        }
    }

    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(walkr01);
        }
        else if(frame == 2)
        {
            setImage(walkr02);
        }
        else if(frame == 3)
        {
            setImage(walkr03);
        }
        else if(frame == 4)
        {
            setImage(walkr04);
        }
        else if(frame == 5)
        {
            setImage(walkr05);
        }
        else if(frame == 6)
        {
            setImage(walkr06);
        }
        else if(frame == 7)
        {
            setImage(walkr07);
        }
        else if(frame == 8)
        {
            setImage(walkr08);
        }
        else if(frame == 9)
        {
            setImage(walkr09);
        }
        else if(frame == 10)
        {
            setImage(walkr10);
        }
        else if(frame == 11)
        {
            setImage(walkr11);
            frame = 1;
            return;
        }
        frame++;
    }
    public void moveLeft()
    {
        setLocation(getX()-speed, getY());
        if(animationCounter %4 == 0)
        {
            animateLeft();
        }
    }

    public void animateLeft()
    {
        if(frame == 1)
        {
            setImage(walkl01);
        }
        else if(frame == 2)
        {
            setImage(walkl02);
        }
        else if(frame == 3)
        {
            setImage(walkl03);
        }
        else if(frame == 4)
        {
            setImage(walkl04);
        }
        else if(frame == 5)
        {
            setImage(walkl05);
        }
        else if(frame == 6)
        {
            setImage(walkl06);
        }
        else if(frame == 7)
        {
            setImage(walkl07);
        }
        else if(frame == 8)
        {
            setImage(walkl08);
        }
        else if(frame == 9)
        {
            setImage(walkl09);
        }
        else if(frame == 10)
        {
            setImage(walkl10);
        }
        else if(frame == 11)
        {
            setImage(walkl11);
            frame = 1;
            return;
        }
        frame++;
    }
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else 
        {
            fall();
        }
    }
    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platforms.class);
        if(ground == null)
        {
            jumping = true;
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
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }
    public void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
        jumping = true;
    }
    public void checkBottomEdge()
    {
        if (getY() == 1080)
            {
                Greenfoot.stop();
            }
    }
}
