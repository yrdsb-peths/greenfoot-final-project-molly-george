import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map2 extends World
{
    TorchicLogo t = new TorchicLogo();
    
    public Map2()
    {    
        super(900, 506, 1); 
        setBackground("pokemon map 1.jpg");
        addObject(t, 450, 180);
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
