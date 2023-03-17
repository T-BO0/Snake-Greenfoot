import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends Actor
{
    /**
     * Act - do whatever the gameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gameOver()
    {
        setImage(new GreenfootImage("game over",
        40, Color.RED, Color.BLACK));
    }
    
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("game over", 40, Color.RED, Color.BLACK));
        
    }
}
