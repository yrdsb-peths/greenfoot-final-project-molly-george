import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introscreen here.
 * 
 * @author Molly Wu 
 * @version June 2022
 */
public class IntroScreen extends World
{

    /**
     * Constructor for objects of class Introscreen.
     * 
     */
    public IntroScreen()
    {    
        // Create a new world with 853x480 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        
        setBackground(new GreenfootImage("intropageee.jpg"));
        IntroLine introLine = new IntroLine();
        addObject(introLine, 300, 50);
    }
}
