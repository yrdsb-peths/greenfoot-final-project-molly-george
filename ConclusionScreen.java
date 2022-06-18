import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConclusionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConclusionScreen extends World
{

    /**
     * Constructor for objects of class ConclusionScreen.
     * 
     */
    public ConclusionScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        setBackground(new GreenfootImage("conclusionscreen.jpg"));
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the label and add it to the world.
     */
    private void prepare()
    {
        ConclusionStatement1 conclusionStatement1 = new ConclusionStatement1();
        addObject(conclusionStatement1, 300, 70);
        
        ConStateI constateI = new ConStateI();
        addObject(constateI, 300, 150);
        
        ConStateii constateii = new ConStateii();
        addObject(constateii, 300, 250);
    }
}