import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Load2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Load2 extends World
{

    /**
     * Constructor for objects of class Load2.
     * 
     */
    public Load2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1);
    }
    
    public void act()
    {
        if(GeneralInformation.click)
        {
            Battle b = new Battle();
            Greenfoot.setWorld(b);
        }
    }
}
