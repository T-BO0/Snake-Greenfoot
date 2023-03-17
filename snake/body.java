import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class body here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class body extends Actor
{
    /**
     * Act - do whatever the body wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b;
    int count = 0;
    public body(int r, int g, int b)
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
        count ++ ;
        if(count > 12)
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.addObject(new tail(r,g,b), getX(), getY());
            myWorld.removeObject(this);
            count = 0;
        }
    }
}
