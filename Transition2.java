import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transition2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transition2 extends World
{

    /**
     * Constructor for objects of class Transition2.
     * 
     */
    public Transition2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        
        setBackground(new GreenfootImage("forestfallingimage.jpg"));
        
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
        NextLabel2 nextLabel2 = new NextLabel2();
        addObject(nextLabel2, 700, 430);
    }
}
