import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map2 extends World
{
    Torchic t = new Torchic();
    
    public Map2()
    {    
        super(900, 506, 1); 
        
        addObject(t, 300, 250);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(t))
        {
            Store2 s2 = new Store2();
            Greenfoot.setWorld(s2);
        }
    }
}
