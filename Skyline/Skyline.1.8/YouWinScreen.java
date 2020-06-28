import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWinScreen extends World
{
    GreenfootSound youWin = new GreenfootSound("youwin.wav");
    /**
     * Constructor for objects of class YouWinScreen.
     * 
     */
    public YouWinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        youWin.play();
        prepare();
    }


    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new TitleScreen());
        }  
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        YouWinText text = new YouWinText();
        addObject(text,650,387);
    }
}
