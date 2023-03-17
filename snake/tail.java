import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tail extends Actor
{
    /**
     * Act - do whatever the tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b;
    int count = 0;
    static int maxSize = 0;
    public tail(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0, 0, 40, 40);
    }
    public void act()
    {
        // Add your action code here.
        count ++;
        if(count > maxSize)
            getWorld().removeObject(this);
    }
}
