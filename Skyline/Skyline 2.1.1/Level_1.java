import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_1 extends World
{
    String[] map;
    public static final int WIDE = 1280;
    public static final int HIGH = 720;
    Scroller scroller;
    Actor scrollActor;
    /**
     * Constructor for objects of class Levels.
     * 
     */
    public Level_1()
    {    
        super(WIDE, HIGH , 1, false); 
        SetFields();
        GreenfootImage bg = new GreenfootImage ("city_long.png");
        int bgWide = bg. getWidth();
        int bgHigh = bg.getHeight();
        scroller = new Scroller(this, bg, bgWide, bgHigh);
        scrollActor = new Player(0, 4);
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "psmcthlgfa".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = scrollActor;
                if (kind == 1) actor = new Stone();
                if (kind == 2) actor = new Stone_Mid();
                if (kind == 3) actor = new Coin();
                if (kind == 4) actor = new Score();
                if (kind == 5) actor = new Life();
                if (kind == 6) actor = new Life2();
                if (kind == 7) actor = new Star();
                if (kind == 8) actor = new Flag();
                if (kind == 9) actor = new Slime();
                addObject(actor, 16+j*23, 16+i*32);
            }
        setPaintOrder (Life.class,Life2.class,Score.class,Platforms.class,Slime.class,Collectables.class,Player.class);
        prepare();
    }
    public void act()
    {
        if (scrollActor != null)
        {
            scroll();
        }
    }

    public void SetFields()
    {  map = new String[] {   "                                                                                                                                                     ", 
            "    t                                                                                                                                                                  ",
            "                                                                                                                                                                       ",
            "  h  l                                                                                                                                                                 ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                         f             ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                     m m m m m         ",
            "                                                                                                                                            m m                        ",
            "                                                                                                                                     m                                 ",
            "                                                                                                                           m m m                                       ",
            "                                                                   c                              c                 m m                                                ",
            "                                                                   a                              a          m m                                                       ",
            "                                                               m m m m m                      m m m m m                                                                ",
            "                                                       m m                           m m m                                                                             ",
            "      p                                      m m m                           m m                                                                                       ",
            "                               m m m m m                                                                                                                               ",
            "                 m m m m m                                                                                                                                             ",
            " m m m m m m                                                                                                                                                           ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                                       ",
            "                                                                                                                                                                       ",};
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

    }
    private void scroll()
    {
        int loX = 400;
        int hiX = WIDE - 400;
        int loY = 50;
        int hiY = HIGH - 50;
        int dsx = 0, dsy = 0;
        if (scrollActor.getX() < loX) dsx = scrollActor.getX()-loX;
        if (scrollActor.getX() > hiX) dsx = scrollActor.getX()-hiX;
        if (scrollActor.getY() < loY) dsy = scrollActor.getY()-loY;
        if (scrollActor.getY() > hiY) dsy = scrollActor.getY()-hiY;
        scroller.scroll(dsx,dsy);
    }
}
