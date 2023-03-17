import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, player;
    public static int speed = 3;
    int count = 0;

    public player(int player, int r, int g, int b)
    {
        setRotation(270);
        this.r = r;
        this.g = g;
        this.b = b;
        this.player = player;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0, 0, 40, 40);
    }
    
    public void act()
    {
        // Add your action code here
        count++;
        getWorld().addObject(new body(r,g,b), getX(), getY());
        
        move(speed);
        movemant();
        eating();
        if (isTouching(tail.class) || isTouching(wall.class))
        {
            getWorld().addObject(new gameOver(), 350, 50);
            tail.maxSize = 0;
            Greenfoot.stop();
        }
    }
    
    
    public void movemant()
    {   
        if(this.player == 4)
        {
            if(Greenfoot.isKeyDown("d"))
                setRotation(0);
            if(Greenfoot.isKeyDown("a"))
                setRotation(180);
            if(Greenfoot.isKeyDown("w"))
                setRotation(270);
            if(Greenfoot.isKeyDown("s"))
                setRotation(90);
        }
    }
    
    public void eating()
    {
        MyWorld myWorld = (MyWorld) getWorld();
        
        if(isTouching(food.class) && player == 4)
        {
            myWorld.greenCounter.countSocre();
            tail.maxSize += 20;
            myWorld.addObject(new food(255, 0, 0), 
            MyWorld.getRandomNumber(20, (getWorld().getWidth()-20)), 
            MyWorld.getRandomNumber(20, (getWorld().getHeight()-20)));
        }
    }
}
