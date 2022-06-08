import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapSecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapSecondLevel extends World
{

    /**
     * Constructor for objects of class MapSecondLevel.
     * 
     */
    public MapSecondLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Store2 s = new Store2();
            Greenfoot.setWorld(s);
        }
    }
}
