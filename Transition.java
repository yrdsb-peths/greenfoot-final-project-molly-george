import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transition extends World
{

    /**
     * Constructor for objects of class Transition.
     * 
     */
    public Transition()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        
        setBackground(new GreenfootImage("islandfallingtransition.jpg"));
        
        prepare();
    }
    
    public void act()
    {
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the start label and add it to the world.
     */
    private void prepare()
    {
        NextLabel nextLabel = new NextLabel();
        addObject(nextLabel, 700, 430);
    }
}
