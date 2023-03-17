import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actor
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public wall (int w, int h)
    {
        getImage().setColor(new Color(175, 175, 175));
        getImage().fillRect(0, 0, w, h);
        getImage().scale(w, h);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
