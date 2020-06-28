import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends World
{
    String[] map;
    private Background img0, img1;
    /**
     * Constructor for objects of class Levels.
     * 
     */
    public Levels()
    {    
        super(1920, 1080, 1); 
        SetFields();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "psmc".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Player();
                if (kind == 1) actor = new Stone();
                if (kind == 2) actor = new Stone_Mid();
                if (kind == 3) actor = new Coin();
                /*if (kind == 4) actor = new Monster();
                if (kind == 5) actor = new Door();
                if (kind == 6) actor = new Key();
                if (kind == 7) actor = new Score();
                if (kind == 8) actor = new Floater();*/
                addObject(actor, 16+j*23, 16+i*32);
            }
        img0 = new Background();
        addObject(img0, getWidth()/2, getHeight()/2);
        img1 = new Background();
        addObject(img1, getWidth()+getWidth(), getHeight()/2);
        setPaintOrder (Platforms.class,Player.class, Collectables.class, Background.class);
        //prepare();
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("right")) {
            img0.scroll();
            img1.scroll();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            img0.scrollLeft();
            img1.scrollLeft();
        }
    }

    public void SetFields()
    { map = new String[] {   "                                                                                   ", 
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                                                                   ",
            "                                           m m m m m m m m                         ",
            "                                                                                   ",
            "     p                     m m m m m m                                             ",
            "                                                                                   ",
            "                                                                                   ",
            "m  m  m  m  m  m  m  m                                                            m",};
    }

    public void nextLevel()
    {

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootSound music = new GreenfootSound ("game.wav");
        music.play();
    }
   
}
