import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the actual first level that the player battles in.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{
    public int pikachuX = 650;
    public int pikachuY = 650;
    

    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public FirstLevel()
    {    
        
        super(1280, 720, 1); 
        
        Pikachu pikachu = new Pikachu();
        addObject(pikachu, pikachuX, pikachuY);
    }
}
