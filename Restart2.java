import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart2 extends World
{

    GeneralInformation g = new GeneralInformation();
    
    public Restart2()
    {    
        super(900, 506, 1); 
        
        addObject(g, 800, 450);
        GeneralInformation.click = false;
    }
    
    public void act()
    {
        if(GeneralInformation.click == true)
        {
            Store2 b = new Store2();
            Greenfoot.setWorld(b);
        }
    }
}
