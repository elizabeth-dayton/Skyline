import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 1920x1080 cells with a cell size of 1x1 pixels.
        super(1920, 1080, 1);
        //Greenfoot.start();

        prepare();
    }

    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Levels());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TitleScreenText titlescreentext = new TitleScreenText();
        addObject(titlescreentext,763,842);
        titlescreentext.setLocation(743,466);
        titlescreentext.setLocation(764,466);
        titlescreentext.setLocation(761,837);
        titlescreentext.setLocation(748,883);
        titlescreentext.setLocation(740,883);
    }
}
