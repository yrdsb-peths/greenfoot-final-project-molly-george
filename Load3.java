import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Load3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Load3 extends World
{
    GeneralInformation g = new GeneralInformation();
    /**
     * Constructor for objects of class Load3.
     * 
     */
    public Load3()
    {    
        super(900, 506, 1); 
        
        addObject(g, 800, 520);
    }
    
    public void act()
    {
        if(GeneralInformation.click == true)
        {
            Battle b = new Battle();
            Greenfoot.setWorld(b);
        }
    }
}
