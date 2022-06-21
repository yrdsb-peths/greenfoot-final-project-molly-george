import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class will tell the player the basic instruction
 * 
 * @author George && Molly
 * @version June 
 */
public class Instructions extends World
{
    NextLabel3 next3 = new NextLabel3();
    
    public Instructions()
    {    
        // Create a new world with 900x506 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        
        setBackground(new GreenfootImage("in.png"));
        
        addObject(next3, 730, 430);
    }
}
