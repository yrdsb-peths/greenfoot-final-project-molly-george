import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class Titlescreen extends World
{

    /**
     * Constructor for objects of class Titlescreen.
     * create a title screen and add a start label that leads to the next stage of the game
     */
    public Titlescreen()
    {    
        // Create a new world with 853x480 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        setBackground(new GreenfootImage("Titlescreenn.jpg"));

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the start label and add it to the world.
     */
    private void prepare()
    {
        StartLabel startLabel = new StartLabel();
        addObject(startLabel, 200, 400);
    }
}
