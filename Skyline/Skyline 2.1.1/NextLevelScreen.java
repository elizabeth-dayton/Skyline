import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevelScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevelScreen extends World
{
    GreenfootSound nextLevel = new GreenfootSound("nextlevel.wav");
    /**
     * Constructor for objects of class NextLevelScreen.
     * 
     */
    public NextLevelScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        nextLevel.play();
        prepare();
    }


    public void act() {
        if(Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Level_2());
        }  
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        NextLevelText nextleveltext = new NextLevelText();
        addObject(nextleveltext,677,322);
        nextleveltext.setLocation(676,310);
    }
}
