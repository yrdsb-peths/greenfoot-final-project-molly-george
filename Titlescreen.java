import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titlescreen extends World
{

    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        setBackground(new GreenfootImage("pokemon titlescreen.jpg"));
        
        prepare();
        
    }
    
    private void prepare()
    {
        StartLabel startLabel = new StartLabel();
        addObject(startLabel, 200, 400);
    }
    
    
    public void act()
    {
    }
}
