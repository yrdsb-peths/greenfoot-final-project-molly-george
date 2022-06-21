import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * final map let the player go to the final level
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Map3 extends World
{
    public Ninetales n = new Ninetales();
    Arrow a =  new Arrow();
    
    public Map3()
    {    
        // Create a new world with 900x506 cells with a cell size of 1x1 pixels.
        super(900, 506, 1);
        setBackground("pokemon map 1.jpg");
        addObject(n, 640, 150);
        addObject(a, 640, 60);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(n))
        {
            Store3 s3 = new Store3();
            Greenfoot.setWorld(s3);
        }
    }
}
