import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transition1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Load1 extends World
{
    GeneralInformation g = new GeneralInformation();
    
    public Load1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        g.click = false;
        addObject(g,450,250);
        
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
