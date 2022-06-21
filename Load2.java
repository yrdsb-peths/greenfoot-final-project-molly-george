import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * The class for the loading screen of second level
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Load2 extends World
{
    TransitionStartLabel g = new TransitionStartLabel();
    /**
     * Constructor for objects of class Load2.
     * 
     */
    public Load2()
    {    
        // Create a new world with 900x506 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        setBackground(new GreenfootImage("transitionlevel2.jpg"));
        g.clicki = false;
        
        addObject(g,450,400);
        
        Torchic.enemy = true;
    }
    
    public void act()
    {
        if(TransitionStartLabel.clicki == true)
        {
            Battle b = new Battle();
            Greenfoot.setWorld(b);
        }
    }
}
