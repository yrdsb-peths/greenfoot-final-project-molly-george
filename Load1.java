import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transition1 here.
 * a start screen for level 1
 * 
 * @author Molly Wu
 * @version June 18, 2022
 */
public class Load1 extends World
{
    TransitionStartLabel g = new TransitionStartLabel();

    public Load1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        setBackground(new GreenfootImage("transitionlevel1.jpg"));
        g.clicki = false;
        
        addObject(g,450,400);
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
