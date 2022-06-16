import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map3 extends World
{
    public Ninetales n = new Ninetales();
    
    public Map3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1);
        
        addObject(n, 640, 150);
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
