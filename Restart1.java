import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart1 extends World
{

    GeneralInformation g = new GeneralInformation();
    
    public Restart1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        
        addObject(g, 800, 520);
        GeneralInformation.click = false;
    }
    
    public void act()
    {
        if(GeneralInformation.click == true)
        {
            Store1 b = new Store1();
            Greenfoot.setWorld(b);
        }
    }
}
