import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the actual first level that the player battles in.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{
    public double pikachuX = 650;
    public double pikachuY = 650;
    public double x = 650;
    public double y = 150;

    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public FirstLevel()
    {    
        
        super(1280, 720, 1); 
        
        Pikachu pikachu = new Pikachu();
        addObject(pikachu, (int)pikachuX, (int)pikachuY);
    }
}
