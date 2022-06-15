import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalMap extends World
{
    public Ninetales n = new Ninetales();
    
    public FinalMap()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        
        addObject(n, 640, 150);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(n))
        {
            FinalStore f = new FinalStore();
            Greenfoot.setWorld(f);
        }
    }
}
