import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapThirdLevel extends World
{
    Ninetales n = new Ninetales();
    
    public MapThirdLevel()
    {    
        super(1280, 720, 1); 
        
        addObject(n, 300, 250);
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
