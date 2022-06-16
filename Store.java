import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store extends World
{

    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public Store()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
    }
    
    public void act()
    {
        
        if(Greenfoot.isKeyDown("space"))
        {
            Battle b = new Battle();
            Greenfoot.setWorld(b);
        }
    }
}
