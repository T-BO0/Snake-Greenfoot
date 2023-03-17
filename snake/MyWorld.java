import greenfoot.*; 
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    player greenPlayer = new player(4,0,255,0);
    counter greenCounter = new counter();
    wall dwall = new wall(15, getHeight());
    wall awall = new wall(15, getHeight());
    wall swall = new wall(getWidth(),15);
    wall wwall = new wall(getWidth(),15);
    int count = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(greenPlayer, 150, 400);
        addObject(greenCounter, 50, 50);
        addObject(dwall, getWidth()-5, getHeight()/2);
        addObject(awall, getWidth()-(getWidth()-5), getHeight()/2);
        addObject(swall, getWidth()/2, getHeight()-5);
        addObject(wwall, getWidth()/2, getHeight()-(getHeight()-5));
    }
    
    public void act()
    {
       count++;
       if(count == 100)
       {
           addObject(new food(255, 0, 0), getRandomNumber(20, (getWidth()-20)),
           getRandomNumber(20, (getHeight()-20)));
       }
    }
    
    
    public static int getRandomNumber(int start, int end)
    {
        return start + Greenfoot.getRandomNumber(end-start);
    }
}
